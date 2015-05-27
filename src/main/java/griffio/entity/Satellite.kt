package griffio.entity

import java.util.Date
import javax.persistence.Entity

Entity
public class Satellite(var id : Long, var name : String, var diameter : Double) {

    override fun toString(): String {
        return "Satellite:${id}:${name}:${diameter} (km)"
    }
}

