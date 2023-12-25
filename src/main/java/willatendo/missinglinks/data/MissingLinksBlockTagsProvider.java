package willatendo.missinglinks.data;

import java.util.concurrent.CompletableFuture;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import willatendo.missinglinks.server.block.MissingLinksBlocks;
import willatendo.simplelibrary.data.SimpleBlockTagsProvider;
import willatendo.simplelibrary.data.util.ExistingFileHelper;
import willatendo.simplelibrary.server.registry.RegistryHolder;

public class MissingLinksBlockTagsProvider extends SimpleBlockTagsProvider {
	public MissingLinksBlockTagsProvider(FabricDataOutput fabricDataOutput, CompletableFuture<Provider> provider, String modid, ExistingFileHelper existingFileHelper) {
		super(fabricDataOutput, provider, modid, existingFileHelper);
	}

	@Override
	protected void addTags(Provider provider) {
		for (RegistryHolder<? extends Block> blocks : MissingLinksBlocks.BLOCKS.getEntries()) {
			if (blocks.get() instanceof ButtonBlock) {
				this.tag(BlockTags.BUTTONS).add(blocks.get());
			}
			if (blocks.get() instanceof FenceGateBlock) {
				this.tag(BlockTags.FENCE_GATES).add(blocks.get());
			}
			if (blocks.get() instanceof FenceBlock) {
				this.tag(BlockTags.FENCES).add(blocks.get());
			}
			if (blocks.get() instanceof PressurePlateBlock) {
				this.tag(BlockTags.PRESSURE_PLATES).add(blocks.get());
			}
			if (blocks.get() instanceof SlabBlock) {
				this.tag(BlockTags.SLABS).add(blocks.get());
			}
			if (blocks.get() instanceof StairBlock) {
				this.tag(BlockTags.STAIRS).add(blocks.get());
			}
			if (blocks.get() instanceof WallBlock) {
				this.tag(BlockTags.WALLS).add(blocks.get());
			}
			if (blocks.getId().getPath().contains("sculk")) {
				this.tag(BlockTags.MINEABLE_WITH_HOE).add(blocks.get());
			} else if (blocks.getId().getPath().contains("clay")) {
				this.tag(BlockTags.MINEABLE_WITH_SHOVEL).add(blocks.get());
			} else {
				this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(blocks.get());
			}
		}
		this.tag(BlockTags.NEEDS_STONE_TOOL).add(MissingLinksBlocks.IRON_STAIRS.get(), MissingLinksBlocks.IRON_SLAB.get(), MissingLinksBlocks.IRON_WALL.get(), MissingLinksBlocks.LAPIS_STAIRS.get(), MissingLinksBlocks.LAPIS_SLAB.get(), MissingLinksBlocks.LAPIS_WALL.get());
		this.tag(BlockTags.NEEDS_IRON_TOOL).add(MissingLinksBlocks.GOLD_STAIRS.get(), MissingLinksBlocks.GOLD_SLAB.get(), MissingLinksBlocks.GOLD_WALL.get(), MissingLinksBlocks.EMERALD_STAIRS.get(), MissingLinksBlocks.EMERALD_SLAB.get(), MissingLinksBlocks.EMERALD_WALL.get(), MissingLinksBlocks.DIAMOND_STAIRS.get(), MissingLinksBlocks.DIAMOND_SLAB.get(), MissingLinksBlocks.DIAMOND_WALL.get());
		this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(MissingLinksBlocks.NETHERITE_STAIRS.get(), MissingLinksBlocks.NETHERITE_SLAB.get(), MissingLinksBlocks.NETHERITE_WALL.get(), MissingLinksBlocks.OBSIDIAN_STAIRS.get(), MissingLinksBlocks.OBSIDIAN_SLAB.get(), MissingLinksBlocks.OBSIDIAN_WALL.get(), MissingLinksBlocks.OBSIDIAN_BUTTON.get(), MissingLinksBlocks.OBSIDIAN_PRESSURE_PLATE.get(), MissingLinksBlocks.CRYING_OBSIDIAN_STAIRS.get(), MissingLinksBlocks.CRYING_OBSIDIAN_SLAB.get(), MissingLinksBlocks.CRYING_OBSIDIAN_WALL.get(), MissingLinksBlocks.CRYING_OBSIDIAN_BUTTON.get(), MissingLinksBlocks.CRYING_OBSIDIAN_PRESSURE_PLATE.get());
		this.tag(BlockTags.DRAGON_IMMUNE).add(MissingLinksBlocks.OBSIDIAN_STAIRS.get(), MissingLinksBlocks.OBSIDIAN_SLAB.get(), MissingLinksBlocks.OBSIDIAN_WALL.get(), MissingLinksBlocks.OBSIDIAN_BUTTON.get(), MissingLinksBlocks.OBSIDIAN_PRESSURE_PLATE.get(), MissingLinksBlocks.CRYING_OBSIDIAN_STAIRS.get(), MissingLinksBlocks.CRYING_OBSIDIAN_SLAB.get(), MissingLinksBlocks.CRYING_OBSIDIAN_WALL.get(), MissingLinksBlocks.CRYING_OBSIDIAN_BUTTON.get(), MissingLinksBlocks.CRYING_OBSIDIAN_PRESSURE_PLATE.get());
		this.tag(BlockTags.GUARDED_BY_PIGLINS).add(MissingLinksBlocks.GOLD_STAIRS.get(), MissingLinksBlocks.GOLD_SLAB.get(), MissingLinksBlocks.GOLD_WALL.get());
	}
}
