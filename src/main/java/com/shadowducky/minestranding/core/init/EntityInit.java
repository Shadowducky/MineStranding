package com.shadowducky.minestranding.core.init;

import com.shadowducky.minestranding.MineStranding;
import com.shadowducky.minestranding.common.entity.BTGazer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class EntityInit {
	
	private EntityInit() {}
	
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, MineStranding.MODID);
	
	public static final RegistryObject<EntityType<BTGazer>> BT_GAZER = ENTITIES.register("bt_gazer", () -> EntityType.Builder.of(BTGazer::new, MobCategory.MONSTER).fireImmune().sized(0.2f, 3.0f).build(new ResourceLocation(MineStranding.MODID, "bt_gazer").toString()));
}