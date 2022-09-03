class OuterClass{
    val outer ="Outside Nested Class"

class NestedClass {
    val inner = "Inside Nested Class"
    fun callMe() {
        println("Function calling the nested function")
    }
 }
}

fun main(){
    println(OuterClass.NestedClass().inner)

    val nest = OuterClass.NestedClass()
    nest.callMe()
}