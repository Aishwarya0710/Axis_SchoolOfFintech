package com.manipal.dao.impl

import java.sql.PreparedStatement

class CustomerDao
{
    fun getTest(location:String)
    {
        getConnection()
        val statement = conn?.createStatement()
        val resultSet = statement?.executeQuery("select * from Test where lablocation='$location';")
        if (resultSet != null) {

            println("Labs and the available test are:")
            println("Testid        Test Name        Lab Name")
            while (resultSet.next()) {

                println(resultSet.getString(1) + "\t \t" + resultSet.getString(2) + "\t \t" + resultSet.getString(3))

            }

        }
        else {
            println("Didn't find any lab in your location")
        }
        connectionClose()
    }

    fun bookTestDao(testId:Int,name:String,contactno:String, Email:String,age:Int,Address:String,testDate:String):Boolean
    {
        getConnection()
        val statement1 = conn?.createStatement()

        val resultSet1 = statement1?.executeQuery("select * from Test")
        var testConducted=""
        var price=0
        if (resultSet1 != null) {
            while (resultSet1.next()) {

                if (resultSet1.getInt(1) == (testId)) {
                    //   println(resultSet1.getString(1) + "\t " + resultSet1.getString(2) + " \t" + resultSet1.getString(3) + "\t " + resultSet1.getString(4) + " \t" + resultSet1.getString(5))
                   testConducted=resultSet1.getString(2)
                    price=resultSet1.getInt(5)
                }
            }
        }
        else{
            println("You have entered wrong id")

        }


        var sql:String="INSERT INTO Customer (Name,contactno,Email,age,Address,TestConducted,price,testdate) VALUES (?, ?, ?, ?,?,?,?,?)";
        var statement: PreparedStatement? = conn?.prepareStatement(sql);
        if (statement != null) {
            statement.setString(1, name)
        };
        if (statement != null) {
            statement.setString(2, contactno)
        }
        if (statement != null) {
            statement.setString(3, Email)
        }
        if (statement != null) {
            statement.setInt(4, age)
        }
        if (statement != null) {
            statement.setString(5, Address)
        }
        if (statement != null) {
            statement.setString(6, testConducted)
        }
        if (statement != null) {
            if (price != null) {
                statement.setInt(7, price)
            }
        }
        if (statement != null) {
            statement.setString(8, testDate)
        }
        var rowsInserted: Int? = statement?.executeUpdate()
        connectionClose()
        if (rowsInserted != null) {
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
                return true;
            }
        }
        return false

    }
    fun rescheduleTestDao(name:String,testDate:String)
    {
        getConnection()
        var sql:String="update Customer set testdate='$testDate' where Name='$name';"
        //  var statement: PreparedStatement? = conn?.prepareStatement(sql);
        val statement = conn?.createStatement()
        var delete=0
        delete= statement?.executeUpdate(sql)!!
        if(delete==0)
            println("unable to reschedule")
        else
            println("successfully reschedule your booking")
       connectionClose()
    }
}

