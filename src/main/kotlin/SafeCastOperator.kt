fun main(){

    val name: Any = "Guru"
    var safeString : String? = name as? String?
    var safeInt : Int? = name as? Int?

    println(safeInt)
    println(safeString)
}