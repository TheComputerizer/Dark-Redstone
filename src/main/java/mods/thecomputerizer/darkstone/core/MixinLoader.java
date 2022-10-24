package mods.thecomputerizer.darkstone.core;

import zone.rong.mixinbooter.ILateMixinLoader;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class MixinLoader implements ILateMixinLoader {

    @Override
    public List<String> getMixinConfigs() {
        return Stream.of("darkstone.mixin.json").collect(Collectors.toList());
    }
}
