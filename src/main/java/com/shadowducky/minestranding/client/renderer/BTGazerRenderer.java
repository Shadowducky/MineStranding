package com.shadowducky.minestranding.client.renderer;

import com.shadowducky.minestranding.MineStranding;
import com.shadowducky.minestranding.client.renderer.model.BTGazerModel;
import com.shadowducky.minestranding.common.entity.BTGazer;

import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;


public class BTGazerRenderer<Type extends BTGazer> extends MobRenderer<Type, BTGazerModel<Type>> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(MineStranding.MODID, "textures/entities/bt_gazer.png");
	
	public BTGazerRenderer(Context context) {
		super(context, new BTGazerModel<>(context.bakeLayer(BTGazerModel.LAYER_LOCATION)), 0.25f);
	}

	@Override
	public ResourceLocation getTextureLocation(Type entity) {
		return TEXTURE;
	}
	
}
