package griffio;

import griffio.entity.Satellite
import griffio.solarsystem.BaseApplication

public class MainApplication : BaseApplication() {

    companion object {

        @JvmStatic public fun main(args: Array<String>) {

            val main = MainApplication()
            val solarSystem = main.solarSystem()
            println(solarSystem.terrestrial())
            println(solarSystem.outer())

            val someMoons = arrayListOf(Satellite(1L, "Callisto", 4800.0), Satellite(2L, "Luna", 3476.0))
            val moon = main.findSatellite(someMoons)
            println(moon)

        }
    }
}