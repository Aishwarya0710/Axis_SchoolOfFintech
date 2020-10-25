package day5.Model

import day5.DataService.desiredTest
import day5.DataService.getData
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.SQLException
import java.util.*
import kotlin.collections.ArrayList
import day5.DataService.desiredTest as desiredTest1



public class Test{
    var testId:Int=0
    var testName:String=""
   var labName:String=""
    var labLocation:String=""
    var price:Int=0
    fun values(){
        println("enter your location")
        var read = Scanner(System.`in`)
        var loc = read.nextLine()
        getData(loc)

        println("please enter the id of the test")
        var id=read.nextInt()
        var result: ArrayList<Any> = desiredTest(id)
        testId = result.get(0) as Int
        testName = result.get(1) as String
        labName = result.get(2) as String
        labLocation = result.get(3) as String
        price = result.get(4) as Int

        println(" " + testId + "\t " + testName + "\t " + " " + labName + "\t " + labLocation + "\t " + price)



        }



    }

