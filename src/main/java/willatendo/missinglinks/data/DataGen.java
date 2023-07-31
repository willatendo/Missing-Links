package willatendo.missinglinks.data;

import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import willatendo.missinglinks.server.util.MissingLinksUtils;
import willatendo.simplelibrary.data.DataHelper;

@EventBusSubscriber(bus = Bus.MOD, modid = MissingLinksUtils.ID)
public class DataGen {
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataHelper.collectAllData(MissingLinksUtils.ID, event, MissingLinksLanguageProvider::new).addItemModelProvider(MissingLinksItemModelProvider::new).addBlockStateProvider(MissingLinksBlockStateProvider::new).addRecipeProvider(MissingLinksRecipeProvider::new).addLootProvider(MissingLinksLootTableProvider::create).addBasicTagProviders(MissingLinksItemTagsProvider::new, MissingLinksBlockTagsProvider::new);
	}
}
