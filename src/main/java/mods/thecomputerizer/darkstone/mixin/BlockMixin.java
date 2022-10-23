package mods.thecomputerizer.darkstone.mixin;

import mods.thecomputerizer.darkstone.util.LightUtil;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = Block.class)
public class BlockMixin {
    
    @SuppressWarnings("deprecation")
    @Inject(at = @At(value = "HEAD"), method = "getLightValue(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)I", cancellable = true)
    private void darkstone_getLightValue(IBlockState state, IBlockAccess world, BlockPos pos, CallbackInfoReturnable<Integer> callback) {
        callback.setReturnValue(LightUtil.adjustedLightLevel(state.getLightValue(), ((Block)(Object)this).getUnlocalizedName()));
    }
}
