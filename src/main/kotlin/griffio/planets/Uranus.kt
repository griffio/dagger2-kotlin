package griffio.planets

import java.math.BigDecimal

class Uranus : Planet {

    override fun names(): String {
        return "Uranus, Ouranos, Georgium Sidus"
    }

    override fun au(): BigDecimal {
        return "19.2".toBigDecimal()
    }
}
