package griffio.planets

import java.math.BigDecimal

class Mars : Planet {

    override fun names(): String {
        return "Mars, Red Planet"
    }

    override fun au(): BigDecimal {
        return "1.5".toBigDecimal()
    }
}
