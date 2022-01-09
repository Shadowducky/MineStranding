package com.shadowducky.minestranding.core.event;

import com.shadowducky.minestranding.MineStranding;
import com.shadowducky.minestranding.common.entity.BTGazer;
import com.shadowducky.minestranding.core.init.EntityInit;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = MineStranding.MODID, bus = Bus.MOD)
public class CommonModEvents {
	
	@SubscribeEvent
	public static void RegisterAttributes(EntityAttributeCreationEvent event) {
		event.put(EntityInit.BT_GAZER.get(), BTGazer.createAttributes().build());
	}
}
