package Assignment
import java.util.*
fun findElement(arr1: Array<Int>, a:Int):String
{
    for(i in arr1.indices)
    {
        if(arr1[i]==a) {
           return "found"
        }


    }
    return "not found"
}


fun main()
{
    var arr1:Array<Int> =arrayOf(23,78,89,70,56)
    var read=Scanner(System.`in`)
    println("enter the number to be found")
    var a:Int=read.nextInt();
    println(findElement(arr1,a))
}