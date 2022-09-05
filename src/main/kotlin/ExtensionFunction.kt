class Student{
    fun isPassed(mark:Int):Boolean{
        return mark > 35
    }
}

fun Student.isExcellent(mark:Int):Boolean{
    return mark>90
}

fun Student.isFiled(mark:Int):Boolean{
    return  mark < 35
}

fun main(){
    val student = Student()
    println("Student1 passing Status ${student.isPassed(45)}")
    println("Student2 Excellent Status ${student.isExcellent(98)}")
    println("Student3 filed Status ${student.isFiled(25)}")
}