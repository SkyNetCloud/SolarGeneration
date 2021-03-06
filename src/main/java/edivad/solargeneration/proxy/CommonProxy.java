package edivad.solargeneration.proxy;

import com.google.common.util.concurrent.ListenableFuture;

import edivad.solargeneration.Main;
import edivad.solargeneration.ModBlocks;
import edivad.solargeneration.ModItems;
import edivad.solargeneration.network.Messages;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@Mod.EventBusSubscriber
public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e)
	{
		Messages.registerMessages(Main.MODID);
		MinecraftForge.EVENT_BUS.register(EventHandler.INSTANCE);

		//TODO: Test Waila
		//MainCompatHandler.registerWaila();
	}

	public void init(FMLInitializationEvent e)
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());
	}

	public void postInit(FMLPostInitializationEvent e)
	{

	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event)
	{
		ModBlocks.register(event.getRegistry());
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		ModItems.register(event.getRegistry());
	}

	public ListenableFuture<Object> addScheduledTaskClient(Runnable runnableToSchedule)
	{
		throw new IllegalStateException("This should only be called from client side");
	}

	public EntityPlayer getClientPlayer()
	{
		throw new IllegalStateException("This should only be called from client side");
	}
}
