package com.shadowducky.minestranding.client.renderer.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.shadowducky.minestranding.MineStranding;
import com.shadowducky.minestranding.common.entity.BTGazer;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;

public class BTGazerModel<Type extends BTGazer> extends EntityModel<Type> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(MineStranding.MODID, "bt_gazer"), "main");
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart legs;
	private final ModelPart arms;
	private final ModelPart strand;

	public BTGazerModel(ModelPart root) {
		super(RenderType::entityTranslucent);
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.legs = root.getChild("legs");
		this.arms = root.getChild("arms");
		this.strand = root.getChild("strand");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -2.0F)).addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(8, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -40.0F, 0.0F, 0.5236F, 0.0F, 0.0F));

		partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0F, -2.0F)).addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.0F, 0.0F, 0.6981F, 0.0F, 0.0F));

		partdefinition.addOrReplaceChild("legs", CubeListBuilder.create().texOffs(40, 16).addBox(-4.0F, -2.0F, 4.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(8, 32).addBox(0.0F, -2.0F, 4.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, -2.0F));

		partdefinition.addOrReplaceChild("arms", CubeListBuilder.create().texOffs(32, 0).addBox(-8.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(28, 28).addBox(4.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, -2.0F));

		partdefinition.addOrReplaceChild("strand", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -35.0F, 1.0F, 2.0F, 35.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, -2.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Type entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, buffer, packedLight, packedOverlay);
		head.render(poseStack, buffer, packedLight, packedOverlay);
		legs.render(poseStack, buffer, packedLight, packedOverlay);
		arms.render(poseStack, buffer, packedLight, packedOverlay);
		strand.render(poseStack, buffer, packedLight, packedOverlay);
	}
}