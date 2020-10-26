package Assignment

import day3.Shape
import java.util.*

sealed class Cars{
    class Maruti(var type:String):Cars()
    class Hyundai(var type:String):Cars()
    class Honda(var type:String):Cars()

}
fun displayType(c:Cars)
{
    when(c)
    {
        is Cars.Maruti->println("Indian Make");
        is Cars.Hyundai->println("Korean make");
        is Cars.Honda->println("Japan make");
    }
}
fun main()
{
    var read= Scanner(System.`in`)
    println("Enter type of car")
    var type=read.next()
    when(type)
    {
        "Maruti","maruti" -> {
                          displayType(Cars.Maruti(type))}
        "Hyundai","hyundai" -> {//Cars.Hyundai(type)
                          displayType(Cars.Hyundai(type))
                        }
        "Honda","honda" -> {
                        displayType(Cars.Honda(type))}
        else-> println("Invalid input")
    }

}