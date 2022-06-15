package Decorations
//Create a simple data class, SpiceContainer, that holds one spice.
//Give SpiceContainer a property, label, that is derived from the name of the spice.
//Create some containers with spices and print out their labels.
fun main(args: Array<String>){
    val spiceCabinet = listOf(SpiceContainer(Curry("Yellow curry", "mild")),
    SpiceContainer(Curry("Red curry", "medium")),
    SpiceContainer(Curry("Green curry", "Hot")))
    for(element in spiceCabinet){
        println("${element.label},  ${element.spiciness}")
    }
}
abstract class Spice(val name: String, val spiciness: String = "mild"){
}
class Curry(name: String, spice: String): Spice(name, spice){}
data class SpiceContainer(val spice: Spice,
                          val label:String = spice.name,
                          val spiciness: String = spice.spiciness)
enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
}
interface SpiceColor{
    val color : Color
}
object GreenSpiceColor: SpiceColor{
    override val color = Color.GREEN
}
