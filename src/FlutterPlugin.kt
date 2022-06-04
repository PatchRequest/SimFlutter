import dhbw.sose2022.softwareengineering.airportagentsim.simulation.api.AirportAgentSimulation
import dhbw.sose2022.softwareengineering.airportagentsim.simulation.api.config.ConfigurableAttribute
import dhbw.sose2022.softwareengineering.airportagentsim.simulation.api.plugin.Plugin

class FlutterPlugin : Plugin {
    override fun activate() {
        for ( x in 0 until 100){
            AirportAgentSimulation.registerEntity(this, "FlutterAttack$x",FlutterChild::class.java, arrayOf(
                    ConfigurableAttribute("x",Int::class.java,x),
                    ConfigurableAttribute("y",Int::class.java,x),
                    ConfigurableAttribute("w",Int::class.java,1),
                    ConfigurableAttribute("h",Int::class.java,1)
            ))
        }

    }
}