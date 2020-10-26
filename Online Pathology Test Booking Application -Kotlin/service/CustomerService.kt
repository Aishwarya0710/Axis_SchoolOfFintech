package com.manipal.service.impl
import com.manipal.dao.impl.CustomerDao
import com.manipal.model.Customer
import java.text.SimpleDateFormat
import java.util.*
class CustomerService
{
    var read=Scanner(System.`in`)
    fun bookTest()
    {
        println("Enter your location")
        var location=read.next()
        var getTest= CustomerDao()
        getTest.getTest(location)
        println("Enter the test id which you want to book")
        var testId=read.nextInt()
        var cust= Customer()
        cust.getCustomerInfo(testId)
    }
    fun rescheduleTest()
    {
        println("enter your name")
        val name=read.next()
        println("please enter the date")
        val testDate = read.next()
        val date1 = SimpleDateFormat("yyyy/mm/dd").parse(testDate)
        var reschedule=CustomerDao()
        reschedule.rescheduleTestDao(name,testDate)
    }
}