package griffio.entity

import java.math.BigDecimal
import javax.persistence.Entity

@Entity class Satellite(var id: Long, var name: String, var diameter: BigDecimal) {

    override fun toString(): String {
        return "Satellite:$id:$name:$diameter (km)"
    }
}

