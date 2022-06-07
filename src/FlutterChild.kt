import dhbw.sose2022.softwareengineering.airportagentsim.simulation.api.AirportAgentSimulation
import dhbw.sose2022.softwareengineering.airportagentsim.simulation.api.geometry.Point
import dhbw.sose2022.softwareengineering.airportagentsim.simulation.api.simulation.entity.Agent
import kotlin.random.Random

class FlutterChild () : Agent() {
    private val logger = AirportAgentSimulation.getLogger(plugin)
    init {
        speed = 500.0
    }
    override fun pluginUpdate() {
        val worldHeight = world.height
        val worldWidth = world.width
        speed = 50.0
        counter++
        if ((counter % 1000) == 0) {
            logger.info("Mew Direction!")
            val random = Point(Random.nextInt(0,worldWidth),Random.nextInt(0,worldHeight))
            turn(random)

        }


    }
    companion object{
        var counter = 0



    }


}