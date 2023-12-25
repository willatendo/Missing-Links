package willatendo.missinglinks.data;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import willatendo.simplelibrary.data.DataHandler;

public class MissingLinksData implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		DataHandler dataHandler = new DataHandler(fabricDataGenerator);

		dataHandler.addLanguageProvider((fabricDataOutput, modId) -> new MissingLinksLanguageProvider(fabricDataOutput, modId, "en_us"));
		dataHandler.addProvider(MissingLinksItemModelProvider::new);
		dataHandler.addProvider((fabricDataOutput, modId) -> new MissingLinksRecipeProvider(fabricDataOutput));
		dataHandler.addProvider((fabricDataOutput, modId) -> MissingLinksLootTableProvider.create(fabricDataOutput));
		dataHandler.addProvider(MissingLinksBlockStateProvider::new);
		dataHandler.addTagsProvider(MissingLinksItemTagsProvider::new, MissingLinksBlockTagsProvider::new);
	}
}
