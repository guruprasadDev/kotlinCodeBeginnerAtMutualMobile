class Lamp{
    private var isOn:Boolean = false

    fun turnOn(){
        isOn = true
    }

    fun turnOff(){
        isOn = false
    }

    fun displayLampLight(lamp:String){
        if (isOn == true) {
            println("$lamp lamp is on")
        }else{
            println("$lamp lamp is off")
        }
    }
}
fun main(){
    val lamp = Lamp()
    lamp.turnOn()

    lamp.displayLampLight("Lamp")
}