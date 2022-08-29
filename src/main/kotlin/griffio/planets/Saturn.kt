package griffio.planets

import java.math.BigDecimal

class Saturn : Planet {

    override fun names() : String {
        return "Saturn, Cronus, Shabbathai, Zuhal"
    }

    override fun au(): BigDecimal {
        return "9.5".toBigDecimal()
    }
}
