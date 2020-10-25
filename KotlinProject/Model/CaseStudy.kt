
//home.kt
import day5.DataService.*
import day5.Model.Customer

import day5.Model.Test

import java.sql.Connection
import java.util.*

public var conn: Connection? = null
internal var username = "root" // provide the username
internal var password = "abc123" // provide the corresponding password
fun main()
{
    getConnection1()
    println("Enter to login as 1.Admin 2.Customer")
    var read=Scanner(System.`in`)
    val user=read.nextInt()
    when(user)
    {
        1 -> {
            println("Enter id password")
            val id=read.next()
            val pass=read.next()
            if(id.equals("root") && pass.equals("abc123"))
            {
                println("login successful")
            }

            println("enter one of the option 1.To get total revenue 2.Get data of all labs 3.get data of all customer 4.to insert test 5.exit")
            val option=read.nextInt()

                when (option) {
                    1 -> println("The generated revenue is " + getGeneratedRevenue())
                    2 -> getLabData()
                    3 -> getCustomerData()
                    4 -> insertLab()

                    else -> println("not valid option")
                }

        }
        2 ->{
           println("Enter 1.to book test 2.to cancel test booking  3.To reschedule your test")
            var input=read.nextInt()
            when(input) {
            1 -> {
                var T = Test()
                T.values()
                var C = Customer()

                var testCon = T.testName
                var price = T.price
                C.getPatientDetails(testCon, price)
            }
                2 -> cancelbooking()
                3 -> reschedule()
                else -> println("please enter valid data")
            }
        }
        else -> println("invalid option")
    }

    //makeTable()
    connectionClose();

}
