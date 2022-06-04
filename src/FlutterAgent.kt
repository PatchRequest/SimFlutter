import dhbw.sose2022.softwareengineering.airportagentsim.simulation.api.geometry.Point
import dhbw.sose2022.softwareengineering.airportagentsim.simulation.api.simulation.entity.Agent


class FlutterAgent : Agent() {

    init {
        speed = .0
    }
    override fun pluginUpdate() {
        val childCount = children.size
        if (childCount < 200){
            val newChild =  FlutterChild()

            val success = world.entities.add(newChild)

            newChild.position = Point(position.x+1,position.y+1)

            if (!success){
                println("Shiiiiiit")
            }
            children += newChild

        }

        TODO("Not yet implemented")
    }
    companion object{
        val children = mutableListOf<FlutterChild>()


    }

}