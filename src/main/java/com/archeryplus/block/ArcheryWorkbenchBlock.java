package com.archeryplus.block;

import com.mojang.serialization.MapCodec;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jspecify.annotations.Nullable;

/** Decorative 2 x 2 x 1 bench. Four block states share one visible model and one drop. */
public final class ArcheryWorkbenchBlock extends Block {
    public static final MapCodec<ArcheryWorkbenchBlock> CODEC = simpleCodec(ArcheryWorkbenchBlock::new);
    public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final EnumProperty<DoubleBlockHalf> HALF = BlockStateProperties.DOUBLE_BLOCK_HALF;
    public static final BooleanProperty RIGHT = BooleanProperty.create("right");
    private static final VoxelShape BASE = Block.box(0, 0, 0, 16, 14.3, 16);

    public ArcheryWorkbenchBlock(Properties properties) {
        super(properties);
        registerDefaultState(stateDefinition.any().setValue(FACING, Direction.NORTH)
                .setValue(HALF, DoubleBlockHalf.LOWER).setValue(RIGHT, false));
    }

    @Override
    public MapCodec<ArcheryWorkbenchBlock> codec() {
        return CODEC;
    }

    public static BlockPos origin(BlockPos pos, BlockState state) {
        BlockPos base = state.getValue(HALF) == DoubleBlockHalf.UPPER ? pos.below() : pos;
        return state.getValue(RIGHT) ? base.relative(state.getValue(FACING).getCounterClockWise()) : base;
    }

    public static List<BlockPos> positions(BlockPos origin, Direction facing) {
        BlockPos right = origin.relative(facing.getClockWise());
        return List.of(origin, right, origin.above(), right.above());
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        Level level = context.getLevel();
        BlockState state = defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
        List<BlockPos> parts = positions(context.getClickedPos(), state.getValue(FACING));
        for (int i = 0; i < parts.size(); i++) {
            BlockPos part = parts.get(i);
            BlockState partState = state.setValue(RIGHT, i % 2 == 1)
                    .setValue(HALF, i < 2 ? DoubleBlockHalf.LOWER : DoubleBlockHalf.UPPER);
            if (level.isOutsideBuildHeight(part) || !level.getWorldBorder().isWithinBounds(part)
                    || !level.getBlockState(part).canBeReplaced(context)
                    || !level.isUnobstructed(partState, part, CollisionContext.placementContext(context.getPlayer()))) {
                return null;
            }
        }
        return state.canSurvive(level, context.getClickedPos()) ? state : null;
    }

    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState state, @Nullable LivingEntity by, ItemStack stack) {
        List<BlockPos> parts = positions(pos, state.getValue(FACING));
        // Finish all four cells before checking neighboring shapes.
        for (int i = 1; i < parts.size(); i++) {
            level.setBlock(parts.get(i), state.setValue(RIGHT, i % 2 == 1)
                    .setValue(HALF, i < 2 ? DoubleBlockHalf.LOWER : DoubleBlockHalf.UPPER),
                    UPDATE_CLIENTS | UPDATE_KNOWN_SHAPE);
        }
        for (BlockPos part : parts) {
            level.updateNeighborsAt(part, this);
            level.getBlockState(part).updateNeighbourShapes(level, part, UPDATE_ALL);
        }
    }

    @Override
    protected boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        if (state.getValue(HALF) == DoubleBlockHalf.UPPER) {
            return matches(level.getBlockState(pos.below()), state.setValue(HALF, DoubleBlockHalf.LOWER));
        }
        BlockPos base = origin(pos, state);
        for (BlockPos floor : List.of(base.below(), base.relative(state.getValue(FACING).getClockWise()).below())) {
            if (!level.getBlockState(floor).isFaceSturdy(level, floor, Direction.UP)) return false;
        }
        return true;
    }

    private boolean matches(BlockState actual, BlockState expected) {
        return actual.is(this) && actual.getValue(FACING) == expected.getValue(FACING)
                && actual.getValue(HALF) == expected.getValue(HALF) && actual.getValue(RIGHT) == expected.getValue(RIGHT);
    }

    @Override
    protected BlockState updateShape(BlockState state, LevelReader level, ScheduledTickAccess ticks, BlockPos pos,
            Direction direction, BlockPos neighborPos, BlockState neighbor, RandomSource random) {
        Direction vertical = state.getValue(HALF) == DoubleBlockHalf.LOWER ? Direction.UP : Direction.DOWN;
        Direction horizontal = state.getValue(RIGHT) ? state.getValue(FACING).getCounterClockWise()
                : state.getValue(FACING).getClockWise();
        if (direction == vertical && !matches(neighbor, state.cycle(HALF))
                || direction == horizontal && !matches(neighbor, state.cycle(RIGHT))
                || direction == Direction.DOWN && !state.canSurvive(level, pos)) {
            return Blocks.AIR.defaultBlockState();
        }
        return state;
    }

    @Override
    public BlockState playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        if (!level.isClientSide() && player.preventsBlockDrops()) {
            for (BlockPos part : positions(origin(pos, state), state.getValue(FACING))) {
                if (!part.equals(pos) && level.getBlockState(part).is(this)) {
                    level.setBlock(part, Blocks.AIR.defaultBlockState(), UPDATE_CLIENTS | UPDATE_KNOWN_SHAPE);
                }
            }
        }
        return super.playerWillDestroy(level, pos, state, player);
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        if (state.getValue(HALF) == DoubleBlockHalf.LOWER) return BASE;
        return switch (state.getValue(FACING)) {
            case NORTH -> Block.box(0, 0, 9, 16, 16, 16);
            case SOUTH -> Block.box(0, 0, 0, 16, 16, 7);
            case EAST -> Block.box(0, 0, 0, 7, 16, 16);
            case WEST -> Block.box(9, 0, 0, 16, 16, 16);
            default -> throw new IllegalStateException("Workbench must face horizontally");
        };
    }

    @Override
    protected BlockState rotate(BlockState state, Rotation rotation) {
        return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
    }

    @Override
    protected BlockState mirror(BlockState state, Mirror mirror) {
        return mirror == Mirror.NONE ? state : state.rotate(mirror.getRotation(state.getValue(FACING))).cycle(RIGHT);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, HALF, RIGHT);
    }
}
