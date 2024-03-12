package com.jarromie.AutoRogues;


import net.runelite.client.config.*;

@ConfigGroup("AutoRogues")
public interface AutoRoguesConfig extends Config {
    @ConfigItem(
            keyName = "Toggle",
            name = "Toggle",
            description = "",
            position = 0
    )
    default Keybind toggle() {
        return Keybind.NOT_SET;
    }

    @ConfigItem(
            keyName = "Shortcut",
            name = "Shortcut",
            description = "Enable level 80+ shortcut? Will ignore if below level 80 Thieving.",
            position = 1
    )
    default boolean shortcut() { return true; }

    @ConfigItem(
            keyName = "ChillLower",
            name = "Lower Chill Threshold",
            description = "If below this amount of run energy, sit and idle until Upper Chill Threshold is met",
            position = 2
    )
    default int chillLower() { return 15; }

    @ConfigItem(
            keyName = "ChillUpper",
            name = "Upper Chill Threshold",
            description = "If below Lower Chill Threshold, sit and idle until this amounut of run energy is met",
            position = 2
    )
    default int chillUpper() { return 25; }


}
