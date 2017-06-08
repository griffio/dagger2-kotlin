package griffio

import com.querydsl.collections.CollQueryFactory
import griffio.components.DaggerSolarSystem
import griffio.components.SolarSystem
import griffio.entity.QSatellite
import griffio.entity.Satellite
import griffio.modules.OuterPlanetsModule
import griffio.modules.TerrestrialPlanetsModule
import griffio.planets.SomePlanetsEnum

class MainApplication() {

  fun solarSystem(): SolarSystem {
    return DaggerSolarSystem.builder()
        .terrestrialPlanetsModule(TerrestrialPlanetsModule())
        .outerPlanetsModule(OuterPlanetsModule())
        .build()
  }

  fun findSatellite(satellites: List<Satellite>): Satellite {
    return CollQueryFactory
        .from(QSatellite.satellite, satellites)
        .where(QSatellite.satellite.diameter.between(3000.0, 4000.0))
        .fetchFirst()
  }

  companion object {

    @JvmStatic fun main(args: Array<String>) {

      val main = MainApplication()
      val solarSystem = main.solarSystem()
      println(solarSystem.terrestrial())
      println(solarSystem.outer())
      println(solarSystem.planets().map[SomePlanetsEnum.EARTH])

      val someMoons = arrayListOf(Satellite(1L, "Callisto", 4800.0), Satellite(2L, "Luna", 3476.0))
      val moon = main.findSatellite(someMoons)
      println(moon)
    }
  }
}
