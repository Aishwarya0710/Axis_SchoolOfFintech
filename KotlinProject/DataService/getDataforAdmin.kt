package day5.DataService
fun getLabData()
{
val statement = conn?.createStatement()
val resultSet = statement?.executeQuery("select * from Test ;")
if (resultSet != null) {
    if (resultSet.next()) {
        println("Labs and the available test are:")
        println("Testid        Test Name            Lab Name              Lab location       Price")

        while (resultSet.next()) {


            println(resultSet.getString(1) + "\t \t \t" + resultSet.getString(2) + "\t \t \t" + resultSet.getString(3) +"\t \t \t"+resultSet.getString(4) + "\t \t" + resultSet.getInt(5))

        }

    }

}
else {
    println("empty lab")
}

}
fun getCustomerData()
{
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

    }
   /* else {
        println("empty lab")
    }*/

