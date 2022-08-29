package griffio.planets

import java.math.BigDecimal

class Mercury : Planet {

    override fun names(): String {
        return "Mercury"
    }

    override fun au(): BigDecimal {
        return "0.45".toBigDecimal()
    }
}
