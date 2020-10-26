package Assignment
import java.util.*
class Calculator{
    companion object{
        fun add(a:Int,b:Int):Int
        {
            return a+b;
        }
        fun sub(a:Int,b:Int):Int
        {
            return a-b;
        }
        fun mult(a:Int,b:Int):Int
        {
            return a*b;
        }
        fun div(a:Int,b:Int):Int
        {
            return a/b;
        }
    }
}
fun main()
{
    var read=Scanner(System.`in`)
    println("enter two value")
    var a=read.nextInt()
    var b=read.nextInt()
    println("sum is "+Calculator.add(a,b))
    if(a>b)
        println("difference is "+Calculator.sub(a,b))
    else
        println("difference is "+Calculator.sub(b,a))
    println("product is "+Calculator.mult(a,b))
    if(a>b)
       println("division is "+Calculator.div(a,b))
    else
        println("division is "+Calculator.div(b,a))
}