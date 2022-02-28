package missinglinks.data;

import missinglinks.MissingLinksMod;
import missinglinks.data.client.MissingLinksBlockStateProvider;
import missinglinks.data.client.MissingLinksItemProvider;
import missinglinks.data.client.MissingLinksLangProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@EventBusSubscriber(bus = Bus.MOD, modid = MissingLinksMod.ID)
public class DataGen {
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator dataGenerator = event.getGenerator();
		ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
		var blockTags = new MissingLinksBlockTags(dataGenerator, existingFileHelper);
		dataGenerator.addProvider(new MissingLinksBlockStateProvider(dataGenerator, existingFileHelper));
		dataGenerator.addProvider(new MissingLinksItemProvider(dataGenerator, existingFileHelper));
		dataGenerator.addProvider(new MissingLinksRecipes(dataGenerator));
		dataGenerator.addProvider(new MissingLinksLootTables(dataGenerator));
		dataGenerator.addProvider(blockTags);
		dataGenerator.addProvider(new MissingLinksItemTags(dataGenerator, blockTags, existingFileHelper));
		dataGenerator.addProvider(new MissingLinksLangProvider(dataGenerator));
	}
}
