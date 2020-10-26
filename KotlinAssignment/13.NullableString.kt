package Assignment

fun main()
{
    var str:String?="I like to study kotlin"
    if(str!=null)
    {
        for(i in str.lastIndex downTo 0)
            print(str[i])
    }
}