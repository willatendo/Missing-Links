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
		this.add(MissingLinksBlocks.CACLITE.blocks()[0], "Calcite Stairs");
		this.add(MissingLinksBlocks.CACLITE.blocks()[1], "Calcite Slab");
		this.add(MissingLinksBlocks.CACLITE.blocks()[2], "Calcite Wall");
		this.add(MissingLinksBlocks.TUFF.blocks()[0], "Tuff Stairs");
		this.add(MissingLinksBlocks.TUFF.blocks()[1], "Tuff Slab");
		this.add(MissingLinksBlocks.TUFF.blocks()[2], "Tuff Wall");
		this.add(MissingLinksBlocks.DRIPSTONE_BLOCK.blocks()[0], "Dripstone Stairs");
		this.add(MissingLinksBlocks.DRIPSTONE_BLOCK.blocks()[1], "Dripstone Slab");
		this.add(MissingLinksBlocks.DRIPSTONE_BLOCK.blocks()[2], "Dripstone Wall");
		this.add(MissingLinksBlocks.SMOOTH_BASALT.blocks()[0], "Smooth Basalt Stairs");
		this.add(MissingLinksBlocks.SMOOTH_BASALT.blocks()[1], "Smooth Basalt Slab");
		this.add(MissingLinksBlocks.SMOOTH_BASALT.blocks()[2], "Smooth Basalt Wall");
		this.add(MissingLinksBlocks.END_STONE.blocks()[0], "End Stone Stairs");
		this.add(MissingLinksBlocks.END_STONE.blocks()[1], "End Stone Slab");
		this.add(MissingLinksBlocks.END_STONE.blocks()[2], "End Stone Wall");
		this.add(MissingLinksBlocks.QUARTZ_BRICKS.blocks()[0], "Quartz Brick Stairs");
		this.add(MissingLinksBlocks.QUARTZ_BRICKS.blocks()[1], "Quartz Brick Slab");
		this.add(MissingLinksBlocks.QUARTZ_BRICKS.blocks()[2], "Quartz Brick Wall");
		this.add(MissingLinksBlocks.QUARTZ_BLOCK.blocks()[0], "Quartz Wall");
		this.add(MissingLinksBlocks.SMOOTH_QUARTZ.blocks()[0], "Smooth Quartz Wall");
		this.add(MissingLinksBlocks.SMOOTH_RED_SANDSTONE.blocks()[0], "Smooth Red Sandstone Wall");
		this.add(MissingLinksBlocks.SMOOTH_SANDSTONE.blocks()[0], "Smooth Sandstone Wall");
		this.add(MissingLinksBlocks.SMOOTH_STONE.blocks()[0], "Smooth Stone Stairs");
		this.add(MissingLinksBlocks.SMOOTH_STONE.blocks()[1], "Smooth Stone Wall");
		this.add(MissingLinksBlocks.RED_NETHER_BRICKS.blocks()[0], "Red Nether Brick Fence");
		this.add(MissingLinksBlocks.RED_NETHER_BRICKS.blocks()[1], "Red Nether Brick Fence Gate");
		this.add(MissingLinksBlocks.NETHER_BRICKS.blocks()[0], "Nether Brick Fence");
	}
}
