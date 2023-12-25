package willatendo.missinglinks.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.world.level.block.Block;
import willatendo.missinglinks.server.MissingLinksCreativeModeTabs;
import willatendo.missinglinks.server.block.MissingLinksBlocks;
import willatendo.missinglinks.server.item.MissingLinksItems;
import willatendo.simplelibrary.data.SimpleLanguageProvider;
import willatendo.simplelibrary.server.registry.RegistryHolder;

public class MissingLinksLanguageProvider extends SimpleLanguageProvider {
	public MissingLinksLanguageProvider(FabricDataOutput fabricDataOutput, String modid, String locale) {
		super(fabricDataOutput, modid, locale);
	}

	@Override
	protected void addTranslations() {
		this.add(MissingLinksItems.ICON.get());

		for (RegistryHolder<? extends Block> blocks : MissingLinksBlocks.BLOCKS.getEntries()) {
			this.add(blocks.get());
		}

		this.add(MissingLinksCreativeModeTabs.MISSING_LINKS_BLOCKS.get(), "Missing Links: Blocks");
		this.add(MissingLinksCreativeModeTabs.MISSING_LINKS_PALETTES.get(), "Missing Links: Palettes");
	}
}
