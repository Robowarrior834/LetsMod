package com.RoboWarrior834.letsmod;

import com.RoboWarrior834.letsmod.Proxy.IProxy;
import com.RoboWarrior834.letsmod.References.References;
import com.RoboWarrior834.letsmod.handler.ConfigurationHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= References.Mod_ID,name=References.Mod_NAME,version=References.Mod_VERSION)
public class LetsMod
{
    //public static Configuration configuration;

    @Mod.Instance(References.Mod_ID)
    public static LetsMod instance;

    @SidedProxy(clientSide = References.CLIENT_PROXY_CLASS,serverSide = References.SERVER_PROXY_CLASS, GuiFactory = References.GUI_FACTORY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void PreInt(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    }
    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {

    }
    @Mod.EventHandler
    public void PostInt(FMLPostInitializationEvent event)
    {

    }

}

