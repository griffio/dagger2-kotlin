package griffio.planets;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.ImmutableSortedSet;

import javax.inject.Inject
import javax.inject.Named

public class TerrestrialPlanets [Inject] (Named("Mercury") val mercury: Planet, Named("Venus") val venus: Planet,
                                          Named("Earth") val earth: Planet, Named("Mars") val mars: Planet) {

    override fun toString(): String {
        return "${mercury} ${venus} ${earth} ${mars}"
    }
}
