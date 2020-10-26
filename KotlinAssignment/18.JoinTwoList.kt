package Assignment


fun main()
{
    var list2:MutableList<String> = mutableListOf<String>("Delhi","Mumbai","Bangalore","Chennai")
    var list3:MutableList<Any> = mutableListOf<Any>(12,34,56.6 ,"Delhi","Mumbai","Bangalore","Chennai",false,'a')
    list3.addAll(list2)
    list3.printList()
}