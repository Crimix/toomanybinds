package dzwdz.toomanybinds;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(TooManyBinds.MOD_ID)
public class TooManyBinds {

    public static final String MOD_ID = "toomanybinds";
    private static final Logger LOGGER =LogManager.getLogger();

    public TooManyBinds() {
        IEventBus event = FMLJavaModLoadingContext.get().getModEventBus();

        MinecraftForge.EVENT_BUS.register(this);
    }

    public static Logger getLogger() {
        return LOGGER;
    }
}
