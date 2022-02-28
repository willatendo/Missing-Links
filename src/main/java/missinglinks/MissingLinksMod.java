package missinglinks;

import missinglinks.data.MissingLinksBlockTags;
import missinglinks.data.MissingLinksItemTags;
import missinglinks.data.MissingLinksLootTables;
import missinglinks.data.MissingLinksRecipes;
import missinglinks.data.client.MissingLinksBlockStateProvider;
import missinglinks.data.client.MissingLinksItemProvider;
import missinglinks.data.client.MissingLinksLangProvider;
import missinglinks.server.block.MissingLinksBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod(MissingLinksMod.ID)
public class MissingLinksMod {
	public static final String ID = "missinglinks";

	public MissingLinksMod() {
		var eventBus = FMLJavaModLoadingContext.get().getModEventBus();
		MissingLinksBlocks.init();
		eventBus.addListener(this::onDataSetup);
	}

	private void onDataSetup(GatherDataEvent event) {
		DataGenerator dataGenerator = event.getGenerator();
		ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
		var blockTags = new MissingLinksBlockTags(dataGenerator, existingFileHelper);
		dataGenerator.addProvider(new MissingLinksRecipes(dataGenerator));
		dataGenerator.addProvider(new MissingLinksLootTables(dataGenerator));
		dataGenerator.addProvider(blockTags);
		dataGenerator.addProvider(new MissingLinksItemTags(dataGenerator, blockTags, existingFileHelper));
		dataGenerator.addProvider(new MissingLinksBlockStateProvider(dataGenerator, existingFileHelper));
		dataGenerator.addProvider(new MissingLinksItemProvider(dataGenerator, existingFileHelper));
		dataGenerator.addProvider(new MissingLinksLangProvider(dataGenerator));
	}
}
