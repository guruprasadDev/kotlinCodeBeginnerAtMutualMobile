import java.awt.Component

data class Person(val id:Int,
                  val firstName:String,
                  val lastName:String,
                  val location:String){

    fun getName() = "$firstName $lastName"
}
fun main(){
    val person = Person(1,"guru prasad","esambattu","Andhra Pradesh,Chittoor")
    val person1 = Person(1,"guru prasad","esambattu","Andhra Pradesh,Chittoor")

    println( person.getName())

    println(person ==person1) // equalTo

    //ComponentN
    println(person.component1())
    println(person.component2())
    println(person.component3())
    println(person.component4())

    println("")
    println("")

    val(id,firstName,lastName,location)=person //destructing declaration

    println(id)
    println(firstName)
    println(lastName)
    println(location)

}
