package willatendo.missinglinks.data;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import willatendo.missinglinks.server.MissingLinksCreativeModeTabs;
import willatendo.missinglinks.server.block.MissingLinksBlocks;
import willatendo.missinglinks.server.item.MissingLinksItems;
import willatendo.simplelibrary.data.SimpleLanguageProvider;

public class MissingLinksLanguageProvider extends SimpleLanguageProvider {
	public MissingLinksLanguageProvider(PackOutput packOutput, String modid, String locale) {
		super(packOutput, modid, locale);
	}

	@Override
	protected void addTranslations() {
		this.add(MissingLinksItems.ICON.get());

		for (RegistryObject<Block> blocks : MissingLinksBlocks.BLOCKS.getEntries()) {
			this.add(blocks.get());
		}

		this.add(MissingLinksCreativeModeTabs.MISSING_LINKS_BLOCKS.get(), "Missing Links: Blocks");
		this.add(MissingLinksCreativeModeTabs.MISSING_LINKS_PALETTES.get(), "Missing Links: Palettes");
	}
}
