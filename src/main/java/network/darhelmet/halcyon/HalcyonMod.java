package network.darhelmet.halcyon;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("halcyon")
public class HalcyonMod
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public HalcyonMod() {
    	// No logic needed currently, this mod is for distributing data/rendering data for silent's gear extensions
    }
}
