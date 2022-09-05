open class BaseClass(){
    val a= 7 //by default its public

    private val b = 10 // private base class only

    internal val c = "Internal" //visible only in the same module

  protected open val d = 360 // visible in base clas and derived class


}

class DerivedClass: BaseClass() {

    // a,c,d of the base class are visible

    // b is not visible

    override val d = 4 // d is protected
}

fun main(){

    val bC = BaseClass()
    println(bC.a)
    println(bC.c)

    // bC.a and bC.c are visible

    //bC.b and bc.d are not visible

    val dC = DerivedClass()

    //dc.d are not visible

}