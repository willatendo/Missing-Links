package missinglinks;

import missinglinks.server.block.MissingLinksBlocks;
import net.minecraftforge.fml.common.Mod;

@Mod("missinglinks")
public class MissingLinksMod {
	public MissingLinksMod() {
		MissingLinksBlocks.init();
	}
}
