package com.jarromie.NewPlugin;


@PluginDescriptor(name = "<html><font color=\"#990099\">[JD]</font> New Plugin</html>",
        description = "",
        enabledByDefault = false,
        tags = {"jarromie","plugin",})
@Slf4j
@PluginDependency(PacketUtilsPlugin.class)
@PluginDependency(EthanApiPlugin.class)
public class NewPlugin extends Plugin {

    @Inject
    private NewPluginConfig config;
    @Inject
    private NewPluginOverlay overlay;

    @Inject
    Client client;
    @Inject
    private ClientThread clientThread;
    @Inject
    private OverlayManager overlayManager;
    @Inject
    private ReflectBreakHandler breakHandler;

    @Provides
    public AutoRoguesConfig getConfig(ConfigManager configManager) {
        return configManager.getConfig(NewPluginConfig.class);
    }


    @Override
    protected void startUp() throws Exception {
        keyManager.registerKeyListener(toggle);
        breakHandler.registerPlugin(this);
        overlayManager.add(overlay);
    }

    @Override
    protected void shutDown() throws Exception {
        keyManager.unregisterKeyListener(toggle);
        breakHandler.unregisterPlugin(this);
        overlayManager.remove(overlay);
    }

    @Subscribe
    public void onGameTick(GameTick event) {
        //
    }


    private void start(){
        breakHandler.startPlugin(this);
    }

    private void stop(){
        breakHandler.stopPlugin(this);
    }
}
