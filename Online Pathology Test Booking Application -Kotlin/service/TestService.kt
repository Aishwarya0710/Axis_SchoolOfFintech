package com.manipal.service.impl

import com.manipal.dao.impl.TestDao
import java.util.*

class TestService
{
    fun cancelTest()
    {
        println("enter your name")
        var read= Scanner(System.`in`)
        var name=read.nextLine()
        var test= TestDao()
        test.cancelTestDao(name)
    }
}