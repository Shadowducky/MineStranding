package com.shadowducky.minestranding.core.init;

import com.shadowducky.minestranding.MineStranding;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ItemInit {
	private ItemInit() {}

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MineStranding.MODID);

	public static final RegistryObject<Item> DEATH_ESSENCE = ITEMS.register("death_essence", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

	//Block Items
	public static final RegistryObject<BlockItem> THE_BEACH_SAND = ITEMS.register("the_beach_sand", () -> new BlockItem(BlockInit.THE_BEACH_SAND.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
}
