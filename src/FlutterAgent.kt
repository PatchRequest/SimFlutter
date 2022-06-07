import dhbw.sose2022.softwareengineering.airportagentsim.simulation.api.AirportAgentSimulation
import dhbw.sose2022.softwareengineering.airportagentsim.simulation.api.geometry.Point
import dhbw.sose2022.softwareengineering.airportagentsim.simulation.api.simulation.entity.Agent


class FlutterAgent : Agent() {

    private val logger = AirportAgentSimulation.getLogger(plugin)

    init {
        speed = .0
    }

    override fun onBirth() {
        super.onBirth()
        logger.info("Hello World! from FlutterAgent")
    }
    override fun pluginUpdate() {

        val childCount = children.size
        if (childCount < 200){


            counter++
            if (counter % 500 == 0) {
                val newChild =  FlutterChild()
                logger.info("Spawning Child!")
                newChild.spawn(world,position.x+1000,position.y+1000,500,500)
                children += newChild
            }




        }


    }
    companion object{
        val children = mutableListOf<FlutterChild>()
        var counter = 0


    }

}