package griffio.modules;

import dagger.Module
import dagger.Provides
import griffio.planets.Jupiter
import griffio.planets.Neptune
import griffio.planets.Planet
import griffio.planets.Saturn
import griffio.planets.Uranus

import javax.inject.Named
import javax.inject.Singleton

@Module
public class OuterPlanetsModule {

    @Provides @Singleton @Named("Jupiter")
    fun fifth() : Planet {
        return Jupiter()
    }

    @Provides @Singleton @Named("Saturn")
    fun sixth() : Planet {
        return Saturn()
    }

    @Provides @Singleton @Named("Uranus")
    fun seventh() : Planet {
        return Uranus()
    }

    @Provides @Singleton @Named("Neptune")
    fun eighth() : Planet {
        return Neptune()
    }

}