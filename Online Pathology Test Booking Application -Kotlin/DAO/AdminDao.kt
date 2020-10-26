package com.manipal.dao.impl

class AdminDao{
    fun getRevenueDao():Int {
        var sum=0
        getConnection()
        val statement = conn?.createStatement()
        val resultSet1 = statement?.executeQuery("select * from Customer")

        if (resultSet1 != null) {
            while (resultSet1.next()) {

                sum+=resultSet1.getInt(7)
            }
        }
        connectionClose()
        return sum
    }
    fun getLabDatadao() {
        getConnection()
        val statement = conn?.createStatement()
        val resultSet = statement?.executeQuery("select * from Test ;")
        if (resultSet != null) {
            if (resultSet.next()) {
                println("Labs and the available test are:")
                println("Testid        Test Name            Lab Name              Lab location       Price")

                while (resultSet.next()) {


                    println(resultSet.getString(1) + "\t \t \t" + resultSet.getString(2) + "\t \t \t" + resultSet.getString(3) + "\t \t \t" + resultSet.getString(4) + "\t \t" + resultSet.getInt(5))

                }

            }
            connectionClose()
        }
    }
    fun getCustomerDatadao() {
        getConnection()
        val statement = conn?.createStatement()
        val resultSet = statement?.executeQuery("select * from Customer ;")
        if (resultSet != null) {
            //  if (resultSet.next()) {
            println("Toatl no of bookings are:")
            println("Name        Contact No       Email    age    Address   Testconducted     Price    date")

            while (resultSet.next()) {


                println(resultSet.getString(1) + "\t \t" + resultSet.getString(2) + "\t \t" + resultSet.getString(3) +resultSet.getInt(4) + "\t \t" + resultSet.getString(5) + "\t \t" + resultSet.getString(6) + "\t \t" + resultSet.getInt(7) +"\t \t"+resultSet.getString(8))

            }

        }
        connectionClose()

    }
}
