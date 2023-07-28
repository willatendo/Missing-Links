package missinglinks.data;

import missinglinks.server.util.MissingLinksUtils;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import willatendo.simplelibrary.data.DataHelper;

@EventBusSubscriber(bus = Bus.MOD, modid = MissingLinksUtils.ID)
public class DataGen {
	@SubscribeEvent
	public static void translations(GatherDataEvent event) {
		DataHelper.collectAllData(MissingLinksUtils.ID, event, MissingLinksLanguageProvider::new).addItemModelProvider(MissingLinksItemModelProvider::new).addBlockStateProvider(MissingLinksBlockStateProvider::new).addRecipeProvider(MissingLinksRecipeProvider::new);
	}
}
