package mods.thecomputerizer.darkredstone.mixin;

import net.minecraft.block.*;
import net.minecraft.block.state.BlockStateContainer;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = BlockStateContainer.StateImplementation.class, priority = 1002)
public class BlockStateContainerMixin {

    @Shadow
    @Final
    private Block block;

    @Inject(method = "getLightValue", at = @At(value = "HEAD"), cancellable = true)
    private void darkstone_getLightValue(CallbackInfoReturnable<Integer> cir) {
        if(block instanceof BlockRedstoneTorch || block instanceof BlockRedstoneWire
                || block instanceof BlockRedstoneRepeater || block instanceof BlockRedstoneComparator
                || block instanceof BlockCompressedPowered) {
            cir.setReturnValue(0);
        }
    }
    //, target = "Lnet/minecraft/block/state/BlockStateContainer/StateImplementation;func_185906_d()I"
}
