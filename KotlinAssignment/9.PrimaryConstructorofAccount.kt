package Assignment

class Account(id:Int,type:String,name:String)
{
    var accId:Int=0
    var accType:String=""
    var Name:String=""
    init {
        accId=id
        accType=type
        Name=name
    }
}
fun main()
{
   val a=Account(456,"Saving Account","Ankit")
    val a1=Account(567,"Current Account","Richa")
    val a2=Account(345,"Saving Account","Anita")
    val a3=Account(206,"Student Account","Ram")
    val a4=Account(245,"Credit Account","Anshika")
    println("Name       Account Id        Account Type       ")
    println(a.Name +"\t"+ a.accId +"\t"+ a.accType)
    println(a1.Name +"\t"+ a1.accId +"\t"+ a1.accType)
    println(a2.Name +"\t"+ a2.accId +"\t"+ a2.accType)
    println(a3.Name +"\t"+ a3.accId +"\t"+ a3.accType)
    println(a4.Name +"\t"+ a4.accId +"\t"+ a4.accType)
}