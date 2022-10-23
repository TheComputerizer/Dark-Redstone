package mods.thecomputerizer.darkstone.core;

import mods.thecomputerizer.darkstone.Darkstone;
import zone.rong.mixinbooter.ILateMixinLoader;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class MixinLoader implements ILateMixinLoader {

    @Override
    public List<String> getMixinConfigs() {
        Darkstone.LOGGER.info("Initializing darkstone block mixin");
        return Stream.of("darkstone.mixin.json").collect(Collectors.toList());
    }
}
