package missinglinks.server;

import missinglinks.server.block.MissingLinksBlocks;
import missinglinks.server.item.MissingLinksItems;
import missinglinks.server.util.MissingLinksUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import willatendo.simplelibrary.server.util.SimpleUtils;

public class MissingLinksCreativeModeTabs {
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MissingLinksUtils.ID);

	public static final RegistryObject<CreativeModeTab> MISSING_LINKS_BLOCKS = CREATIVE_MODE_TABS.register("missing_links_blocks", () -> CreativeModeTab.builder().title(MissingLinksUtils.translation("itemGroup", MissingLinksUtils.ID)).icon(() -> MissingLinksBlocks.CALCITE_STAIRS.get().asItem().getDefaultInstance()).displayItems((itemDisplayParameters, output) -> {
		SimpleUtils.fillCreativeTab(MissingLinksItems.ITEMS, itemDisplayParameters, output);
	}).build());
	public static final RegistryObject<CreativeModeTab> MISSING_LINKS_PALETTES = CREATIVE_MODE_TABS.register("missing_links_palettes", () -> CreativeModeTab.builder().withTabsBefore(MissingLinksCreativeModeTabs.MISSING_LINKS_BLOCKS.getKey()).title(MissingLinksUtils.translation("itemGroup", MissingLinksUtils.ID + "_palettes")).icon(() -> MissingLinksItems.ICON.get().getDefaultInstance()).displayItems((itemDisplayParameters, output) -> {
		SimpleUtils.fillCreativeTab(MissingLinksItems.ITEMS, itemDisplayParameters, output);
	}).build());
}
