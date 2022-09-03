class Outer{
    val a = "Outside Nested Class"

    inner class InnerClass{
        fun callMe() = a
    }
}

fun main(){
    val outside = Outer()
    println("outside outer object ${outside.InnerClass().callMe()}")

    val inner = Outer().InnerClass()
    println("Using inner Object  ${inner.callMe()}")
}