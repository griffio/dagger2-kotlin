package griffio.planets

import java.math.BigDecimal

class Earth : Planet {

    override fun names(): String {
        return "Earth, Gaia, Terra"
    }

    override fun au(): BigDecimal {
        return "1.0".toBigDecimal()
    }
}
