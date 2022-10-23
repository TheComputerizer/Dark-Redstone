package mods.thecomputerizer.darkstone;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Darkstone.MODID, name = Darkstone.NAME, version = Darkstone.VERSION, dependencies = Darkstone.DEPENDENCIES)
public class Darkstone {
    public static final String MODID = "darkstone";
    public static final String NAME = "Darkstone";
    public static final String VERSION = "1.12.2-1.0";
    public static final String DEPENDENCIES = "mixinbooter";
    public static Logger LOGGER = LogManager.getLogger(MODID);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER.info("Successfully initialized darkstone!");
    }
}
