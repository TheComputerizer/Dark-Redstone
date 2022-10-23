package mods.thecomputerizer.darkstone.util;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LightUtil {
    private static final List<String> BLACKLIST = Stream.of("redstone","Redstone").collect(Collectors.toList());

    public static int adjustedLightLevel(int original, String name) {
        for(String redstone : BLACKLIST) if(name.contains(redstone)) return 0;
        return original;
    }
}
