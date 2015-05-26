package griffio.planets;

public trait Planet {

    fun names() : String

    fun au() : Double

    override fun toString(): String {
        return "${names()} is ${au()} au"
    }
}
