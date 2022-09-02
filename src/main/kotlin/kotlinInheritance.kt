open class EmployeeAtMM(name:String,experience:Int,salary:Double){
    init {
        println("My name is $name , I have $experience years of Experience and earning are $salary")
    }
}

class WebsiteDeveloper(name:String,experience:Int,salary:Double):EmployeeAtMM(name,experience,salary){

    fun webDev(){
        println("Iam Web Developer")
        println("")

    }
}

class AndroidAppDeveloper(name:String,experience:Int,salary:Double):EmployeeAtMM(name,experience,salary){

    fun androidDev(){
        println("Iam Android App Developer")
        println("")

    }
}

class IosDeveloper(name:String,experience:Int,salary:Double):EmployeeAtMM(name,experience,salary){

    fun iosDev(){
        println("Iam Ios Developer")
        println("")

    }
}

fun main(){
    val wd = WebsiteDeveloper("E.H, Sai Kumar",4,450000.0)
    wd.webDev()
    val ad = AndroidAppDeveloper("E.Guru Prasad Reddy",3,400000.0)
    ad.androidDev()
    val id = IosDeveloper("A.Vishnu Priya",2,360000.0)
    id.iosDev()
}