package com.papiricoh.eenergy;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import com.papiricoh.eenergy.init.ModRecipes;
import com.papiricoh.eenergy.proxy.CommonProxy;
import com.papiricoh.eenergy.util.handlers.RegistryHandler;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main
{
	//reference Class
    public static final String MODID = "eenergy";
    public static final String NAME = "Electric-Utilities Mod";
    public static final String VERSION = "0.2";
    public static final String CLIENT_PROXY = "com.papiricoh.eenergy.proxy.ClientProxy";
    public static final String COMMON_PROXY = "com.papiricoh.eenergy.proxy.CommonProxy";
    
    public static final int GUI_DEMELTING_FURNACE = 0;

    //Main Class
    private static Logger logger;
    
    @Instance
    public static Main instance;
    
    @SidedProxy(clientSide = Main.CLIENT_PROXY, serverSide = Main.COMMON_PROXY)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        RegistryHandler.otherRegistries();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        ModRecipes.init();
    }
}
