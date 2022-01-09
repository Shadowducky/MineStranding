package com.shadowducky.minestranding.client.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import com.shadowducky.minestranding.MineStranding;
import com.shadowducky.minestranding.client.renderer.BTGazerRenderer;
import com.shadowducky.minestranding.client.renderer.model.BTGazerModel;
import com.shadowducky.minestranding.core.init.EntityInit;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.client.event.EntityRenderersEvent;

@Mod.EventBusSubscriber(modid = MineStranding.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public final class ClientModEvents {
	
	private ClientModEvents() {}
	
	@SubscribeEvent
	public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(BTGazerModel.LAYER_LOCATION, BTGazerModel::createBodyLayer);
	}
	
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(EntityInit.BT_GAZER.get(), BTGazerRenderer::new);
	}
}
