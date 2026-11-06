package elucent.rootsclassic.internal;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.world.item.crafting.RecipeManager;

/**
 * Copy of the class from Porting-Lib
 * <a href="https://github.com/Fabricators-of-Create/Porting-Lib/blob/1.20.1/modules/base/src/main/java/io/github/fabricators_of_create/porting_lib/event/common/RecipesUpdatedCallback.java">...</a>
 */
public interface RecipesUpdatedCallback {
    Event<RecipesUpdatedCallback> EVENT = EventFactory.createArrayBacked(RecipesUpdatedCallback.class, callbacks -> manager -> {
        for(RecipesUpdatedCallback event : callbacks)
            event.onRecipesUpdated(manager);
    });

    void onRecipesUpdated(RecipeManager manager);
}
