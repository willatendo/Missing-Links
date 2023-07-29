package missinglinks.server.item;

import net.minecraft.world.item.CreativeModeTab.ItemDisplayParameters;
import net.minecraft.world.item.CreativeModeTab.Output;
import net.minecraft.world.item.Item;
import willatendo.simplelibrary.server.util.FillCreativeTab;

public class IconItem extends Item implements FillCreativeTab {
	public IconItem(Properties properties) {
		super(properties);
	}

	@Override
	public void fillCreativeTab(ItemDisplayParameters itemDisplayParameters, Output output) {		
	}
}
