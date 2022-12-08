package com.diglis.eldencraft.world.feature;

import com.diglis.eldencraft.EldenCraft;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.Locale;

public class WorldPlaceFeature {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, EldenCraft.MOD_ID);

    public static final RegistryObject<PlacedFeature> STEEL_DEPOSIT_PLACED = PLACED_FEATURES.register("steel_deposit_placed",
            () -> new PlacedFeature(WorldGenFeature.STEEL_DEPOSIT.getHolder().get(),
                    commonOrePlacement(7, //Veins per chunk
                            HeightRangePlacement.triangle(VerticalAnchor.absolute(-30), VerticalAnchor.absolute(60)))));

    public static final RegistryObject<PlacedFeature> CARBON_RUNOFF_PLACED = PLACED_FEATURES.register("carbon_runoff_placed",
            () -> new PlacedFeature(WorldGenFeature.CARBON_RUNOFF.getHolder().get(),
                    commonOrePlacement(9,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-63), VerticalAnchor.absolute(-34)))));
    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }

}
