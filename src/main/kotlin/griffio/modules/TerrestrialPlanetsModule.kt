package griffio.modules

import dagger.Module
import dagger.Provides
import griffio.planets.*
import javax.inject.Named
import javax.inject.Singleton

@Module
public class TerrestrialPlanetsModule {

    @Provides @Singleton @Named("Mercury")
    public fun first() : Planet {
        return Mercury()
    }

    @Provides @Singleton @Named("Venus")
    public fun second() : Planet {
        return Venus()
    }

    @Provides @Singleton @Named("Earth")
    public fun third() : Planet {
        return Earth()
    }

    @Provides @Singleton @Named("Mars")
    public fun fourth() : Planet {
        return Mars()
    }

}