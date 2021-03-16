package net.fabricmc.entitys.client.renderer;

import net.fabricmc.entitys.entity.SkellyEntity;
import net.minecraft.client.render.entity.BipedEntityRenderer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.model.SkeletonEntityModel;
import net.minecraft.util.Identifier;

public class SkellyEntityRenderer extends BipedEntityRenderer<SkellyEntity, SkeletonEntityModel<SkellyEntity>> {

    public SkellyEntityRenderer(EntityRenderDispatcher entityRenderdispatcher) {
        super(entityRenderdispatcher, new SkeletonEntityModel<>(), 0.5f);
    }

    @Override
    public Identifier getTexture(SkellyEntity entity) {
        return new Identifier("entitys", "textures/entity/skeleton/skelly.png");
    }

}
