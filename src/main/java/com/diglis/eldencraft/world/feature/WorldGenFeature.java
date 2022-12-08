package com.diglis.eldencraft.world.feature;

import com.diglis.eldencraft.EldenCraft;
import com.diglis.eldencraft.block.BlockInit;
import com.google.common.base.Suppliers;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.io.ObjectInputFilter;
import java.util.List;
import java.util.function.Supplier;

public class WorldGenFeature {

    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, EldenCraft.MOD_ID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> STEEL_DEPOSITS = Suppliers.memoize(() -> List.of(
         OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.STEEL_DEPOSIT.get().defaultBlockState())
    ));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> CARBON_RUNOFFS = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.CARBON_RUNOFF.get().defaultBlockState())
    ));

    public static final RegistryObject<ConfiguredFeature<?, ?>> STEEL_DEPOSIT = CONFIGURED_FEATURES.register("steel_deposit",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(STEEL_DEPOSITS.get(), 12)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> CARBON_RUNOFF = CONFIGURED_FEATURES.register("carbon_runoff",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(CARBON_RUNOFFS.get(), 15)));
    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}
