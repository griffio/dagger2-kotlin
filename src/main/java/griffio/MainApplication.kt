package griffio;

import griffio.components.SolarSystem;
import griffio.planets.OuterPlanets;
import griffio.planets.Planet;
import griffio.planets.TerrestrialPlanets;
import griffio.solarsystem.BaseApplication

fun main(args: Array<String>) {

    val solarSystem = MainApplication().solarSystem()
    println(solarSystem.terrestrial())
    println(solarSystem.outer())

}

public class MainApplication : BaseApplication() {

}