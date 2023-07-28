package missinglinks.data;

import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LeverBlock;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class MissingLinksBlockStateProvider extends BlockStateProvider {
	public MissingLinksBlockStateProvider(PackOutput packOutput, String modid, ExistingFileHelper existingFileHelper) {
		super(packOutput, modid, existingFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {

	}

	public void lever(Block block, String stone) {
		this.getVariantBuilder(block).forAllStates(blockState -> {
			String name = ForgeRegistries.BLOCKS.getKey(block).getPath();
			Direction facing = blockState.getValue(LeverBlock.FACING);
			AttachFace face = blockState.getValue(LeverBlock.FACE);
			boolean powered = blockState.getValue(LeverBlock.POWERED);
			return ConfiguredModel.builder().modelFile(powered ? this.models().withExistingParent(name, this.mcLoc("block/lever")).texture("particle", this.mcLoc("block/" + stone)).texture("base", this.mcLoc("block/" + stone)).texture("lever", this.modLoc("block/" + stone + "_lever")) : this.models().withExistingParent(block.getName() + "_on", this.mcLoc("block/lever_on")).texture("particle", this.mcLoc("block/" + stone)).texture("base", this.mcLoc("block/" + stone)).texture("lever", this.modLoc("block/" + stone + "_lever"))).rotationX(face == AttachFace.FLOOR ? 0 : (face == AttachFace.WALL ? 90 : 180)).rotationY((int) (face == AttachFace.CEILING ? facing : facing.getOpposite()).toYRot()).build();
		});
	}
}
