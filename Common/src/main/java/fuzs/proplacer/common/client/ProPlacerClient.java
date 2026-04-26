package fuzs.proplacer.common.client;

import fuzs.proplacer.common.client.handler.FastBreakingHandler;
import fuzs.proplacer.common.client.handler.FastPlacementHandler;
import fuzs.proplacer.common.client.handler.KeyBindingHandler;
import fuzs.proplacer.common.client.handler.ReachAroundPlacementHandler;
import fuzs.puzzleslib.common.api.client.core.v1.ClientModConstructor;
import fuzs.puzzleslib.common.api.client.core.v1.context.KeyMappingsContext;
import fuzs.puzzleslib.common.api.client.event.v1.ClientTickEvents;
import fuzs.puzzleslib.common.api.client.event.v1.entity.player.InteractionInputEvents;
import fuzs.puzzleslib.common.api.event.v1.LoadCompleteCallback;
import fuzs.puzzleslib.common.api.event.v1.entity.player.PlayerInteractEvents;

public class ProPlacerClient implements ClientModConstructor {

    @Override
    public void onConstructMod() {
        registerEventHandlers();
    }

    private static void registerEventHandlers() {
        PlayerInteractEvents.USE_BLOCK.register(FastPlacementHandler.INSTANCE::onUseBlock);
        InteractionInputEvents.USE.register(ReachAroundPlacementHandler::onUseInteraction);
        ClientTickEvents.START.register(FastPlacementHandler.INSTANCE::onStartClientTick);
        ClientTickEvents.START.register(FastBreakingHandler.INSTANCE::onStartClientTick);
        PlayerInteractEvents.ATTACK_BLOCK.register(FastBreakingHandler.INSTANCE::onAttackBlock);
        LoadCompleteCallback.EVENT.register(KeyBindingHandler::onLoadComplete);
    }

    @Override
    public void onRegisterKeyMappings(KeyMappingsContext context) {
        KeyBindingHandler.onRegisterKeyMappings(context);
    }
}
