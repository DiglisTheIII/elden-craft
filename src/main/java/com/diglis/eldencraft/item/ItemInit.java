package com.diglis.eldencraft.item;

import com.diglis.eldencraft.EldenCraft;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EldenCraft.MOD_ID);

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel",
            () -> new Item(new Item.Properties().tab(tabs("ermisc"))));

    public static final RegistryObject<Item> STEEL_CHUNK = ITEMS.register("steel_chunk",
            () -> new Item(new Item.Properties().tab(tabs("ermisc"))));

    public static final RegistryObject<Item> CARBON_SHARD = ITEMS.register("carbon_shard",
            () -> new Item(new Item.Properties().tab(tabs("ermisc"))));

    public static final RegistryObject<SwordItem> BASTARD_SWORD = ITEMS.register("bastard_sword",
            () -> new SwordItem(Tiers.STEEL, 3, 3.5f, new Item.Properties().tab(tabs("erwpn"))));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    private static CreativeModeTab tabs(String prop) {
        return switch (prop) {
            case "misc" -> CreativeModeTab.TAB_MISC;
            case "ermisc" -> ModCreativeModeTab.ELDEN_CRAFT_MISC;
            case "erwpn" -> ModCreativeModeTab.ELDEN_CRAFT_WEAPONS;
            case "erarm" -> ModCreativeModeTab.ELDEN_CRAFT_ARMOR;
            default -> null;
        };
    }

    public static class Tiers {
        public static final Tier STEEL = new ForgeTier(2, 75, 1.5f, 3, 350, null,
                () -> Ingredient.of(ItemInit.STEEL_INGOT.get()));
    }

}
