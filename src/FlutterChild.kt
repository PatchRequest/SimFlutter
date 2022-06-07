import dhbw.sose2022.softwareengineering.airportagentsim.simulation.api.geometry.Point
import dhbw.sose2022.softwareengineering.airportagentsim.simulation.api.simulation.entity.Agent
import kotlin.random.Random

class FlutterChild (val x:java.lang.Integer, val y:java.lang.Integer, val w:java.lang.Integer, val h:java.lang.Integer) : Agent() {
    init {
        speed = 1.0
    }
    override fun pluginUpdate() {
        val worldHeight = world.height
        val worldWidth = world.width
        val random = Point(Random.nextInt(0, worldHeight), Random.nextInt(0, worldWidth))
        turn(random)
    }

    override fun onBirth() {
        super.onBirth()
        position = Point(x as Int,y as Int)
        width = w as Int
        height = h as Int
    }
}