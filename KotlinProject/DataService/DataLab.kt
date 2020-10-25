package day5.DataService

import day5.Model.Test
import java.sql.*
import java.util.*
import java.util.ArrayList as ArrayList1

var conn: Connection? = null
fun getConnection1() {
    var connectionProps = Properties()
    connectionProps.put("user", "root")
    connectionProps.put("password", "abc123")
    try {
        Class.forName("com.mysql.jdbc.Driver")
        conn = DriverManager.getConnection(
                "jdbc:" + "mysql" + "://" +
                        "localhost" +
                        ":" + "3306" + "/pathologylab" +
                        "",
                connectionProps)
        if (conn != null) {
            println("Connected successfully")
            var stmt: Statement? = null

        }
    } catch (ex: SQLException) {
        // handle any errors
        ex.printStackTrace()
    } catch (ex: Exception) {
        // handle any errors
        ex.printStackTrace()
    }}

fun getData(loc:String){
    val statement = conn?.createStatement()
    val resultSet = statement?.executeQuery("select * from Test where lablocation='$loc';")
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

}
fun desiredTest(id:Int): ArrayList<Any>
{
    var list= ArrayList1<Any>(5)
    val statement = conn?.createStatement()
    val resultSet1 = statement?.executeQuery("select * from Test")

    if (resultSet1 != null) {
        while (resultSet1.next()) {

            if (resultSet1.getInt(1) == (id)) {
             //   println(resultSet1.getString(1) + "\t " + resultSet1.getString(2) + " \t" + resultSet1.getString(3) + "\t " + resultSet1.getString(4) + " \t" + resultSet1.getString(5))
                list.add(resultSet1.getInt(1))
                list.add(resultSet1.getString(2))
                list.add(resultSet1.getString(3))
                list.add(resultSet1.getString(4))
                list.add(resultSet1.getInt(5))
            }
        }
    }
    else{
        println("You have entered wrong id")

    }
    return list

}
fun connectionClose()
{
    conn?.close()
}