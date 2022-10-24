package mods.thecomputerizer.darkstone.mixin;

import net.minecraft.block.*;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = BlockStateContainer.StateImplementation.class)
public class BlockStateContainerMixin {

    @Shadow
    @Final
    private Block block;

    @Inject(at = @At(value = "HEAD"), method = "getLightValue()I", cancellable = true)
    private void darkstone_getLightValue(CallbackInfoReturnable<Integer> cir) {
        if(block instanceof BlockRedstoneTorch || block instanceof BlockRedstoneWire
                || block instanceof BlockRedstoneRepeater || block instanceof BlockRedstoneComparator
                || block instanceof BlockCompressedPowered) cir.setReturnValue(0);
    }

    @Inject(at = @At(value = "HEAD"), method = "getLightValue(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)I", cancellable = true)
    private void darkstone_getLightValueWorld(IBlockAccess world, BlockPos pos, CallbackInfoReturnable<Integer> cir) {
        if(block instanceof BlockRedstoneTorch || block instanceof BlockRedstoneWire
                || block instanceof BlockRedstoneRepeater || block instanceof BlockRedstoneComparator
                || block instanceof BlockCompressedPowered) cir.setReturnValue(0);
    }
}
