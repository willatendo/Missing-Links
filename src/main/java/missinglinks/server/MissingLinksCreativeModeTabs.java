package missinglinks.server;

import missinglinks.server.item.MissingLinksItems;
import missinglinks.server.util.MissingLinksUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import willatendo.simplelibrary.server.util.SimpleUtils;

public class MissingLinksCreativeModeTabs {
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MissingLinksUtils.ID);

	public static final RegistryObject<CreativeModeTab> MISSING_LINKS = CREATIVE_MODE_TABS.register("missing_links", () -> CreativeModeTab.builder().title(MissingLinksUtils.translation("itemGroup", MissingLinksUtils.ID)).icon(() -> Items.STICK.getDefaultInstance()).displayItems((itemDisplayParameters, output) -> {
		SimpleUtils.fillCreativeTab(MissingLinksItems.ITEMS, itemDisplayParameters, output);
	}).build());
}
