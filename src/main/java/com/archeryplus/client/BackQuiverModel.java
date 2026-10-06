package com.archeryplus.client;

import com.archeryplus.quiver.QuiverAppearance;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;

/** Geometry authored and exported through the Blockbench MCP; see models/entity/quiver.bbmodel. */
public final class BackQuiverModel extends EntityModel<AvatarRenderState> {
    private final ModelPart quiver;
    private final ModelPart half, full;
    private final ModelPart[] details;

    public BackQuiverModel(ModelPart root) {
        super(root);
        quiver = root.getChild("quiver");
        half = quiver.getChild("arrows_half");
        full = quiver.getChild("arrows_full");
        details = new ModelPart[]{quiver.getChild("tier_leather"), quiver.getChild("tier_iron"),
                quiver.getChild("tier_gold"), quiver.getChild("tier_diamond"), quiver.getChild("tier_netherite")};
    }

    @Override
    public void setupAnim(AvatarRenderState state) {
        super.setupAnim(state);
        QuiverAppearance appearance = state.getRenderData(BackQuiverLayer.APPEARANCE);
        quiver.visible = appearance != null && appearance.material() >= 0;
        half.visible = quiver.visible && appearance.arrows() >= 4;
        full.visible = quiver.visible && appearance.arrows() == 8;
        for (int i = 0; i < details.length; i++) details[i].visible = quiver.visible && appearance.material() == i;
    }

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition quiver = partdefinition.addOrReplaceChild("quiver", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -1.0F, -0.5F, 5.0F, 13.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-2.5F, -1.0F, 3.0F, 5.0F, 13.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 0).addBox(2.0F, -1.0F, 0.5F, 1.0F, 13.0F, 2.5F, new CubeDeformation(0.0F))
		.texOffs(14, 0).addBox(-3.0F, -1.0F, 0.5F, 1.0F, 13.0F, 2.5F, new CubeDeformation(0.0F))
		.texOffs(0, 18).addBox(-2.5F, 11.5F, 0.0F, 5.0F, 1.0F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(24, 0).addBox(-2.0F, 11.0F, 0.6F, 4.0F, 0.5F, 2.4F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(-3.3F, -1.15F, 3.3F, 6.6F, 1.65F, 1.1F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(-3.3F, -1.15F, -0.8F, 6.6F, 1.65F, 1.1F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(2.3F, -1.15F, 0.3F, 1.0F, 1.65F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(-3.3F, -1.15F, 0.3F, 1.0F, 1.65F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 30).addBox(-2.8F, 10.0F, 3.2F, 5.6F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 5).addBox(2.95F, 1.0F, 1.0F, 0.2F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 5).addBox(0.0F, 2.0F, -1.0F, 2.3F, 2.0F, 0.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2793F));

		PartDefinition arrows_half = quiver.addOrReplaceChild("arrows_half", CubeListBuilder.create().texOffs(32, 0).addBox(0.85F, -7.0F, 1.0F, 0.35F, 8.0F, 0.35F, new CubeDeformation(0.0F))
		.texOffs(40, 0).addBox(0.3F, -7.0F, 1.05F, 1.5F, 2.0F, 0.25F, new CubeDeformation(0.0F))
		.texOffs(40, 0).addBox(0.9F, -7.0F, 0.4F, 0.25F, 2.0F, 1.5F, new CubeDeformation(0.0F))
		.texOffs(32, 0).addBox(-0.55F, -6.0F, 2.3F, 0.35F, 7.0F, 0.35F, new CubeDeformation(0.0F))
		.texOffs(40, 0).addBox(-1.1F, -6.0F, 2.35F, 1.5F, 2.0F, 0.25F, new CubeDeformation(0.0F))
		.texOffs(40, 0).addBox(-0.5F, -6.0F, 1.7F, 0.25F, 2.0F, 1.5F, new CubeDeformation(0.0F))
		.texOffs(32, 0).addBox(-1.75F, -7.8F, 1.0F, 0.35F, 8.8F, 0.35F, new CubeDeformation(0.0F))
		.texOffs(40, 0).addBox(-2.3F, -7.8F, 1.05F, 1.5F, 2.0F, 0.25F, new CubeDeformation(0.0F))
		.texOffs(40, 0).addBox(-1.7F, -7.8F, 0.4F, 0.25F, 2.0F, 1.5F, new CubeDeformation(0.0F))
		.texOffs(32, 0).addBox(0.15F, -5.8F, 2.4F, 0.35F, 6.8F, 0.35F, new CubeDeformation(0.0F))
		.texOffs(40, 0).addBox(-0.4F, -5.8F, 2.45F, 1.5F, 2.0F, 0.25F, new CubeDeformation(0.0F))
		.texOffs(40, 0).addBox(0.2F, -5.8F, 1.8F, 0.25F, 2.0F, 1.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition arrows_full = quiver.addOrReplaceChild("arrows_full", CubeListBuilder.create().texOffs(32, 0).addBox(-1.35F, -7.0F, 2.4F, 0.35F, 8.0F, 0.35F, new CubeDeformation(0.0F))
		.texOffs(40, 0).addBox(-1.9F, -7.0F, 2.45F, 1.5F, 2.0F, 0.25F, new CubeDeformation(0.0F))
		.texOffs(40, 0).addBox(-1.3F, -7.0F, 1.8F, 0.25F, 2.0F, 1.5F, new CubeDeformation(0.0F))
		.texOffs(32, 0).addBox(1.05F, -6.6F, 2.4F, 0.35F, 7.6F, 0.35F, new CubeDeformation(0.0F))
		.texOffs(40, 0).addBox(0.5F, -6.6F, 2.45F, 1.5F, 2.0F, 0.25F, new CubeDeformation(0.0F))
		.texOffs(40, 0).addBox(1.1F, -6.6F, 1.8F, 0.25F, 2.0F, 1.5F, new CubeDeformation(0.0F))
		.texOffs(32, 0).addBox(-0.55F, -8.0F, 0.8F, 0.35F, 9.0F, 0.35F, new CubeDeformation(0.0F))
		.texOffs(40, 0).addBox(-1.1F, -8.0F, 0.85F, 1.5F, 2.0F, 0.25F, new CubeDeformation(0.0F))
		.texOffs(40, 0).addBox(-0.5F, -8.0F, 0.2F, 0.25F, 2.0F, 1.5F, new CubeDeformation(0.0F))
		.texOffs(32, 0).addBox(-1.95F, -6.4F, 2.0F, 0.35F, 7.4F, 0.35F, new CubeDeformation(0.0F))
		.texOffs(40, 0).addBox(-2.5F, -6.4F, 2.05F, 1.5F, 2.0F, 0.25F, new CubeDeformation(0.0F))
		.texOffs(40, 0).addBox(-1.9F, -6.4F, 1.4F, 0.25F, 2.0F, 1.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tier_leather = quiver.addOrReplaceChild("tier_leather", CubeListBuilder.create().texOffs(40, 16).addBox(-1.7F, 3.0F, 4.0F, 3.4F, 4.0F, 0.4F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tier_iron = quiver.addOrReplaceChild("tier_iron", CubeListBuilder.create().texOffs(40, 16).addBox(-1.3F, 4.0F, 4.0F, 2.6F, 3.0F, 0.6F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(-2.9F, 10.4F, 3.1F, 5.8F, 1.8F, 1.2F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tier_gold = quiver.addOrReplaceChild("tier_gold", CubeListBuilder.create().texOffs(40, 16).addBox(-1.2F, 3.2F, 4.1F, 2.4F, 4.0F, 0.45F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(2.1F, 2.0F, 3.9F, 0.8F, 8.0F, 0.4F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(-2.9F, 2.0F, 3.9F, 0.8F, 8.0F, 0.4F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tier_diamond = quiver.addOrReplaceChild("tier_diamond", CubeListBuilder.create().texOffs(40, 16).addBox(-1.65F, 3.0F, 4.1F, 3.3F, 4.0F, 0.6F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(-3.4F, 1.5F, 3.0F, 1.1F, 9.5F, 1.1F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(2.3F, 1.5F, 3.0F, 1.1F, 9.5F, 1.1F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tier_netherite = quiver.addOrReplaceChild("tier_netherite", CubeListBuilder.create().texOffs(40, 16).addBox(-1.4F, 3.7F, 4.1F, 2.8F, 3.8F, 0.7F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(-3.1F, 10.5F, -0.2F, 6.2F, 2.0F, 4.6F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(2.2F, 1.0F, 3.7F, 1.0F, 9.0F, 0.8F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(-3.2F, 1.0F, 3.7F, 1.0F, 9.0F, 0.8F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

}
