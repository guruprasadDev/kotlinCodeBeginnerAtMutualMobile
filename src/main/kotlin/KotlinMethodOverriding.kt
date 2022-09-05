class Operator{
    fun sum(a:Int,b:Int){
        println("Sum $a + $b = ${a+b}")
    }
    fun sum(a:Int,b:Int,c:Int){
        println("Sum $a + $b + $c = ${a+b+c}")
    }
    fun sum(a:Int,b:Int,c:Int,d:Int){
        println("Sum $a + $b + $c + $d = ${a+b+c+d}")
    }
}
fun main(){
    val opr = Operator()
    opr.sum(7,77)
    opr.sum(8,88,99)
    opr.sum(9,99,999,1000)
}
