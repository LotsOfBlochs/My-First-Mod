package com.lotsofblochs.blochs.entities.souleater;

import com.lotsofblochs.blochs.Blochs;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class SoulEaterEntity extends HostileEntity {
    public SoulEaterEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    public static final EntityType<SoulEaterEntity> SOUL_EATER = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(Blochs.MOD_ID, "soul_eater"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, SoulEaterEntity::new).dimensions(EntityDimensions.fixed(1.5f, 2.75f)).build()
    );

}
/*TODO:Add Texture, Pathfinding, Tags, drops*/