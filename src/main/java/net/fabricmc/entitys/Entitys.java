package net.fabricmc.entitys;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.entitys.entity.CubeEntity;
import net.fabricmc.entitys.entity.SkellyEntity;
import net.fabricmc.entitys.spawns.SpawnInit;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Entitys implements ModInitializer {

	public static final EntityType<CubeEntity> CUBE = Registry.register(
		Registry.ENTITY_TYPE,
		new Identifier("entitys", "cube"),
		FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, CubeEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
	);

	public static final EntityType<SkellyEntity> SKELLY = Registry.register(
		Registry.ENTITY_TYPE,
		new Identifier("entitys", "skelly"),
		FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, SkellyEntity::new).dimensions(EntityDimensions.fixed(0.6f, 1.99f)).build()
	);

	@Override
	public void onInitialize() {
		FabricDefaultAttributeRegistry.register(CUBE, CubeEntity.createMobAttributes());

		FabricDefaultAttributeRegistry.register(SKELLY, SkellyEntity.createMobAttributes());

		SpawnInit.init();

	}
}
