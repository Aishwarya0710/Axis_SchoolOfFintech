package com.manipal.controller

import com.manipal.service.impl.*
import java.util.*

class CustomerController
{
    fun customerTasks() {
        var read = Scanner(System.`in`)
        println("enter one of the option 1.To book test 2.to reschedule 3.to cancel test 4.exit")
        var option = read.nextInt()
        while (option != 4) {
            var customerService = CustomerService()
            when (option) {
                1 -> {
                   customerService.bookTest()


                }
                2 -> {
                    customerService.rescheduleTest()
                }
                3 -> {
                     var test= TestService()
                    test.cancelTest()
                }
                4 -> break;
            }
            println("enter one of the option 1.To book test 2.to reschedule 3.to cancel test 4.exit")
            option = read.nextInt()

        }
    }   }