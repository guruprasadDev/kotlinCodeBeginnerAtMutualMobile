interface MyInterface
{
    val idValue:Int

    fun abstractMethod():String

    fun doSomething(){
        println("Doing something work here !")
    }
}
class InterfaceImplement : MyInterface{

    override val idValue: Int = 3456

    override fun abstractMethod():String {
        return ("Implementing Abstract method")
    }
}

fun main(){
    val inter =   InterfaceImplement()
    println("Overriding the calling id Value ${inter.idValue}")
    println(inter.abstractMethod())
    inter.doSomething()
}