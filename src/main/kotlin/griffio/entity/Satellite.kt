package griffio.entity

import javax.persistence.Entity

@Entity class Satellite(var id : Long, var name : String, var diameter : Double) {

    override fun toString(): String {
        return "Satellite:$id:$name:$diameter (km)"
    }
}

