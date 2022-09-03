/** In Kotlin, one secondary constructor can call another secondary constructor of same class. This is done by using this() keyword.
*/

class NewConstructor(password:String){
    constructor(name:String,id:Int,password: String):this(password){
        println("name of :- $name")
        println("id value :- $id")
        println("password :-$password")
    }
}

fun main(){

    var va = NewConstructor("Guru Prasad",333,"guru@#$1g")
}