package griffio.planets

import java.math.BigDecimal

class Venus : Planet {

    override fun names(): String {
        return "Venus, Sister Planet"
    }

    override fun au(): BigDecimal {
        return "0.7".toBigDecimal()
    }
}
