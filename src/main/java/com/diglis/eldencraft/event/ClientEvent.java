package com.diglis.eldencraft.event;


import com.diglis.eldencraft.EldenCraft;
import com.diglis.eldencraft.world.feature.WorldPlaceFeature;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.awt.event.MouseEvent;

@Mod.EventBusSubscriber(modid = EldenCraft.MOD_ID)
public class ClientEvent {

    @SubscribeEvent
    public void spawnEntity(LivingDamageEvent e, WorldPlaceFeature p) {

    }

}
