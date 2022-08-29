package griffio.planets

import java.math.BigDecimal

class Jupiter : Planet {

    override fun names(): String {
        return "Jupiter, Jove, The Gas Giant"
    }

    override fun au(): BigDecimal {
        return "5.2".toBigDecimal()
    }

}
