package com.manipal.dao.impl

class TestDao()
{
    fun cancelTestDao(name:String)
    {
        getConnection()
        var sql:String="delete from Customer where Name='$name';"
        //  var statement: PreparedStatement? = conn?.prepareStatement(sql);
        val statement = conn?.createStatement()
        var delete=0
        delete= statement?.executeUpdate(sql)!!
        if(delete==0)
            println("unable to cancel your booking")
        else
            println("your booking is cancelled")
        connectionClose()
    }
}