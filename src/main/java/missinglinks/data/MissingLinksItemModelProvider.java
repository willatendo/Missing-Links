package missinglinks.data;

import missinglinks.server.block.MissingLinksBlocks;
import missinglinks.server.item.MissingLinksItems;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import willatendo.simplelibrary.data.SimpleItemModelProvider;

public class MissingLinksItemModelProvider extends SimpleItemModelProvider {
	public MissingLinksItemModelProvider(PackOutput packOutput, String modid, ExistingFileHelper existingFileHelper) {
		super(packOutput, modid, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		this.getBuilder(MissingLinksItems.ICON.getId().getPath()).parent(new ModelFile.UncheckedModelFile(this.modLoc("block/icon")));

		this.lever(MissingLinksBlocks.ANDESITE_LEVER.get());
		this.lever(MissingLinksBlocks.DIORITE_LEVER.get());
		this.lever(MissingLinksBlocks.GRANITE_LEVER.get());
		this.lever(MissingLinksBlocks.COBBLED_DEEPSLATE_LEVER.get());
		this.lever(MissingLinksBlocks.CALCITE_LEVER.get());
		this.lever(MissingLinksBlocks.TUFF_LEVER.get());
		this.lever(MissingLinksBlocks.DRIPSTONE_LEVER.get());
		this.lever(MissingLinksBlocks.SMOOTH_BASALT_LEVER.get());
		this.lever(MissingLinksBlocks.END_STONE_LEVER.get());
		this.lever(MissingLinksBlocks.TERRACOTTA_LEVER.get());
	}

	public void lever(Block block) {
		this.basicItem(block.asItem(), this.modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block).getPath()));
	}
}
