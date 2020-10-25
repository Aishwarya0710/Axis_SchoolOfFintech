package day5.DataService
import day5.Model.Test
import java.sql.*
import java.text.SimpleDateFormat
import java.util.*
import java.util.Date
import java.util.ArrayList as ArrayList1
fun makeTable()
{
    val statement = conn?.createStatement()
    if(statement?.execute("CREATE TABLE Customer  \n" +
                    "(  \n" +

                    "Name varchar(60),  \n" +
                    "contactno varchar(40),  \n" +
                    "Email varchar(60),  \n" +
                    "age int,  \n" +
                    "Address varchar(100),  \n" +
                    "TestConducted varchar(60),  \n" +
                    "price int,  \n" +
                    "testDate DATE" +
                    "); " )!!)

    {
        println("created successfully")
    }
    else
    {
        println("not done")
    }

}
fun insert(name:String,contactno:String, Email:String,age:Int,Address:String,TestConducted:String,price:Int,testDate:String):Boolean
    {
        var sql:String="INSERT INTO Customer (Name,contactno,Email,age,Address,TestConducted,price,testdate) VALUES (?, ?, ?, ?,?,?,?,?)";
        var statement: PreparedStatement? = conn?.prepareStatement(sql);
        if (statement != null) {
            statement.setString(1, name)
        };
        if (statement != null) {
            statement.setString(2, contactno)
        }
        if (statement != null) {
            statement.setString(3, Email)
        }
        if (statement != null) {
            statement.setInt(4, age)
        }
        if (statement != null) {
            statement.setString(5, Address)
        }
        if (statement != null) {
            statement.setString(6, TestConducted)
        }
        if (statement != null) {
            statement.setInt(7, price)
        }
        if (statement != null) {
            statement.setString(8, testDate)
        }
        var rowsInserted: Int? = statement?.executeUpdate()
        if (rowsInserted != null) {
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");}
        }
        return true;
    }

fun cancelbooking()
{
    println("enter your name")
    var read=Scanner(System.`in`)
    var name=read.nextLine()
    var sql:String="delete from Customer where Name='$name';"
  //  var statement: PreparedStatement? = conn?.prepareStatement(sql);
    val statement = conn?.createStatement()
   var delete=0
    delete= statement?.executeUpdate(sql)!!
    if(delete==0)
        println("unable to cancel your booking")
    else
        println("your booking is cancelled")


}
fun reschedule() {

    var read = Scanner(System.`in`)
    println("enter your name")
    val name=read.next()
    println("please enter the date")
    val testDate = read.next()
    val date1 = SimpleDateFormat("yyyy/mm/dd").parse(testDate)

    val currentDate = Date()
    if (currentDate.after(date1)) {
        var sql:String="update Customer set testdate='$testDate' where Name='$name';"
        //  var statement: PreparedStatement? = conn?.prepareStatement(sql);
        val statement = conn?.createStatement()
        var delete=0
        delete= statement?.executeUpdate(sql)!!
        if(delete==0)
            println("unable to reschedule")
        else
            println("successfully reschedule your booking")

    }
    else
        println("can't reschedule your test on this date")
}