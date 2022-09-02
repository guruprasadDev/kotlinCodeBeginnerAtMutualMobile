fun student(name:String,rollNo:Int,course:String){
    startingPointOfProgram()
    println("Name of the student $name")
    println("Student Roll Number $rollNo")
    println("Name of the Course $course")
    endingPointOfProgram()

}

fun main(){
    student("E.Guru Prasad",7,"Bachelors of Computer Application")
    student("E.Sai Kumar",8,"Bachelors of  Arts and Science")

}

fun startingPointOfProgram(){
    println("")
    println("Starting Point of Program")
    println("*****************************")
    println("")
}

fun endingPointOfProgram(){
    println("")
    println("*****************************")
    println("Ending Point of Program")
}