package mods.thecomputerizer.darkstone.core;

import zone.rong.mixinbooter.IEarlyMixinLoader;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class MixinLoader implements IEarlyMixinLoader {

    @Override
    public List<String> getMixinConfigs() {
        return Stream.of("darkstone.mixin.json").collect(Collectors.toList());
    }
}
