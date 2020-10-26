package Assignment

class Account1
{
    var accId:Int=0
    var accType:String=""
    var Name:String=""
    constructor(id:Int,type:String,name:String) {
        accId=id
        accType=type
        Name=name
    }
}
fun main() {
    val a = Account1(456, "Saving Account", "Ankit")
    val a1 = Account1(567, "Current Account", "Richa")
    val a2 = Account1(345, "Saving Account", "Anita")
    val a3 = Account1(206, "Student Account", "Ram")
    val a4 = Account1(245, "Credit Account", "Anshika")
    println("Name       Account Id        Account Type       ")
    println(a.Name + "\t" + a.accId + "\t" + a.accType)
    println(a1.Name + "\t" + a1.accId + "\t" + a1.accType)
    println(a2.Name + "\t" + a2.accId + "\t" + a2.accType)
    println(a3.Name + "\t" + a3.accId + "\t" + a3.accType)
    println(a4.Name + "\t" + a4.accId + "\t" + a4.accType)
}