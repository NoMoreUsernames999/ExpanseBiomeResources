package expansebiomeresource.mod.util.handlers;

import expansebiomeresource.mod.init.BiomeInit;
import expansebiomeresource.mod.world.WorldTypes;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

//Will look for all event bus subscribers when loading. Does not need to be referenced in main 
@EventBusSubscriber 
public class RegistryHandler {
	
	public static void preInitRegistries() { 
		
		BiomeInit.registerBiomes();
	}
	
	public static void postInitRegistries() {
		WorldTypes.init();
	}
}
