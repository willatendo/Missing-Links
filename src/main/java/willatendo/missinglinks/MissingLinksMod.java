package willatendo.missinglinks;

import net.fabricmc.api.ModInitializer;
import willatendo.missinglinks.server.MissingLinksCreativeModeTabs;
import willatendo.missinglinks.server.block.MissingLinksBlocks;
import willatendo.missinglinks.server.item.MissingLinksItems;

public class MissingLinksMod implements ModInitializer {
	@Override
	public void onInitialize() {
		MissingLinksBlocks.init();
		MissingLinksItems.init();
		MissingLinksCreativeModeTabs.init();
	}
}
