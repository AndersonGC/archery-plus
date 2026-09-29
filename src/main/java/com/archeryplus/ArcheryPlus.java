package com.archeryplus;

import com.archeryplus.registry.ModRegistries;
import com.archeryplus.quiver.EquipmentEvents;
import com.archeryplus.network.ModNetwork;
import com.archeryplus.combat.BowCombat;
import com.archeryplus.gametest.ArcheryGameTests;
import net.neoforged.neoforge.gametest.GameTestHooks;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

@Mod(ArcheryPlus.MODID)
public final class ArcheryPlus {
    public static final String MODID = "archery_plus";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ArcheryPlus(IEventBus modEventBus) {
        ModRegistries.register(modEventBus);
        if (GameTestHooks.isGametestEnabled()) ArcheryGameTests.register(modEventBus);
        EquipmentEvents.register(NeoForge.EVENT_BUS);
        BowCombat.register(NeoForge.EVENT_BUS);
        modEventBus.addListener(ModNetwork::register);
        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.addListener(this::onServerStarting);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("Archery Plus common setup complete");
    }

    private void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("Archery Plus server starting");
    }
}
