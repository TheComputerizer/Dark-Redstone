package mods.thecomputerizer.darkredstone.core;

import net.minecraftforge.common.ForgeVersion;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import org.apache.logging.log4j.LogManager;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.Mixins;

import javax.annotation.Nullable;
import java.util.Map;

@IFMLLoadingPlugin.Name("DarkRedstoneCore")
@IFMLLoadingPlugin.MCVersion(ForgeVersion.mcVersion)
@IFMLLoadingPlugin.SortingIndex(Integer.MIN_VALUE)
public class EarlyMixinPlugin implements IFMLLoadingPlugin {

    static {
        LogManager.getLogger().info("Initializing vanilla mixins from dark redstone");
    }

    public EarlyMixinPlugin() {
        MixinBootstrap.init();
    }

    @Override
    public String[] getASMTransformerClass() {
        return new String[0];
    }

    @Override
    public String getModContainerClass() {
        return CoreContainer.class.getName();
    }

    @Nullable
    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {
        Mixins.addConfiguration("darkstone.mixin.json");
    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}