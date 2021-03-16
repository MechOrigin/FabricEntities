package net.fabricmc.entitys;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.entitys.client.renderer.CubeEntityRenderer;
import net.fabricmc.entitys.client.renderer.SkellyEntityRenderer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class EntitysClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.INSTANCE.register(Entitys.CUBE, (dispatcher, context) -> {
            return new CubeEntityRenderer(dispatcher);
        });

        EntityRendererRegistry.INSTANCE.register(Entitys.SKELLY, (dispatcher, context) -> {
            return new SkellyEntityRenderer(dispatcher);
        });

    }
}
