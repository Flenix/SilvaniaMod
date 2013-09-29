package co.uk.silvania.Silvania.client;

import co.uk.silvania.Silvania.CommonProxy;
import co.uk.silvania.Silvania.entity.EntityBuoy;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.client.model.ModelBoat;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {
    
    	@Override
    	public void registerRenderThings() {

    	}
    	
    	public void registerRenderInformation() {
    		//RenderingRegistry.registerEntityRenderingHandler(EntityBuoy.class, new RenderBuoy(new ModelBuoy(), 0.5F));
    		
    		//EntityRegistry.registerGlobalEntityID(EntityBuoy.class, "Buoy", EntityRegistry.findGlobalUniqueEntityId(), 123456, 123456);
    	}
    
}