package griffio.components

import dagger.Component
import griffio.modules.OuterPlanetsModule
import griffio.modules.SomePlanetsModule
import griffio.modules.TerrestrialPlanetsModule
import griffio.planets.OuterPlanets
import griffio.planets.PlanetsMap
import griffio.planets.TerrestrialPlanets
import javax.inject.Singleton

@Singleton
@Component(modules = [(TerrestrialPlanetsModule::class), (OuterPlanetsModule::class), (SomePlanetsModule::class)]) interface SolarSystem {
    fun terrestrial() : TerrestrialPlanets
    fun outer() : OuterPlanets
    fun planets(): PlanetsMap
}
