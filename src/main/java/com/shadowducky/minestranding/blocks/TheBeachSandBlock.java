package com.shadowducky.minestranding.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.state.BlockState;

public class TheBeachSandBlock extends FallingBlock{
	
	public final int dustColor;

	public TheBeachSandBlock(int dustColor, Properties properties) {
		super(properties);
		this.dustColor= dustColor;
	}

	public int getDustColor(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return this.dustColor;
    }
}
