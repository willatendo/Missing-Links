package willatendo.missinglinks.server.item;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import willatendo.missinglinks.server.block.MissingLinksBlocks;
import willatendo.missinglinks.server.util.MissingLinksUtils;
import willatendo.simplelibrary.server.registry.RegistryHolder;
import willatendo.simplelibrary.server.registry.SimpleRegistry;
import willatendo.simplelibrary.server.util.SimpleUtils;

public class MissingLinksItems {
	public static final SimpleRegistry<Item> ITEMS = SimpleRegistry.create(BuiltInRegistries.ITEM, MissingLinksUtils.ID);

	public static final RegistryHolder<IconItem> ICON = ITEMS.register("icon", () -> new IconItem(new Item.Properties()));

	public static void init() {
		SimpleUtils.registerAllItems(MissingLinksItems.ITEMS, MissingLinksBlocks.BLOCKS);
	}
}
