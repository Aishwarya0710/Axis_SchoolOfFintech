package day5.DataService

import java.sql.PreparedStatement
import java.util.*

fun insertLab():Boolean
{
    println("enter test id")
    var read= Scanner(System.`in`)
    var testId=read.nextInt();
    print("enter test name")
    read.nextLine()
    var testName=read.nextLine()
    println("enter lab name")
    var labName=read.nextLine()
    println("enter lab location")
    var labLocation=read.nextLine()
    println("enter price")
    var Price=read.nextInt()
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
        statement.setInt(5, Price)
    }

    var rowsInserted: Int? = statement?.executeUpdate()
    if (rowsInserted != null) {
        if (rowsInserted > 0) {
            System.out.println("Lab is added successfully!");}
    }
    return true;
}
