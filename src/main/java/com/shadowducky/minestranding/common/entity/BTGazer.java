package com.shadowducky.minestranding.common.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class BTGazer extends Monster{

	public BTGazer(EntityType<? extends Monster> entityType, Level level) {
		super(entityType, level);
	}
	
	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(0, new FloatGoal(this));
		this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 6.0F));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
		this.goalSelector.addGoal(10, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(3, new MeleeAttackGoal(this, 1.0D, true));
	}
	
	public static AttributeSupplier.Builder createAttributes(){
		return Mob.createMobAttributes().add(Attributes.FOLLOW_RANGE, 5.0D).add(Attributes.MOVEMENT_SPEED, (double) 0.05F).add(Attributes.MAX_HEALTH, 1.0D).add(Attributes.ATTACK_DAMAGE, 1.0D);
	}
	
	public boolean canBreatheUnderwater() {
	      return true;
	   }
}
