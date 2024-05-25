package willatendo.missinglinks.server.event;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.RegisterEvent;
import willatendo.missinglinks.MissingLinksNeoforgeMod;
import willatendo.missinglinks.server.utils.MissingLinksUtils;
import willatendo.simplelibrary.server.registry.NeoForgeRegister;
import willatendo.simplelibrary.server.registry.SimpleRegistry;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = MissingLinksUtils.ID)
public class ModEvents {
    @SubscribeEvent
    public static void register(RegisterEvent event) {
        NeoForgeRegister.register(event, MissingLinksNeoforgeMod.REGISTRIES.toArray(SimpleRegistry[]::new));
    }
}
