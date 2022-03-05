package missinglinks.data.client;

import missinglinks.MissingLinksMod;
import missinglinks.server.block.MissingLinksBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class MissingLinksLangProvider extends LanguageProvider {
	public MissingLinksLangProvider(DataGenerator gen) {
		super(gen, MissingLinksMod.ID, "en_us");
	}

	@Override
	protected void addTranslations() {
		this.add(MissingLinksBlocks.CALCITE.blocks()[0].get(), "Calcite Stairs");
		this.add(MissingLinksBlocks.CALCITE.blocks()[1].get(), "Calcite Slab");
		this.add(MissingLinksBlocks.CALCITE.blocks()[2].get(), "Calcite Wall");
		this.add(MissingLinksBlocks.TUFF.blocks()[0].get(), "Tuff Stairs");
		this.add(MissingLinksBlocks.TUFF.blocks()[1].get(), "Tuff Slab");
		this.add(MissingLinksBlocks.TUFF.blocks()[2].get(), "Tuff Wall");
		this.add(MissingLinksBlocks.DRIPSTONE_BLOCK.blocks()[0].get(), "Dripstone Stairs");
		this.add(MissingLinksBlocks.DRIPSTONE_BLOCK.blocks()[1].get(), "Dripstone Slab");
		this.add(MissingLinksBlocks.DRIPSTONE_BLOCK.blocks()[2].get(), "Dripstone Wall");
		this.add(MissingLinksBlocks.SMOOTH_BASALT.blocks()[0].get(), "Smooth Basalt Stairs");
		this.add(MissingLinksBlocks.SMOOTH_BASALT.blocks()[1].get(), "Smooth Basalt Slab");
		this.add(MissingLinksBlocks.SMOOTH_BASALT.blocks()[2].get(), "Smooth Basalt Wall");
		this.add(MissingLinksBlocks.END_STONE.blocks()[0].get(), "End Stone Stairs");
		this.add(MissingLinksBlocks.END_STONE.blocks()[1].get(), "End Stone Slab");
		this.add(MissingLinksBlocks.END_STONE.blocks()[2].get(), "End Stone Wall");
		this.add(MissingLinksBlocks.QUARTZ_BRICKS.blocks()[0].get(), "Quartz Brick Stairs");
		this.add(MissingLinksBlocks.QUARTZ_BRICKS.blocks()[1].get(), "Quartz Brick Slab");
		this.add(MissingLinksBlocks.QUARTZ_BRICKS.blocks()[2].get(), "Quartz Brick Wall");
		this.add(MissingLinksBlocks.QUARTZ_BLOCK.blocks()[0].get(), "Quartz Wall");
		this.add(MissingLinksBlocks.SMOOTH_QUARTZ.blocks()[0].get(), "Smooth Quartz Wall");
		this.add(MissingLinksBlocks.SMOOTH_RED_SANDSTONE.blocks()[0].get(), "Smooth Red Sandstone Wall");
		this.add(MissingLinksBlocks.SMOOTH_SANDSTONE.blocks()[0].get(), "Smooth Sandstone Wall");
		this.add(MissingLinksBlocks.SMOOTH_STONE.blocks()[0].get(), "Smooth Stone Stairs");
		this.add(MissingLinksBlocks.SMOOTH_STONE.blocks()[1].get(), "Smooth Stone Wall");
		this.add(MissingLinksBlocks.RED_NETHER_BRICKS.blocks()[0].get(), "Red Nether Brick Fence");
		this.add(MissingLinksBlocks.RED_NETHER_BRICKS.blocks()[1].get(), "Red Nether Brick Fence Gate");
		this.add(MissingLinksBlocks.NETHER_BRICKS.blocks()[0].get(), "Nether Brick Fence");
	}
}
