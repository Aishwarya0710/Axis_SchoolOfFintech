package Assignment



tailrec fun factorial(n:Int,semiresult:Long=1):Long{
    return if(n==1)
    {
        semiresult.toLong()
    }
    else
    {
        factorial((n-1),n*semiresult);
    }
}
fun main(args: Array<String>)
{


    var number=20
    var result:Long=factorial(number)
    println("factorial of $number is $result")
}