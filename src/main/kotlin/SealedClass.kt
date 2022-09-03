sealed class Fruit(var x:String){
    class Apple:Fruit("Apple")
    class Mango:Fruit("Mango")
}
class Pomegranate:Fruit("pomegranate")
 fun display(fruit:Fruit){
     when(fruit){

         is Fruit.Apple -> println("${fruit.x} is good for your health")
         is Fruit.Mango -> println("${fruit.x} is so delicious")
         is Pomegranate -> println("${fruit.x} is good for  vitamin D")

     }
 }

fun main(){
    val obj1 = Fruit.Apple()
    val obj2 = Fruit.Mango()
    val obj3 = Pomegranate()


    display(obj1)
    display(obj2)
    display(obj3)
}