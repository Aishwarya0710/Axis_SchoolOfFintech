package com.manipal.service.impl

import com.manipal.dao.impl.UpdateLabDao
import java.util.*

class UpdateLabData
{
    var read= Scanner(System.`in`)
    var labInfo=UpdateLabDao()
    fun insertLab()
    {
        println("enter test id")

        var testId=read.nextInt();
        print("enter test name")
        read.nextLine()
        var testName=read.nextLine()
        println("enter lab name")
        var labName=read.nextLine()
        println("enter lab location")
        var labLocation=read.nextLine()
        println("enter price")
        var price=read.nextInt()

        labInfo.insertLabDao(testId,testName,labName,labLocation,price)
    }
    fun deleteLab()
    {
        println("enter test id which you want to delete")
        var testId=read.nextInt();
        labInfo.deleteLabDao(testId)

    }

}