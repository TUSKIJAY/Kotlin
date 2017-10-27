package Chapter02

fun getname():String?{
    return null;
}

fun main(args: Array<String>) {
//    val name:String= getname()?:return//为空则执行后面的语句
//    println(name.length)

    val value:String? = "hello world"
    println(value!!.length)
}