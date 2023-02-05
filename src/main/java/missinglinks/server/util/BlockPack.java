package missinglinks.server.util;

import missinglinks.server.block.MissingLinksBlocks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;

public record BlockPack<T extends Block> (Block[] blocks) {
	public static final MissingLinksRegistrate REGISTRATE = MissingLinksBlocks.REGISTRATE;

	public static ResourceLocation getRegistryName(Block block) {
		return ForgeRegistries.BLOCKS.getKey(block);
	}

	public static interface PackType {
		int types();
	}

	public static enum StandardPack implements PackType {
		STAIRS,
		SLAB,
		WALL;

		@Override
		public int types() {
			return this.values().length;
		}
	}
}
