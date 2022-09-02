

abstract class Employee(private val name:String, private val experience:Int){

    abstract val salary :Double

    abstract fun dateOfBirth(date:String)

    fun employeeDetails(){
        println("Employee name $name")
        println("Employee Experience $experience")
        println("Employee annual salary $salary")
    }
}
class DeveloperAtMutualMobile(name:String,experience:Int):Employee(name,experience){

    override val salary = 400000.0

    override fun dateOfBirth(date:String){
        println("Date of birth is $date")
    }

}
fun main() {
    val eng = DeveloperAtMutualMobile("E.Guru Prasad",3)
    eng.employeeDetails()
    eng.dateOfBirth("30/12/2000")

}