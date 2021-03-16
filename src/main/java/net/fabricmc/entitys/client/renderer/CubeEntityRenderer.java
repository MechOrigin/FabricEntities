package net.fabricmc.entitys.client.renderer;

import net.fabricmc.entitys.client.model.CubeEntityModel;
import net.fabricmc.entitys.entity.CubeEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class CubeEntityRenderer extends MobEntityRenderer<CubeEntity, CubeEntityModel> {

    public CubeEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new CubeEntityModel(), 0.5f);
    }

    @Override
    public Identifier getTexture(CubeEntity entity) {
        return new Identifier("entitys", "textures/entity/cube/cube.png");
    }

}
