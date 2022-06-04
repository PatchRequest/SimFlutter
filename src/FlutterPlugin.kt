import dhbw.sose2022.softwareengineering.airportagentsim.simulation.api.AirportAgentSimulation
import dhbw.sose2022.softwareengineering.airportagentsim.simulation.api.plugin.Plugin

class FlutterPlugin : Plugin {
    override fun activate() {
        AirportAgentSimulation.registerEntity(this,"FlutterAttack",FlutterAgent::class.java)
    }
}