package elucent.rootsclassic.mixin.internal.client;

import elucent.rootsclassic.internal.RecipesUpdatedCallback;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.network.protocol.game.ClientboundUpdateRecipesPacket;
import net.minecraft.world.item.crafting.RecipeManager;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPacketListener.class)
public class ClientPacketListenerMixin {
    @Shadow @Final private RecipeManager recipeManager;

    @Inject(method = "handleUpdateRecipes", at = @At("TAIL"))
    private void roots_internal$handleUpdateRecipes(ClientboundUpdateRecipesPacket packet, CallbackInfo ci) {
        RecipesUpdatedCallback.EVENT.invoker().onRecipesUpdated(this.recipeManager);
    }
}
