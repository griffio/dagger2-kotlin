package griffio.planets

import java.math.BigDecimal

class Neptune : Planet {

    override  fun names() : String {
        return "Neptune, Le Verrier's planet, The planet exterior to Uranus"
    }

    override fun au(): BigDecimal {
        return "30.1".toBigDecimal()
    }
}
