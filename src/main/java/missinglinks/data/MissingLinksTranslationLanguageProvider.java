package missinglinks.data;

import java.util.function.Supplier;

import missinglinks.MissingLinksMod;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.ForgeRegistries;

public class MissingLinksTranslationLanguageProvider extends LanguageProvider {
	private final AddTranslations translations;

	public MissingLinksTranslationLanguageProvider(PackOutput packOutput, String local, AddTranslations addTranslations) {
		super(packOutput, MissingLinksMod.ID, local);
		this.translations = addTranslations;
	}

	@Override
	protected void addTranslations() {
		this.translations.run(this);
	}

	public void addAdvancement(String advancement, String title, String description) {
		this.add("advancement." + MissingLinksMod.ID + "." + advancement + ".title", title);
		this.add("advancement." + MissingLinksMod.ID + "." + advancement + ".desc", description);
	}

	public void addMusicDisc(Supplier<RecordItem> musicDisc, String name, String description) {
		this.addItem(musicDisc, name);
		this.add("item." + MissingLinksMod.ID + "." + ForgeRegistries.ITEMS.getKey(musicDisc.get()).getPath() + ".desc", description);
	}

	public static interface AddTranslations {
		void run(MissingLinksTranslationLanguageProvider languageProvider);
	}
}
