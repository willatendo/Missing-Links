package willatendo.missinglinks;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import willatendo.missinglinks.server.utils.MissingLinksUtils;
import willatendo.simplelibrary.server.registry.SimpleRegistry;

import java.util.ArrayList;
import java.util.List;

@Mod(MissingLinksUtils.ID)
public class MissingLinksNeoforgeMod {
    public static final List<SimpleRegistry<?>> REGISTRIES = new ArrayList<>();

    public MissingLinksNeoforgeMod(IEventBus modEventBus) {
        MissingLinksMod.onInitialize(REGISTRIES);
    }
}
