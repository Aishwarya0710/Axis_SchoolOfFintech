package Assignment



fun <T>List<T>.printList()
{
    for(element in this)
    {
        print ("$element ")
    }
    println()
}


fun main()
{
    var list1:List<Int> = listOf<Int>(34,56,78,89,23,45)
    var list2:List<String> = listOf<String>("Delhi","Mumbai","Bangalore","Chennai")
    var list3:List<Any> = listOf<Any>(12,34,56.6 ,"Delhi","Mumbai","Bangalore","Chennai",false,'a')
    list1.printList()
    list2.printList()
    list3.printList()

}