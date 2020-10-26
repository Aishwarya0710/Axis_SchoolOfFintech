package Assignment

fun calculateSI(P:Int,R:Float,T:Int,myLambda:(Float)->Unit)
{
    var SI: Float =(P*R*T)/100
    myLambda(SI)

}
fun main()
{
    val myLambda:(Float)->Unit={SI:Float->println("Simple interest is $SI")}
    calculateSI(2000,4.5f,2,myLambda)

}