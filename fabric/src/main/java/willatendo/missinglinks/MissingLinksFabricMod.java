package willatendo.missinglinks;

import net.fabricmc.api.ModInitializer;
import willatendo.simplelibrary.server.registry.FabricRegister;
import willatendo.simplelibrary.server.registry.SimpleRegistry;

import java.util.ArrayList;
import java.util.List;

public class MissingLinksFabricMod implements ModInitializer {
    @Override
    public void onInitialize() {
        List<SimpleRegistry<?>> simpleRegistries = new ArrayList<>();
        MissingLinksMod.onInitialize(simpleRegistries);
        FabricRegister.register(simpleRegistries.toArray(SimpleRegistry[]::new));
    }
}
