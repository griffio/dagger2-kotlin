package griffio.modules

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import griffio.planets.SomePlanetKey
import griffio.planets.SomePlanetsEnum

@Module
class SomePlanetsModule {
    @Provides
    @IntoMap
    @SomePlanetKey(SomePlanetsEnum.EARTH)
    fun earth(): Int {
        return 3
    }
}
