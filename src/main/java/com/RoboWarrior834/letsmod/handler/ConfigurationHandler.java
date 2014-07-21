package com.RoboWarrior834.letsmod.handler;


import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean TestValue = false;
    public static void init(File configFile)
    {
        if(configuration==null) {
            Configuration configuration = new Configuration(configFile);
        }
    }
    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs)
    {
        if(eventArgs.modID.equals("LetsMod"))
        {
            syncConfig();
        }
    }

    public void syncConfig()
    {
        TestValue = configuration.getBoolean("ConfigValue", Configuration.CATEGORY_GENERAL, false,"this is a example of config value");
        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }

}
