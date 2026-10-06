package com.archeryplus.client;

import com.archeryplus.ArcheryPlus;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.common.NeoForge;

@Mod(value = ArcheryPlus.MODID, dist = Dist.CLIENT)
public final class ArcheryPlusClient {
    public ArcheryPlusClient(IEventBus modEventBus) {
        ArcheryControls.register(modEventBus, NeoForge.EVENT_BUS);
        BackQuiverLayer.register(modEventBus);
        modEventBus.addListener(this::onClientSetup);
    }

    private void onClientSetup(FMLClientSetupEvent event) {
        ArcheryPlus.LOGGER.info("Archery Plus client setup complete");
    }
}
