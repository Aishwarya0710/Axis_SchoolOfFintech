package Assignment

fun main()
{
    var arraylist=ArrayList<Int>()
    arraylist.add(13)
    arraylist.add(15)
    arraylist.add(18)
    arraylist.add(20)
    arraylist.add(25)
    var arr= arrayOf(arraylist.get(0),arraylist.get(1),arraylist.get(2),arraylist.get(3),arraylist.get(4))
    for(i in arr)
    {
        print(" "+i)
    }

}