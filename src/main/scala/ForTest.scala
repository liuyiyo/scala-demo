

/**
 * Scala 提供一个轻量级的标记方式用来表示 序列推导。推导使用形式为 for (enumerators)
 * yield e 的 for 表达式，此处 enumerators 指一组以分号分隔的枚举器。一个 enumerator
 * 要么是一个产生新变量的生成器，要么是一个过滤器。for 表达式在枚举器产生的每一次绑定中
 * 都会计算 e 值，并在循环结束后返回这些值组成的序列。
 */
class ForTest {

}

case class User1(name:String,age:Int)

object ForTest{
  val userBase = List(User1("Travis", 28),
    User1("Kelly", 33),
    User1("Jennifer", 44),
    User1("Dennis", 23))
  def main(args: Array[String]): Unit = {
    val twentySomethings = for(user <- userBase if (user.age>20&&user.age<30))
      yield user.name
    twentySomethings.foreach(name => println(name))
  }

}
