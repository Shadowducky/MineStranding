package com.shadowducky.minestranding;

import com.shadowducky.minestranding.core.init.BlockInit;
import com.shadowducky.minestranding.core.init.EntityInit;
import com.shadowducky.minestranding.core.init.ItemInit;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MineStranding.MODID)
public class MineStranding {
	public static final String MODID = "minestranding";
	
	public MineStranding() {
		var bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		BlockInit.BLOCKS.register(bus);
		ItemInit.ITEMS.register(bus);
		EntityInit.ENTITIES.register(bus);
	}
}
