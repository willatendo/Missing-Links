package missinglinks.data.client;

import missinglinks.MissingLinksMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class MissingLinksItemProvider extends ItemModelProvider {
	public MissingLinksItemProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, MissingLinksMod.ID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		this.withExistingParent("calcite_stairs", modLoc("block/calcite_stairs"));
		this.withExistingParent("calcite_slab", modLoc("block/calcite_slab"));
	}
}
