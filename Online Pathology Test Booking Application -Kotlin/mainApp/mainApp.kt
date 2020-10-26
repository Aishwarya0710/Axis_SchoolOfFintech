package com.manipal.mainApp

import com.manipal.controller.AdminController
import com.manipal.controller.CustomerController
import java.util.*

fun main()
{
    println("Enter to login as 1.Admin 2.Customer")
    var read= Scanner(System.`in`)
    val user=read.nextInt()
    when(user)
    {
          1 ->{
                 println("Enter id password")
                 val id = read.next()
                 val pass = read.next()
                 if (id.equals("root") && pass.equals("abc123")) {
                     println("login successful")
                  }
                  var admin= AdminController()
                   admin.adminTasks()
                }
           2 -> {
                  var customer= CustomerController()
                  customer.customerTasks()

           }
           else -> println("Invalid Input ....Please enter a valid input")
    }
}
