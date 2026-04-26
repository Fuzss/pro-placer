package fuzs.proplacer.neoforge.client;

import fuzs.proplacer.common.ProPlacer;
import fuzs.proplacer.common.client.ProPlacerClient;
import fuzs.proplacer.common.data.client.ModLanguageProvider;
import fuzs.puzzleslib.common.api.client.core.v1.ClientModConstructor;
import fuzs.puzzleslib.neoforge.api.data.v2.core.DataProviderHelper;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;

@Mod(value = ProPlacer.MOD_ID, dist = Dist.CLIENT)
public class ProPlacerNeoForgeClient {

    public ProPlacerNeoForgeClient() {
        ClientModConstructor.construct(ProPlacer.MOD_ID, ProPlacerClient::new);
        DataProviderHelper.registerDataProviders(ProPlacer.MOD_ID, ModLanguageProvider::new);
    }
}
