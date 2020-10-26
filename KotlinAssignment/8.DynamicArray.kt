package Assignment

fun main()
{
    var arr1:Array<Any> =arrayOf(45,67,"Banana","Apple",90,89.0f)
    println("elements of array are")
    for(index in 0..arr1.lastIndex)
    {
        print(" "+arr1[index])
    }
}