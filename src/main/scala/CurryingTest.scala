

/**
 * 多参数列表（柯里化）
 * 方法可以定义多个参数列表，当使用较少的参数列表调用多参数列表的方法时，
 * 会产生一个新的函数，该函数接收剩余的参数列表作为其参数。这被称为柯里化。
 */
class CurryingTest {

}
object CurryingTest{
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val res = numbers.foldLeft(0)((m, n) => m + n)
    println(res) // 55
  }
}
