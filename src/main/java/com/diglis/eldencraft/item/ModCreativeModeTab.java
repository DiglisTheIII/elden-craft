package com.diglis.eldencraft.item;

import com.diglis.eldencraft.block.BlockInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab ELDEN_CRAFT_MISC = new CreativeModeTab("eldencraftmisc") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.STEEL_INGOT.get());
        }
    };

    public static final CreativeModeTab ELDEN_CRAFT_WEAPONS = new CreativeModeTab("eldencraftwpn") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.BASTARD_SWORD.get());
        }
    };

    public static final CreativeModeTab ELDEN_CRAFT_ARMOR = new CreativeModeTab("eldencraftarmr") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.STEEL_DEPOSIT.get());
        }
    };

    public static final CreativeModeTab ELDEN_CRAFT_BLOCKS = new CreativeModeTab("eldencraftblock") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.STEEL_DEPOSIT.get());
        }
    };

}
