package griffio

import griffio.entity.Satellite
import griffio.solarsystem.BaseApplication

class MainApplication:BaseApplication () {

    companion object {

        @JvmStatic fun main(args: Array<String>) {

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