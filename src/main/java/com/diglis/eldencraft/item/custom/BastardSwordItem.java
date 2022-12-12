package com.diglis.eldencraft.item.custom;

import com.diglis.eldencraft.item.ItemInit;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraftforge.common.ToolAction;

public class BastardSwordItem extends SwordItem {
    public BastardSwordItem(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        player.knockback(0,0,0);
        return super.onLeftClickEntity(stack, player, entity);
    }
}
