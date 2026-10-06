package com.archeryplus.client;

import com.archeryplus.ArcheryPlus;
import com.archeryplus.item.QuiverItem;
import com.archeryplus.quiver.QuiverAppearance;
import com.archeryplus.registry.ModRegistries;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.entity.ClientAvatarEntity;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.player.PlayerModel;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.Identifier;
import net.minecraft.util.context.ContextKey;
import net.minecraft.world.entity.Avatar;
import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.renderstate.RegisterRenderStateModifiersEvent;
import net.neoforged.neoforge.client.renderstate.AvatarRenderStateModifier;

public final class BackQuiverLayer extends RenderLayer<AvatarRenderState, PlayerModel> {
    public static final ModelLayerLocation LAYER = new ModelLayerLocation(id("back_quiver"), "main");
    public static final ContextKey<QuiverAppearance> APPEARANCE = new ContextKey<>(id("back_quiver"));
    private static final Identifier[] TEXTURES = java.util.Arrays.stream(QuiverItem.Material.values())
            .map(material -> id("textures/entity/quiver/" + material.id() + ".png")).toArray(Identifier[]::new);
    private final BackQuiverModel model;

    private BackQuiverLayer(RenderLayerParent<AvatarRenderState, PlayerModel> parent, BackQuiverModel model) {
        super(parent);
        this.model = model;
    }
    private static Identifier id(String path) { return Identifier.fromNamespaceAndPath(ArcheryPlus.MODID, path); }

    public static void register(IEventBus bus) {
        bus.addListener((EntityRenderersEvent.RegisterLayerDefinitions event) -> event.registerLayerDefinition(LAYER, BackQuiverModel::createBodyLayer));
        bus.addListener((EntityRenderersEvent.AddLayers event) -> {
            for (var skin : event.getSkins()) {
                var renderer = event.getPlayerRenderer(skin);
                if (renderer != null) renderer.addLayer(new BackQuiverLayer(renderer, new BackQuiverModel(event.getEntityModels().bakeLayer(LAYER))));
            }
        });
        bus.addListener((RegisterRenderStateModifiersEvent event) -> event.registerAvatarEntityModifier(new AvatarRenderStateModifier() {
            @Override
            public <T extends Avatar & ClientAvatarEntity> void accept(T avatar, AvatarRenderState state) {
                state.setRenderData(APPEARANCE, avatar instanceof Player player ? player.getData(ModRegistries.APPEARANCE) : QuiverAppearance.NONE);
            }
        }));
    }

    @Override
    public void submit(PoseStack pose, SubmitNodeCollector collector, int light, AvatarRenderState state, float yRot, float xRot) {
        QuiverAppearance appearance = state.getRenderData(APPEARANCE);
        if (state.isInvisible || state.isSpectator || appearance == null || appearance.material() < 0) return;
        pose.pushPose();
        getParentModel().body.translateAndRotate(pose);
        // Follow the torso through crouching, swimming and flight, behind the armor shell.
        pose.translate(0, 0, state.chestEquipment.isEmpty() ? 0.20f : 0.26f);
        collector.submitModel(model, state, pose, RenderTypes.entityCutout(TEXTURES[appearance.material()]),
                light, OverlayTexture.NO_OVERLAY, state.outlineColor, null);
        pose.popPose();
    }
}
