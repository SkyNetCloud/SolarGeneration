package edivad.solargeneration;

import edivad.solargeneration.items.LapisShard;
import edivad.solargeneration.items.PhotovoltaicCell;
import edivad.solargeneration.items.SolarCore;
import edivad.solargeneration.items.SolarHelmet;
import edivad.solargeneration.tools.SolarPanelLevel;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

	// solarCore
	@GameRegistry.ObjectHolder(Main.MODID + ":solar_core_advanced")
	public static SolarCore solarCoreAdvanced;
	@GameRegistry.ObjectHolder(Main.MODID + ":solar_core_hardened")
	public static SolarCore solarCoreHardened;
	@GameRegistry.ObjectHolder(Main.MODID + ":solar_core_leadstone")
	public static SolarCore solarCoreLeadstone;
	@GameRegistry.ObjectHolder(Main.MODID + ":solar_core_redstone")
	public static SolarCore solarCoreRedstone;
	@GameRegistry.ObjectHolder(Main.MODID + ":solar_core_resonant")
	public static SolarCore solarCoreResonant;
	@GameRegistry.ObjectHolder(Main.MODID + ":solar_core_signalum")
	public static SolarCore solarCoreSignalum;
	@GameRegistry.ObjectHolder(Main.MODID + ":solar_core_ultimate")
	public static SolarCore solarCoreUltimate;

	// solarHelmet
	@GameRegistry.ObjectHolder(Main.MODID + ":solar_helmet_advanced")
	public static SolarHelmet solarHelmetAdvanced;
	@GameRegistry.ObjectHolder(Main.MODID + ":solar_helmet_hardened")
	public static SolarHelmet solarHelmetHardened;
	@GameRegistry.ObjectHolder(Main.MODID + ":solar_helmet_leadstone")
	public static SolarHelmet solarHelmetLeadstone;
	@GameRegistry.ObjectHolder(Main.MODID + ":solar_helmet_redstone")
	public static SolarHelmet solarHelmetRedstone;
	@GameRegistry.ObjectHolder(Main.MODID + ":solar_helmet_resonant")
	public static SolarHelmet solarHelmetResonant;
	@GameRegistry.ObjectHolder(Main.MODID + ":solar_helmet_signalum")
	public static SolarHelmet solarHelmetSignalum;
	@GameRegistry.ObjectHolder(Main.MODID + ":solar_helmet_ultimate")
	public static SolarHelmet solarHelmetUltimate;

	// Other Items
	@GameRegistry.ObjectHolder(Main.MODID + ":lapis_shard")
	public static LapisShard lapisShard;
	@GameRegistry.ObjectHolder(Main.MODID + ":photovoltaic_cell")
	public static PhotovoltaicCell photovoltaicCell;

	@SideOnly(Side.CLIENT)
	public static void initModels()
	{
		// solarCore
		solarCoreAdvanced.initModel();
		solarCoreHardened.initModel();
		solarCoreLeadstone.initModel();
		solarCoreRedstone.initModel();
		solarCoreResonant.initModel();
		solarCoreSignalum.initModel();
		solarCoreUltimate.initModel();

		// solarHelmet
		solarHelmetAdvanced.initModel();
		solarHelmetHardened.initModel();
		solarHelmetLeadstone.initModel();
		solarHelmetRedstone.initModel();
		solarHelmetResonant.initModel();
		solarHelmetSignalum.initModel();
		solarHelmetUltimate.initModel();

		// Other Items
		lapisShard.initModel();
		photovoltaicCell.initModel();
	}

	public static void register(IForgeRegistry<Item> registry)
	{
		// solarCore
		for(SolarPanelLevel level : SolarPanelLevel.values())
			registry.register(new SolarCore(level));

		// solarHelmet
		for(SolarPanelLevel level : SolarPanelLevel.values())
			registry.register(new SolarHelmet(level));

		// Other Items
		registry.register(new LapisShard());
		registry.register(new PhotovoltaicCell());

		// Blocks
		registry.register(new ItemBlock(ModBlocks.solarPanelLeadstone).setRegistryName(SolarPanelLevel.Leadstone.getBlockResourceLocation()));
		registry.register(new ItemBlock(ModBlocks.solarPanelHardened).setRegistryName(SolarPanelLevel.Hardened.getBlockResourceLocation()));
		registry.register(new ItemBlock(ModBlocks.solarPanelRedstone).setRegistryName(SolarPanelLevel.Redstone.getBlockResourceLocation()));
		registry.register(new ItemBlock(ModBlocks.solarPanelSignalum).setRegistryName(SolarPanelLevel.Signalum.getBlockResourceLocation()));
		registry.register(new ItemBlock(ModBlocks.solarPanelResonant).setRegistryName(SolarPanelLevel.Resonant.getBlockResourceLocation()));
		registry.register(new ItemBlock(ModBlocks.solarPanelAdvanced).setRegistryName(SolarPanelLevel.Advanced.getBlockResourceLocation()));
		registry.register(new ItemBlock(ModBlocks.solarPanelUltimate).setRegistryName(SolarPanelLevel.Ultimate.getBlockResourceLocation()));
	}
}
