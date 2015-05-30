package griffio.planets;

public interface Planet {

    fun names() : String

    fun au() : Double

    override fun toString(): String {
        return "${names()} is ${au()} au"
    }
}
