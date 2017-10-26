package Chapter02

val aBoolean: Boolean = true
val anotherBoolean: Boolean = false
val aInt:Int = 8
val anotherInt:Int = 0xFF
val moreInt:Int = 0b00000011
val maxInt:Int = Int.MAX_VALUE
val minInt:Int = Int.MIN_VALUE

val along:Long = 1234345345331312
val another:Long = 123
val maxLong:Long = Long.MAX_VALUE
val minLong:Long = Long.MIN_VALUE

val aFloat:Float = 2.0f
val anotherFloat:Float = 1E3f
val maxFloat:Float = Float.MAX_VALUE
val minFloat:Float = -Float.MAX_VALUE

val maxbyte:Byte = Byte.MAX_VALUE
val minbyte:Byte = Byte.MIN_VALUE

fun main(args: Array<String>) {
    println(maxLong)
    println(minLong)

    println(maxInt)
    println(Math.pow(2.0,31.0)-1)
    println(minInt)
    println(-Math.pow(2.0,31.0))

    println(minFloat)
    println(maxFloat)


}