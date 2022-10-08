package missinglinks;

import com.tterrag.registrate.util.nullness.NonNullSupplier;

import missinglinks.data.MissingLinksTranslationLanguageProvider;
import missinglinks.server.block.MissingLinksBlocks;
import missinglinks.server.util.MissingLinksRegistrate;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MissingLinksMod.ID)
public class MissingLinksMod {
	public static final String ID = "missinglinks";
	private static final NonNullSupplier<MissingLinksRegistrate> REGISTRATE = MissingLinksRegistrate.lazy(ID);

	public MissingLinksMod() {
		IEventBus iEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		MissingLinksBlocks.init();

		iEventBus.addListener(this::dataSetup);
	}

	private void dataSetup(GatherDataEvent event) {
		DataGenerator dataGenerator = event.getGenerator();
		dataGenerator.addProvider(true, new MissingLinksTranslationLanguageProvider(dataGenerator, "sv_se", provider -> {
			provider.addBlock(MissingLinksBlocks.ANDESITE.blocks()[0], "Andesittryckplatta");
			provider.addBlock(MissingLinksBlocks.ANDESITE.blocks()[1], "Andesitknapp");
			provider.addBlock(MissingLinksBlocks.DIORITE.blocks()[0], "Diorittryckplatta");
			provider.addBlock(MissingLinksBlocks.DIORITE.blocks()[1], "Dioritknapp");
			provider.addBlock(MissingLinksBlocks.GRANITE.blocks()[0], "Granitetryckplatta");
			provider.addBlock(MissingLinksBlocks.GRANITE.blocks()[1], "Graniteknapp");
			provider.addBlock(MissingLinksBlocks.CALCITE_REDSTONE.blocks()[0], "Kalcitetryckplatta");
			provider.addBlock(MissingLinksBlocks.CALCITE_REDSTONE.blocks()[1], "Kalcitknapp");
			provider.addBlock(MissingLinksBlocks.TUFF_REDSTONE.blocks()[0], "Tufftryckplatta");
			provider.addBlock(MissingLinksBlocks.TUFF_REDSTONE.blocks()[1], "Tuffknapp");
			provider.addBlock(MissingLinksBlocks.DRIPSTONE_BLOCK_REDSTONE.blocks()[0], "Droppstenstryckplatta");
			provider.addBlock(MissingLinksBlocks.DRIPSTONE_BLOCK_REDSTONE.blocks()[1], "Droppstensknapp");
			provider.addBlock(MissingLinksBlocks.SMOOTH_BASALT_REDSTONE.blocks()[0], "Len basalttryckplatta");
			provider.addBlock(MissingLinksBlocks.SMOOTH_BASALT_REDSTONE.blocks()[1], "Len basaltknapp");
			provider.addBlock(MissingLinksBlocks.END_STONE_REDSTONE.blocks()[0], "Endstentryckplatta");
			provider.addBlock(MissingLinksBlocks.END_STONE_REDSTONE.blocks()[1], "Endstenknapp");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(0).blocks()[0], "Vit betongtrappa");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(0).blocks()[1], "Vit betongplatta");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(0).blocks()[2], "Vit betongmur");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(1).blocks()[0], "Orange betongtrappa");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(1).blocks()[1], "Orange betongplatta");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(1).blocks()[2], "Orange betongmur");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(2).blocks()[0], "Ljuslila betongtrappa");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(2).blocks()[1], "Ljuslila betongplatta");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(2).blocks()[2], "Ljuslila betongmur");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(3).blocks()[0], "Ljusblå betongtrappa");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(3).blocks()[1], "Ljusblå betongplatta");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(3).blocks()[2], "Ljusblå betongmur");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(4).blocks()[0], "Gul betongtrappa");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(4).blocks()[1], "Gul betongplatta");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(4).blocks()[2], "Gul betongmur");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(5).blocks()[0], "Limegrön betongtrappa");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(5).blocks()[1], "Limegrön betongplatta");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(5).blocks()[2], "Limegrön betongmur");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(6).blocks()[0], "Rosa betongtrappa");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(6).blocks()[1], "Rosa betongplatta");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(6).blocks()[2], "Rosa betongmur");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(7).blocks()[0], "Grå betongtrappa");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(7).blocks()[1], "Grå betongplatta");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(7).blocks()[2], "Grå betongmur");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(8).blocks()[0], "Ljusgrå betongtrappa");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(8).blocks()[1], "Ljusgrå betongplatta");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(8).blocks()[2], "Ljusgrå betongmur");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(9).blocks()[0], "Turkos betongtrappa");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(9).blocks()[1], "Turkos betongplatta");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(9).blocks()[2], "Turkos betongmur");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(10).blocks()[0], "Lila betongtrappa");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(10).blocks()[1], "Lila betongplatta");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(10).blocks()[2], "Lila betongmur");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(11).blocks()[0], "Blå betongtrappa");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(11).blocks()[1], "Blå betongplatta");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(11).blocks()[2], "Blå betongmur");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(12).blocks()[0], "Brun betongtrappa");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(12).blocks()[1], "Brun betongplatta");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(12).blocks()[2], "Brun betongmur");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(13).blocks()[0], "Grön betongtrappa");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(13).blocks()[1], "Grön betongplatta");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(13).blocks()[2], "Grön betongmur");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(14).blocks()[0], "Röd betongtrappa");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(14).blocks()[1], "Röd betongplatta");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(14).blocks()[2], "Röd betongmur");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(15).blocks()[0], "Svart betongtrappa");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(15).blocks()[1], "Svart betongplatta");
			provider.addBlock(MissingLinksBlocks.CONCRETE.get(15).blocks()[2], "Svart betongmur");
			provider.addBlock(MissingLinksBlocks.CALCITE.blocks()[0], "Kalcittrappa");
			provider.addBlock(MissingLinksBlocks.CALCITE.blocks()[1], "Kalcitplatta");
			provider.addBlock(MissingLinksBlocks.CALCITE.blocks()[2], "Kalcitmur");
			provider.addBlock(MissingLinksBlocks.TUFF.blocks()[0], "Tufftrappa");
			provider.addBlock(MissingLinksBlocks.TUFF.blocks()[1], "Tuffplatta");
			provider.addBlock(MissingLinksBlocks.TUFF.blocks()[2], "Tuffmur");
			provider.addBlock(MissingLinksBlocks.DRIPSTONE_BLOCK.blocks()[0], "Droppstenstrappa");
			provider.addBlock(MissingLinksBlocks.DRIPSTONE_BLOCK.blocks()[1], "Droppstensplatta");
			provider.addBlock(MissingLinksBlocks.DRIPSTONE_BLOCK.blocks()[2], "Droppstensmur");
			provider.addBlock(MissingLinksBlocks.SMOOTH_BASALT.blocks()[0], "Len basalttrappa");
			provider.addBlock(MissingLinksBlocks.SMOOTH_BASALT.blocks()[1], "Len basaltplatta");
			provider.addBlock(MissingLinksBlocks.SMOOTH_BASALT.blocks()[2], "Len basaltmur");
			provider.addBlock(MissingLinksBlocks.END_STONE.blocks()[0], "Endstentrappa");
			provider.addBlock(MissingLinksBlocks.END_STONE.blocks()[1], "Endstenplatta");
			provider.addBlock(MissingLinksBlocks.END_STONE.blocks()[2], "Endstenmur");
			provider.addBlock(MissingLinksBlocks.QUARTZ_BRICKS.blocks()[0], "Kvartsmurstentrappa");
			provider.addBlock(MissingLinksBlocks.QUARTZ_BRICKS.blocks()[1], "Kvartsmurstenplatta");
			provider.addBlock(MissingLinksBlocks.QUARTZ_BRICKS.blocks()[2], "Kvartsmurstenmur");
			provider.addBlock(MissingLinksBlocks.QUARTZ_BLOCK.blocks()[0], "Kvartsmur");
			provider.addBlock(MissingLinksBlocks.SMOOTH_QUARTZ.blocks()[0], "Len kvartsmur");
			provider.addBlock(MissingLinksBlocks.SMOOTH_SANDSTONE.blocks()[0], "Len sandstenssmur");
			provider.addBlock(MissingLinksBlocks.SMOOTH_RED_SANDSTONE.blocks()[0], "Len röd sandstenssmur");
			provider.addBlock(MissingLinksBlocks.SMOOTH_STONE.blocks()[0], "Len stentrappa");
			provider.addBlock(MissingLinksBlocks.SMOOTH_STONE.blocks()[1], "Len stenmur");
			provider.addBlock(MissingLinksBlocks.RED_NETHER_BRICKS.blocks()[0], "Röd nethertaket");
			provider.addBlock(MissingLinksBlocks.RED_NETHER_BRICKS.blocks()[1], "Röd nethergrind");
			provider.addBlock(MissingLinksBlocks.NETHER_BRICKS.blocks()[0], "Nethergrind");
			provider.addBlock(MissingLinksBlocks.PACKED_MUDS.blocks()[0], "Packad gyttjatrappa");
			provider.addBlock(MissingLinksBlocks.PACKED_MUDS.blocks()[1], "Packad gyttjaplatta");
			provider.addBlock(MissingLinksBlocks.PACKED_MUDS.blocks()[2], "Packad gyttjamur");
			provider.addBlock(MissingLinksBlocks.SCULKS.blocks()[0], "Sculktrappa");
			provider.addBlock(MissingLinksBlocks.SCULKS.blocks()[1], "Sculkplatta");
			provider.addBlock(MissingLinksBlocks.SCULKS.blocks()[2], "Sculkmur");
		}));
	}

	public static MissingLinksRegistrate getRegistrate() {
		return REGISTRATE.get();
	}

	public static ResourceLocation rL(String path) {
		return new ResourceLocation(ID, path);
	}
}
