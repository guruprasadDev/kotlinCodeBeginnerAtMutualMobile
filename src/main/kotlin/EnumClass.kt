enum class Days(val isWeekEnd : Boolean = false){
    SUNDAY(true),
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY(true);

    companion object{
        fun today(obj:Days):Boolean{
            return obj.name.compareTo("SATURDAY")==0 || obj.name.compareTo("SUNDAY")==0
        }
    }
}

fun main(){
    for(day in Days.values()){
        println("${day.ordinal} = ${day.name} and is weekend ${day.isWeekEnd}")
    }
}