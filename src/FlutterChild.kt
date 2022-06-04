import dhbw.sose2022.softwareengineering.airportagentsim.simulation.api.geometry.Point
import dhbw.sose2022.softwareengineering.airportagentsim.simulation.api.simulation.entity.Agent
import kotlin.random.Random

class FlutterChild : Agent() {
    init {
        speed = 1.0
    }
    override fun pluginUpdate() {
        val worldHeight = world.height
        val worldWidth = world.width
        val random = Point(Random.nextInt(0, worldHeight), Random.nextInt(0, worldWidth))
        turn(random)
    }
}