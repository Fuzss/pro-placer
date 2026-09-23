package fuzs.proplacer.common.data.client;

import fuzs.proplacer.common.ProPlacer;
import fuzs.proplacer.common.client.handler.KeyBindingHandler;
import fuzs.puzzleslib.common.api.client.data.v3.language.AbstractLanguageProvider;
import fuzs.puzzleslib.common.api.data.v3.core.DataProviderContext;

public class ModLanguageProvider extends AbstractLanguageProvider {

    public ModLanguageProvider(DataProviderContext context) {
        super(context);
    }

    @Override
    public void addTranslations() {
        this.addKeyCategory(ProPlacer.MOD_ID, ProPlacer.MOD_NAME);
        this.add(KeyBindingHandler.KEY_TOGGLE_FAST_PLACEMENT, "Toggle Fast Block Placement");
        this.add(KeyBindingHandler.KEY_FAST_PLACEMENT_MESSAGE, "Fast Block Placement: %s");
    }
}
