package com.shadowducky.minestranding.core.init;

import com.shadowducky.minestranding.MineStranding;
import com.shadowducky.minestranding.blocks.TheBeachSandBlock;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class BlockInit {
	
	private BlockInit() {}
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MineStranding.MODID);

	public static final RegistryObject<Block> THE_BEACH_SAND = BLOCKS.register("the_beach_sand",
			() -> new TheBeachSandBlock(333333, BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_BLACK).strength(0.5F, 0.5F).sound(SoundType.SAND)));
}
