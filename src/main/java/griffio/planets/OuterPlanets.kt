package griffio.planets

import javax.inject.Inject
import javax.inject.Named

public class OuterPlanets @Inject constructor(@Named("Jupiter") val jupiter: Planet,
                                              @Named("Saturn") val saturn: Planet,
                                              @Named("Uranus") val uranus: Planet,
                                              @Named("Neptune") val neptune: Planet) {
    override fun toString(): String {
        return "${jupiter.asString()} ${saturn.asString()} ${uranus.asString()} ${neptune.asString()}"
    }
}
