import java.lang.IllegalArgumentException

/** Custom Setters and Setters
  */
 class Registration(email_id:String,password:String,age:Int){
    var email:String = email_id
        get(){
            return field.toLowerCase()
        }
     var pass :String = password
         set(value){
             field = if(value.length>6) value else throw IllegalArgumentException("password must be 6 letters")
         }
    var Age : Int = age
        set(value){
            field = if(value > 18) value else throw IllegalArgumentException("Must and should 18+ only")
        }
 }
fun main(){
    val reg = Registration("e.gurureddy@gmail.com","GuruReddy",22)
    println("Email Id :- ${reg.email}")
    println("Password :- ${reg.pass}")
    println("Age :- ${reg.Age}")

    reg.email="guruprasad@gmail.com"
    reg.pass="guru1"
    reg.Age=12
}