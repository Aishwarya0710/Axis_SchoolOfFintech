package com.manipal.dao.impl

import java.sql.PreparedStatement

class UpdateLabDao
{
    fun insertLabDao(testId:Int,testName:String,labName:String,labLocation:String,price:Int)
    {
        getConnection()
        var sql:String="INSERT INTO Test(testid,testname,labname,lablocation, price) VALUES (?, ?, ?, ?,?);"
        var statement: PreparedStatement? = conn?.prepareStatement(sql);
        if (statement != null) {
            statement.setInt(1, testId)
        };
        if (statement != null) {
            statement.setString(2, testName)
        }
        if (statement != null) {
            statement.setString(3,labName)
        }
        if (statement != null) {
            statement.setString(4,labLocation)
        }
        if (statement != null) {
            statement.setInt(5, price)
        }

        var rowsInserted: Int? = statement?.executeUpdate()
        if (rowsInserted != null) {
            if (rowsInserted > 0) {
                System.out.println("Lab is added successfully!");}
        }
        connectionClose()
    }
    fun deleteLabDao(testId: Int)
    {
        getConnection()
        var sql:String="delete from Test where testid='$testId';"
         val statement = conn?.createStatement()
        var delete=0
        delete= statement?.executeUpdate(sql)!!
        if(delete==0)
            println("unable to delete record")
        else
            println("Test is deleted")
        connectionClose()
    }
}