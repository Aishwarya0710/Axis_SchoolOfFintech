package com.manipal.controller

import com.manipal.service.impl.*
import java.util.*

class AdminController
{

    fun adminTasks()
    {
        var read= Scanner(System.`in`)
        println("enter one of the option 1.To get total revenue 2.Get data of all labs 3.get data of all customer 4.to update tests and lab data 5.to cancel a booking 6.exit")
        var option=read.nextInt()
        while(option!=6) {
            var admin=AdminService()
            when (option) {
                1 -> {

                    admin.getGeneratedRevenue()

                }
                2 -> {

                    admin.getLabData()
                }
                3 ->{

                    admin.getCustomerData()
                }
                4 -> {
                    println("Enter 1.To insert lab 2.to delete lab ")
                    var operation=read.nextInt()
                    var update= UpdateLabData()
                    when(operation)
                    {
                        1 ->{

                            update.insertLab()
                        }
                        2 ->{
                            update.deleteLab()
                        }
                        else -> println("invalid input")
                    }
                }
                5 ->{
                    var test= TestService()
                    test.cancelTest()
                }
                6 -> break
                else -> println("not valid option")
            }
            println("enter one of the option 1.To get total revenue 2.Get data of all labs 3.get data of all customer 4.to insert test 5.exit")
            option=read.nextInt()
        }
    }
}
