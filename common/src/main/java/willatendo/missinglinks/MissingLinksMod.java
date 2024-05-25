package willatendo.missinglinks;

import willatendo.missinglinks.server.MissingLinksCreativeModeTabs;
import willatendo.missinglinks.server.block.MissingLinksBlocks;
import willatendo.missinglinks.server.item.MissingLinksItems;
import willatendo.simplelibrary.server.registry.SimpleRegistry;

import java.util.List;

public class MissingLinksMod {
    public static void onInitialize(List<SimpleRegistry<?>> simpleRegistries) {
        MissingLinksBlocks.init(simpleRegistries);
        MissingLinksItems.init(simpleRegistries);
        MissingLinksCreativeModeTabs.init(simpleRegistries);
    }
}
