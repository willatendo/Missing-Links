package missinglinks.server.item;

import missinglinks.server.block.MissingLinksBlocks;
import missinglinks.server.util.MissingLinksUtils;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import willatendo.simplelibrary.server.util.SimpleUtils;

public class MissingLinksItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MissingLinksUtils.ID);

	public static final RegistryObject<Item> ICON = ITEMS.register("icon", () -> new IconItem(new Item.Properties()));

	static {
		SimpleUtils.registerAllItems(MissingLinksItems.ITEMS, MissingLinksBlocks.BLOCKS);
	}
}
