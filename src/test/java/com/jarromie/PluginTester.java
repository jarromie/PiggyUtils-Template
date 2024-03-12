package com.jarromie;

import com.example.EthanApiPlugin.EthanApiPlugin;
import com.example.PacketUtils.PacketUtilsPlugin;
import com.jarromie.NewPlugin.PluginPlugin;
import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;
import net.runelite.client.plugins.ChinBreakHandler.ChinBreakHandlerPlugin;

public class PluginTester {
    public static void main(String[] args) throws Exception {
        ExternalPluginManager.loadBuiltin(
                EthanApiPlugin.class,
                PacketUtilsPlugin.class,
                PiggyUtilsPlugin.class,
                PluginPlugin.class
                /* Don't remove these
                   Add your plugins in this method when running from the IDE.
                   Make sure to include them as a dependency in the build.gradle via `testImplementation`
                 */);
        RuneLite.main(args);
    }
}