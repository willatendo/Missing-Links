package missinglinks.server.util;

import com.tterrag.registrate.AbstractRegistrate;
import com.tterrag.registrate.providers.ProviderType;
import com.tterrag.registrate.util.nullness.NonNullSupplier;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class MissingLinksRegistrate extends AbstractRegistrate<MissingLinksRegistrate> {
	public MissingLinksRegistrate(String modid) {
		super(modid);
		this.copyBlockTagsAndItemGroupName();
	}

	public static NonNullSupplier<MissingLinksRegistrate> lazy(String modid) {
		return NonNullSupplier.lazy(() -> new MissingLinksRegistrate(modid).registerEventListeners(FMLJavaModLoadingContext.get().getModEventBus()));
	}

	public void copyBlockTagsAndItemGroupName() {
		this.addDataGenerator(ProviderType.ITEM_TAGS, provider -> provider.copy(BlockTags.FENCES, ItemTags.FENCES));
		this.addDataGenerator(ProviderType.ITEM_TAGS, provider -> provider.copy(BlockTags.WALLS, ItemTags.WALLS));
		this.addDataGenerator(ProviderType.ITEM_TAGS, provider -> provider.copy(BlockTags.STAIRS, ItemTags.STAIRS));
		this.addDataGenerator(ProviderType.ITEM_TAGS, provider -> provider.copy(BlockTags.SLABS, ItemTags.SLABS));

		this.addRawLang("itemGroup.missinglinks.missing_links", "Missing Links");
		this.addRawLang("itemGroup.missinglinks.missing_links_palettes", "Palettes");
	}
}
