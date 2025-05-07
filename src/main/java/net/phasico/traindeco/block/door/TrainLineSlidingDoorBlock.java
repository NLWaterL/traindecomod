package net.phasico.traindeco.block.door;

import com.simibubi.create.content.decoration.slidingDoor.SlidingDoorBlock;
import net.phasico.traindeco.registry.TrainDecoEntityTypes;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class TrainLineSlidingDoorBlock extends SlidingDoorBlock {
    public TrainLineSlidingDoorBlock(Properties properties) {
        super(properties, GLASS_SET_TYPE.get(), false);
    }

    @Override
    public BlockEntityType<? extends TrainLineSlidingDoorBlockEntity> getBlockEntityType() {
        return TrainDecoEntityTypes.SLIDING_DOOR.get();
    }
}