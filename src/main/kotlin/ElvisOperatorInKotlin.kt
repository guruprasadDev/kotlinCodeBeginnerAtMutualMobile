fun main(){
    var str1 : String? = null
    var str2 :String? = "Guruprasadreddy"

    val len1 : Int = str1?.length ?:  -1

    val len2 : Int =str2?.length ?: -1

    println(len1)
    println(len2)

}

