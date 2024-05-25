package willatendo.missinglinks.server.event;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegisterEvent;
import willatendo.missinglinks.MissingLinksForgeMod;
import willatendo.missinglinks.server.utils.MissingLinksUtils;
import willatendo.simplelibrary.server.registry.ForgeRegister;
import willatendo.simplelibrary.server.registry.SimpleRegistry;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = MissingLinksUtils.ID)
public class ModEvents {
    @SubscribeEvent
    public static void register(RegisterEvent event) {
        ForgeRegister.register(event, MissingLinksForgeMod.REGISTRIES.toArray(SimpleRegistry[]::new));
    }
}
