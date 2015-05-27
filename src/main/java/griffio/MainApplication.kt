package griffio;

import griffio.components.SolarSystem
import griffio.entity.Satellite
import griffio.planets.OuterPlanets
import griffio.planets.Planet
import griffio.planets.TerrestrialPlanets
import griffio.solarsystem.BaseApplication

fun main(args: Array<String>) {

    val main = MainApplication()
    val solarSystem = main.solarSystem()
    println(solarSystem.terrestrial())
    println(solarSystem.outer())

    val someMoons = arrayListOf(Satellite(1L, "Callisto", 4800.0), Satellite(2L, "Luna", 3476.0))
    val moon = main.findSatellite(someMoons)
    println(moon)

}

public class MainApplication : BaseApplication() {

}