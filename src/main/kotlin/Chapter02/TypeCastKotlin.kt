package Chapter02

fun main(args: Array<String>) {
    val parent:Parent = Parent()
    val child:Child? = parent as? Child
    println(child)
    val string:String? = "Hello"
    if (string != null)
    println(string.length)



}