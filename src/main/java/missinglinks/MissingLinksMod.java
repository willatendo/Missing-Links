package missinglinks;

import missinglinks.server.MissingLinksCreativeModeTabs;
import missinglinks.server.block.MissingLinksBlocks;
import missinglinks.server.item.MissingLinksItems;
import missinglinks.server.util.MissingLinksUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import willatendo.simplelibrary.server.util.SimpleUtils;

@Mod(MissingLinksUtils.ID)
public class MissingLinksMod {
	public MissingLinksMod() {
		IEventBus iEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		SimpleUtils.registerAll(iEventBus, MissingLinksItems.ITEMS, MissingLinksBlocks.BLOCKS, MissingLinksCreativeModeTabs.CREATIVE_MODE_TABS);
	}
}
