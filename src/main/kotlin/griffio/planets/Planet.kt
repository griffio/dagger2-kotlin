package griffio.planets

import java.math.BigDecimal

interface Planet {

    fun names(): String

    fun au(): BigDecimal

    fun asString(): String = "${names()} is ${au()} au"
}
