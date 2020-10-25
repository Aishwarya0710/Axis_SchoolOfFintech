package day5.DataService

fun getGeneratedRevenue():Int {
    var sum: Int = 0
    val statement = conn?.createStatement()
    val resultSet1 = statement?.executeQuery("select * from Customer")

    if (resultSet1 != null) {
        while (resultSet1.next()) {

            sum+=resultSet1.getInt(7)
        }
    }
    return sum
}
