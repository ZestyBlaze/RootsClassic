package elucent.rootsclassic.item;

import elucent.rootsclassic.client.screen.TabletScreen;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class RunicTabletItem extends Item {

    public RunicTabletItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level levelAccessor, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (hand == InteractionHand.MAIN_HAND && levelAccessor.isClientSide) {
            TabletScreen.openScreen(player);
        }
        return new InteractionResultHolder<>(InteractionResult.PASS, stack);
    }
}
