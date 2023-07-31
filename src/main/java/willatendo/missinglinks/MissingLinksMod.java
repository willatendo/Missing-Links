package willatendo.missinglinks;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import willatendo.missinglinks.server.MissingLinksCreativeModeTabs;
import willatendo.missinglinks.server.block.MissingLinksBlocks;
import willatendo.missinglinks.server.item.MissingLinksItems;
import willatendo.missinglinks.server.util.MissingLinksUtils;
import willatendo.simplelibrary.server.util.SimpleUtils;

@Mod(MissingLinksUtils.ID)
public class MissingLinksMod {
	public MissingLinksMod() {
		IEventBus iEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		SimpleUtils.registerAll(iEventBus, MissingLinksItems.ITEMS, MissingLinksBlocks.BLOCKS, MissingLinksCreativeModeTabs.CREATIVE_MODE_TABS);
	}
}
