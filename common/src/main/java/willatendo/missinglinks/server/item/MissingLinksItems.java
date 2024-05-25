package willatendo.missinglinks.server.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import willatendo.missinglinks.server.block.MissingLinksBlocks;
import willatendo.missinglinks.server.utils.MissingLinksUtils;
import willatendo.simplelibrary.server.registry.SimpleHolder;
import willatendo.simplelibrary.server.registry.SimpleRegistry;
import willatendo.simplelibrary.server.util.SimpleUtils;

import java.util.List;

public class MissingLinksItems {
    public static final SimpleRegistry<Item> ITEMS = SimpleRegistry.create(Registries.ITEM, MissingLinksUtils.ID);

    public static final SimpleHolder<Item> ICON = ITEMS.register("icon", () -> new Item(new Item.Properties()));

    public static void init(List<SimpleRegistry<?>> simpleRegistries) {
        SimpleUtils.registerAllItems(MissingLinksItems.ITEMS, MissingLinksBlocks.BLOCKS);
        simpleRegistries.add(ITEMS);
    }
}
