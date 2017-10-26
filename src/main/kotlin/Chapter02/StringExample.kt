package Chapter02

val string:String ="Hello"
val fromChar:String = String(charArrayOf('H','e','l','l','o'))

fun main(args: Array<String>) {
    println(string == fromChar)//表示比较内容，类似equals
    println(string === fromChar)//表示比较对象是否相同，类似于Java的==

    println("你要干嘛" + string)

    val arg1:Int = 0
    val arg2:Int = 1;
    println("$arg1 + $arg2 = ${arg1 + arg2}")

    val sayHello:String = "Hello\"Trump\""
    println(sayHello)
    val salary:Int = 1000
    println("\$salary")

    val rawString:String = """
        \t
        \n
        $ salary
     """
    println(rawString)
    println(rawString.length)
}