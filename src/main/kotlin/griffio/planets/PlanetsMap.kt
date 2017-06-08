package griffio.planets

import javax.inject.Inject

class PlanetsMap @Inject
constructor(val map: Map<SomePlanetsEnum, Int>) {
    init {
        assert(map[SomePlanetsEnum.EARTH] == 3)
    }
}
