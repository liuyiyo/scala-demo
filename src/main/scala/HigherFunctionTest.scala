

/**
 * 高阶函数
 * 高阶函数是指使用其他函数作为参数、或者返回一个函数作为结果的函数。
 * 在Scala中函数是“一等公民”，所以允许定义高阶函数。这里的术语可能有点让人困惑，
 * 我们约定，使用函数值作为参数，或者返回值为函数值的“函数”和“方法”，均称之为“高阶函数”。
 */
class HigherFunctionTest {

}
object HigherFunctionTest{
  def main(args: Array[String]): Unit = {
//    val salaries = Seq(20,70,400)
//    val map = salaries.map(_ * 2)
//      .foreach(f => println(f))

    def factorial(x: Int): Int = {
      def fact(x: Int, accumulator: Int): Int = {
        if (x <= 1) accumulator
        else fact(x - 1, x * accumulator)
      }
      fact(x, 1)
    }

    println("Factorial of 2: " + factorial(2))
    println("Factorial of 3: " + factorial(3))
  }

}
