

/**
 * 特质 (Traits) 用于在类 (Class)之间共享程序接口 (Interface)和字段 (Fields)。
 * 它们类似于Java 8的接口。 类和对象 (Objects)可以扩展特质，但是特质不能被实例化，因此特质没有参数。
 */
trait TraitTest {
}

/**
 * 最简化的特质就是关键字trait+标识符：
 */
trait HairColor

/**
 * 特征作为泛型类型和抽象方法非常有用。
 * @tparam A
 */
trait Iterator[A] {
  def hasNext: Boolean
  def next(): A
}

/**
 * 使用 extends 关键字来扩展特征。然后使用 override 关键字来实现trait里面的任何抽象成员：
 * 这个类 IntIterator 将参数 to 作为上限。它扩展了 Iterator [Int]，这意味着方法 next 必须返回一个Int。
 * @param to
 */
class IntIterator(to: Int) extends Iterator[Int] {
  private var current = 0
  override def hasNext: Boolean = current < to
  override def next(): Int =  {
    if (hasNext) {
      val t = current
      current += 1
      t
    } else 0
  }
}