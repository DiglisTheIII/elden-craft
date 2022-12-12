package com.diglis.eldencraft.item.custom;

import com.diglis.eldencraft.item.ItemInit;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.material.Material;

import java.util.concurrent.ThreadLocalRandom;

public class MalikethSwordItem extends SwordItem {

    public MalikethSwordItem(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
    }

    @Override
    public boolean hurtEnemy(ItemStack p_43278_, LivingEntity p_43279_, LivingEntity p_43280_) {
        p_43279_.addEffect(new MobEffectInstance(MobEffects.HARM, 500), p_43280_);
        return super.hurtEnemy(p_43278_, p_43279_, p_43280_);
    }

}
