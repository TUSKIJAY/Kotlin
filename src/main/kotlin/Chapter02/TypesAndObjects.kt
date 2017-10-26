package Chapter02

class 妹子( 性格:String, 长相:String, 声音:String):人(性格, 长相, 声音)
class 帅哥( 性格:String, 长相:String, 声音:String):人(性格, 长相, 声音)

open class 人(var 性格:String,var 长相:String,var 声音:String){
    init {
        println("new 了一个${this.javaClass.simpleName} 性格：$性格，长相：$长相，声音：$声音")
    }
}

fun main(args: Array<String>) {
    val 我的妹子:妹子 = 妹子("温柔","甜美","动人")
    val 我崇拜的帅哥:帅哥 = 帅哥("有个性","handsome","低沉")
    println(我的妹子 is 人)
}