package missinglinks.server.block;

import missinglinks.MissingLinksMod;
import missinglinks.server.item.ModBlockItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

@EventBusSubscriber(bus = Bus.MOD, modid = MissingLinksMod.ID)
public class MissingLinksBlocks {
	public static final BlockGroup POLISHED_CALCITE = BlockGroup.makeBlockStairsSlabWall("polished_calcite", BlockBehaviour.Properties.copy(Blocks.CALCITE));
	public static final BlockGroup POLISHED_TUFF = BlockGroup.makeBlockStairsSlabWall("polished_tuff", BlockBehaviour.Properties.copy(Blocks.TUFF));

	public static final BlockGroup CALCITE = BlockGroup.makeStairsSlabWall(Blocks.CALCITE);
	public static final BlockGroup TUFF = BlockGroup.makeStairsSlabWall(Blocks.TUFF);
	public static final BlockGroup DRIPSTONE_BLOCK = BlockGroup.makeStairsSlabWall(Blocks.DRIPSTONE_BLOCK);
	public static final BlockGroup SMOOTH_BASALT = BlockGroup.makeStairsSlabWall(Blocks.SMOOTH_BASALT);
	public static final BlockGroup END_STONE = BlockGroup.makeStairsSlabWall(Blocks.END_STONE);
	public static final BlockGroup QUARTZ_BRICKS = BlockGroup.makeStairsSlabWall(Blocks.QUARTZ_BRICKS);
	public static final BlockGroup QUARTZ_BLOCK = new BlockGroup(() -> Blocks.QUARTZ_BLOCK, new RegistryObject[] { MissingLinksMod.BLOCKS.register("quartz_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK))) });
	public static final BlockGroup SMOOTH_QUARTZ = new BlockGroup(() -> Blocks.SMOOTH_QUARTZ, new RegistryObject[] { MissingLinksMod.BLOCKS.register("smooth_quartz_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ))) });
	public static final BlockGroup SMOOTH_RED_SANDSTONE = new BlockGroup(() -> Blocks.SMOOTH_RED_SANDSTONE, new RegistryObject[] { MissingLinksMod.BLOCKS.register("smooth_red_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE))) });
	public static final BlockGroup SMOOTH_SANDSTONE = new BlockGroup(() -> Blocks.SMOOTH_SANDSTONE, new RegistryObject[] { MissingLinksMod.BLOCKS.register("smooth_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE))) });
	public static final BlockGroup SMOOTH_STONE = new BlockGroup(() -> Blocks.SMOOTH_STONE, new RegistryObject[] { MissingLinksMod.BLOCKS.register("smooth_stone_stairs", () -> new StairBlock(() -> Blocks.SMOOTH_STONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE))), MissingLinksMod.BLOCKS.register("smooth_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE))) });
	public static final BlockGroup RED_NETHER_BRICKS = BlockGroup.makeFencesFenceGates(Blocks.RED_NETHER_BRICKS);
	public static final BlockGroup NETHER_BRICKS = new BlockGroup(() -> Blocks.NETHER_BRICKS, new RegistryObject[] { MissingLinksMod.BLOCKS.register("nether_brick_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS))) });

	public static void init() {
	}

	@SubscribeEvent
	public static void onRegisterItems(Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();

		MissingLinksMod.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			Properties properties = new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS);
			BlockItem blockItem = new ModBlockItem(() -> block, properties);
			blockItem.setRegistryName(block.getRegistryName());
			registry.register(blockItem);
		});
	}
}
