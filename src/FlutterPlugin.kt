import dhbw.sose2022.softwareengineering.airportagentsim.simulation.api.AirportAgentSimulation
import dhbw.sose2022.softwareengineering.airportagentsim.simulation.api.config.ConfigurableAttribute
import dhbw.sose2022.softwareengineering.airportagentsim.simulation.api.plugin.Plugin

class FlutterPlugin : Plugin {
    override fun activate() {
        AirportAgentSimulation.registerEntity(this, "FlutterAttack",FlutterAgent::class.java)
        AirportAgentSimulation.registerEntity(this, "FlutterChild",FlutterChild::class.java)
    /*
        for ( x in 0 until 100){
            AirportAgentSimulation.registerEntity(this, "FlutterAttack$x",FlutterChild::class.java, arrayOf(
                    ConfigurableAttribute("x",java.lang.Integer::class.java,x as java.lang.Integer),
                    ConfigurableAttribute("y",java.lang.Integer::class.java,x as java.lang.Integer),
                    ConfigurableAttribute("w",java.lang.Integer::class.java,1 as java.lang.Integer),
                    ConfigurableAttribute("h",java.lang.Integer::class.java,1 as java.lang.Integer)
            ))
        }*/
    }
}