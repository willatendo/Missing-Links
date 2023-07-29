package missinglinks.data;

import missinglinks.server.block.MissingLinksBlocks;
import missinglinks.server.item.MissingLinksItems;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.LeverBlock;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import willatendo.simplelibrary.data.SimpleItemModelProvider;

public class MissingLinksItemModelProvider extends SimpleItemModelProvider {
	public MissingLinksItemModelProvider(PackOutput packOutput, String modid, ExistingFileHelper existingFileHelper) {
		super(packOutput, modid, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		this.getBuilder(MissingLinksItems.ICON.getId().getPath()).parent(new ModelFile.UncheckedModelFile(this.modLoc("block/icon")));

		for (RegistryObject<Block> blocks : MissingLinksBlocks.BLOCKS.getEntries()) {
			if (blocks.get() instanceof LeverBlock) {
				this.lever(blocks.get());
			} else {
				if (blocks.get() instanceof ButtonBlock) {
					this.getBuilder(blocks.getId().getPath()).parent(new ModelFile.UncheckedModelFile(this.modLoc("block/" + blocks.getId().getPath() + "_inventory")));
				} else {
					this.getBuilder(blocks.getId().getPath()).parent(new ModelFile.UncheckedModelFile(this.modLoc("block/" + blocks.getId().getPath())));
				}
			}
		}
	}

	public void lever(Block block) {
		this.basicItem(block.asItem(), this.modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block).getPath()));
	}
}
