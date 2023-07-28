package missinglinks.data;

import missinglinks.server.block.MissingLinksBlocks;
import missinglinks.server.item.MissingLinksItems;
import net.minecraft.data.PackOutput;
import willatendo.simplelibrary.data.SimpleLanguageProvider;

public class MissingLinksLanguageProvider extends SimpleLanguageProvider {
	public MissingLinksLanguageProvider(PackOutput packOutput, String modid, String locale) {
		super(packOutput, modid, locale);
	}

	@Override
	protected void addTranslations() {
		this.add(MissingLinksItems.ICON.get());

		this.add(MissingLinksBlocks.ANDESITE_LEVER.get());
		this.add(MissingLinksBlocks.DIORITE_LEVER.get());
		this.add(MissingLinksBlocks.GRANITE_LEVER.get());
		this.add(MissingLinksBlocks.COBBLED_DEEPSLATE_LEVER.get());
		this.add(MissingLinksBlocks.CALCITE_LEVER.get());
		this.add(MissingLinksBlocks.TUFF_LEVER.get());
		this.add(MissingLinksBlocks.DRIPSTONE_LEVER.get());
		this.add(MissingLinksBlocks.SMOOTH_BASALT_LEVER.get());
		this.add(MissingLinksBlocks.END_STONE_LEVER.get());
		this.add(MissingLinksBlocks.TERRACOTTA_LEVER.get());
	}
}
