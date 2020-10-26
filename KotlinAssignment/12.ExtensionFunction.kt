package Assignment
import java.util.*
fun MutableMap<Int,Float>.calculateSI(P:Int,R:Float,T:Int):MutableMap<Int,Float>
{
    val SI=(P*R*T)/100
   this.set(P,SI)
    return this
}

fun main()
{
    val myMap:MutableMap<Int,Float> = mutableMapOf<Int,Float>()
    var read=Scanner(System.`in`)
    println("Enter principal amount")
    var P=read.nextInt()
    println("Enter rate")
    var R=read.nextFloat()
    println("Enter time period")
    var T=read.nextInt()
    val Result=myMap.calculateSI(P,R,T)
    println("Principle amt : ${Result.keys}  Simple Interest: ${Result.values}")
}