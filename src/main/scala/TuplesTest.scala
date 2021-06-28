

/**
 * 在 Scala 中，元组是一个可以容纳不同类型元素的类。 元组是不可变的。
 * 当我们需要从函数返回多个值时，元组会派上用场。
 * Scala 中的元组包含一系列类：Tuple2，Tuple3等，直到 Tuple22。
 * 因此，当我们创建一个包含 n 个元素（n 位于 2 和 22 之间）的元组时，Scala
 * 基本上就是从上述的一组类中实例化 一个相对应的类，使用组成元素的类型进行参数化。
 * 下面的例子中，ingredient 的类型为 Tuple2[String, Int]。
 */
class TuplesTest {
  //创建元组
  val ingredient = ("Sugar" , 25):Tuple2[String, Int]

}
object TuplesTest{
  def main(args: Array[String]): Unit = {
    val tuplesTest = new TuplesTest
    // ‘tuple._n’ 取出了第 n 个元素
    println(tuplesTest.ingredient._1)
    println(tuplesTest.ingredient._2)
    //Scala 元组也支持解构。
    val(name,age) = tuplesTest.ingredient
    println(name)
    println(age)
  }
}
