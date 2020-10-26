package Assignment
import java.util.*
fun main()
{
    val read= Scanner(System.`in`)
    print("Enter sales revenue ")
    var revenue:Int=read.nextInt();
    var bonus:Int=0
    when(revenue)
    {
        in 10000..20000 -> bonus=1500
        in 21000..40000 -> bonus=2500
        in 41000..60000 -> bonus=3500
        else -> println("not eligible for now")
    }
    println("bonus amt is $bonus" )
}