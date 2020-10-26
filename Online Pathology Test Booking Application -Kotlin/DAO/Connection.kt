package com.manipal.dao.impl


import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException
import java.sql.Statement
import java.util.*
var conn: Connection? = null
fun getConnection()
    {

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
                connectionProps
            )
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
        }
    }

fun connectionClose()
{
    conn?.close()
}