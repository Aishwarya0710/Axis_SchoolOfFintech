package Assignment

import java.util.*
fun countVowels(str1:String):Int
{
    var count=0

    for(i in 0..str1.length-1)
    {
        when(str1[i]){
            'a','e' ,'i' ,'o' ,'u' -> count++
            'A','E' ,'I' ,'O' ,'U' -> count++
        }
    }
    return count
}
fun main() {
    var read=Scanner(System.`in`)
    println("enter string")
    val str1:String= read.nextLine()
    println("No of vwels are "+countVowels(str1))

}
