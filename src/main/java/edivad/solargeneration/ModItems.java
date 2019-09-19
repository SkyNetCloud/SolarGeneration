package edivad.solargeneration;

import edivad.solargeneration.blocks.SolarPanel;
import edivad.solargeneration.items.LapisShard;
import edivad.solargeneration.items.PhotovoltaicCell;
import edivad.solargeneration.items.SolarCore;
import edivad.solargeneration.items.SolarHelmet;
import edivad.solargeneration.tools.SolarPanelLevel;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

public class ModItems {

	// solarCore
	@ObjectHolder(Main.MODID + ":solar_core_advanced")
	public static SolarCore solarCoreAdvanced;
	@ObjectHolder(Main.MODID + ":solar_core_hardened")
	public static SolarCore solarCoreHardened;
	@ObjectHolder(Main.MODID + ":solar_core_leadstone")
	public static SolarCore solarCoreLeadstone;
	@ObjectHolder(Main.MODID + ":solar_core_redstone")
	public static SolarCore solarCoreRedstone;
	@ObjectHolder(Main.MODID + ":solar_core_resonant")
	public static SolarCore solarCoreResonant;
	@ObjectHolder(Main.MODID + ":solar_core_signalum")
	public static SolarCore solarCoreSignalum;
	@ObjectHolder(Main.MODID + ":solar_core_ultimate")
	public static SolarCore solarCoreUltimate;

	// solarHelmet
	@ObjectHolder(Main.MODID + ":solar_helmet_advanced")
	public static SolarHelmet solarHelmetAdvanced;
	@ObjectHolder(Main.MODID + ":solar_helmet_hardened")
	public static SolarHelmet solarHelmetHardened;
	@ObjectHolder(Main.MODID + ":solar_helmet_leadstone")
	public static SolarHelmet solarHelmetLeadstone;
	@ObjectHolder(Main.MODID + ":solar_helmet_redstone")
	public static SolarHelmet solarHelmetRedstone;
	@ObjectHolder(Main.MODID + ":solar_helmet_resonant")
	public static SolarHelmet solarHelmetResonant;
	@ObjectHolder(Main.MODID + ":solar_helmet_signalum")
	public static SolarHelmet solarHelmetSignalum;
	@ObjectHolder(Main.MODID + ":solar_helmet_ultimate")
	public static SolarHelmet solarHelmetUltimate;

	// Other Items
	@ObjectHolder(Main.MODID + ":lapis_shard")
	public static LapisShard lapisShard;
	@ObjectHolder(Main.MODID + ":photovoltaic_cell")
	public static PhotovoltaicCell photovoltaicCell;

	public static void register(IForgeRegistry<Item> registry)
	{
		// solarCore
		registry.register(new SolarCore("solar_core_advanced"));
		registry.register(new SolarCore("solar_core_hardened"));
		registry.register(new SolarCore("solar_core_leadstone"));
		registry.register(new SolarCore("solar_core_redstone"));
		registry.register(new SolarCore("solar_core_resonant"));
		registry.register(new SolarCore("solar_core_signalum"));
		registry.register(new SolarCore("solar_core_ultimate"));

		// solarHelmet
		registry.register(new SolarHelmet(SolarPanelLevel.Advanced));
		registry.register(new SolarHelmet(SolarPanelLevel.Hardened));
		registry.register(new SolarHelmet(SolarPanelLevel.Leadstone));
		registry.register(new SolarHelmet(SolarPanelLevel.Redstone));
		registry.register(new SolarHelmet(SolarPanelLevel.Resonant));
		registry.register(new SolarHelmet(SolarPanelLevel.Signalum));
		registry.register(new SolarHelmet(SolarPanelLevel.Ultimate));

		// Other Items
		registry.register(new LapisShard());
		registry.register(new PhotovoltaicCell());

		// Blocks
		Item.Properties property = new Item.Properties().group(Main.solarGenerationTab);
		registry.register(new ItemBlock(ModBlocks.solarPanelAdvanced, property).setRegistryName(SolarPanel.getResourceLocation(SolarPanelLevel.Advanced)));
		registry.register(new ItemBlock(ModBlocks.solarPanelHardened, property).setRegistryName(SolarPanel.getResourceLocation(SolarPanelLevel.Hardened)));
		registry.register(new ItemBlock(ModBlocks.solarPanelLeadstone, property).setRegistryName(SolarPanel.getResourceLocation(SolarPanelLevel.Leadstone)));
		registry.register(new ItemBlock(ModBlocks.solarPanelRedstone, property).setRegistryName(SolarPanel.getResourceLocation(SolarPanelLevel.Redstone)));
		registry.register(new ItemBlock(ModBlocks.solarPanelResonant, property).setRegistryName(SolarPanel.getResourceLocation(SolarPanelLevel.Resonant)));
		registry.register(new ItemBlock(ModBlocks.solarPanelSignalum, property).setRegistryName(SolarPanel.getResourceLocation(SolarPanelLevel.Signalum)));
		registry.register(new ItemBlock(ModBlocks.solarPanelUltimate, property).setRegistryName(SolarPanel.getResourceLocation(SolarPanelLevel.Ultimate)));
	}
}