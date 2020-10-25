package day5.Model

import day5.DataService.insert
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*


class Customer{

    var name:String=""
    var contactno:String=""
    var Email:String=""
    var age:Int=0
    var Address:String=""
    var TestConducted:String=""
    var price:Int=0
    var testDate:String=""
    fun getPatientDetails(testCon:String,testprice:Int)
    {
        var read=Scanner(System.`in`)
        println("Enter your name")
        name=read.nextLine()
        println("Enter contact number")
        contactno=read.nextLine()
        println("Enter E-mail address")
        Email=read.nextLine()
        println("Enter age")
        age=read.nextInt()
        read.nextLine()
        println("Enter your address")
        Address=read.nextLine()
        TestConducted=testCon
        price=testprice

        println("enter test date")
        val testDate = read.next()
        val date1 = SimpleDateFormat("yyyy/mm/dd").parse(testDate)
        val dateFormat: DateFormat = SimpleDateFormat("yyyy/MM/dd")
        val currentDate = Date()

        if (currentDate.after(date1)) {


            println("Your details are")
            if (insert(name, contactno, Email, age, Address, TestConducted, price, testDate)) {
                println("you are registered for test....Details are as follows")
                println("Name -"+name)
                println("Contact Details -" + contactno +"\t"+Email)
                println("Address -" + Address)
                println("Test to be Conducted -"+TestConducted)
                println("Bill amount -"+price)
                println("Date of test -"+testDate)

            } else
                println("not registered.....")
        }
        else{
           println("please enter another valid date")

        }
    }
}