package mods.thecomputerizer.darkredstone.core;

import com.google.common.eventbus.EventBus;
import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.LoadController;
import net.minecraftforge.fml.common.ModMetadata;

public class CoreContainer extends DummyModContainer {

    public CoreContainer() {
        super(new ModMetadata());
        ModMetadata meta = this.getMetadata();
        meta.modId = "darkredstonecore";
        meta.name = "Dark Redstone Core";
        meta.description = "Loads Early Mixin Stuff for Dark Redstone";
        meta.version = "1.12.2-1.1";
        meta.authorList.add("The_Computerizer");
    }

    @SuppressWarnings("UnstableApiUsage")
    @Override
    public boolean registerBus(EventBus bus, LoadController controller) {
        bus.register(this);
        return true;
    }
}
