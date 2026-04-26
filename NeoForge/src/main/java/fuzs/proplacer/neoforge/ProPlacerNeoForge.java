package fuzs.proplacer.neoforge;

import fuzs.proplacer.common.ProPlacer;
import fuzs.puzzleslib.common.api.core.v1.ModConstructor;
import net.neoforged.fml.common.Mod;

@Mod(ProPlacer.MOD_ID)
public class ProPlacerNeoForge {

    public ProPlacerNeoForge() {
        ModConstructor.construct(ProPlacer.MOD_ID, ProPlacer::new);
    }
}
