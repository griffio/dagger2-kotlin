package griffio

import griffio.components.DaggerSolarSystem
import griffio.modules.OuterPlanetsModule
import griffio.modules.TerrestrialPlanetsModule
import org.junit.Test

class SolarSystemTests {

  @Test
  fun `earth is 1 au`() {

    val solarSystem = DaggerSolarSystem.builder()
        .terrestrialPlanetsModule(TerrestrialPlanetsModule())
        .outerPlanetsModule(OuterPlanetsModule())
        .build()

    assert(solarSystem.terrestrial().earth.au() == "1.0".toBigDecimal())
  }
}
