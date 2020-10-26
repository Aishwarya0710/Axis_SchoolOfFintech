package Assignment


import java.util.*
fun main(args: Array<String>) {
    val read= Scanner(System.`in`)

    print("Enter age ")
    var age:Int=read.nextInt();
    print("enter weight")
    var weight:Int=read.nextInt();
    if(age>18 && weight>55)
    {
        println("you are allowed to donate blood")
    }
    else
    {
        println("you can't donate blood")
    }
}