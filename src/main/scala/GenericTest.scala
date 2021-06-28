

/**
 * 泛型
 * 泛型类指可以接受类型参数的类。泛型类在集合类中被广泛使用
 */
class GenericTest {

}

/**
 * Stack 类的实现中接受类型参数 A。 这表示其内部的列表，
 * var elements: List[A] = Nil，只能够存储类型 A 的元素。
 * 方法 def push 只接受类型 A 的实例对象作为参数(注意：elements = x :: elements
 * 将 elements 放到了一个将元素 x 添加到 elements 的头部而生成的新列表中)。
 * @tparam A
 */
class Stack[A] {
  private var elements: List[A] = Nil
  def push(x: A): Unit =
    elements = x :: elements
  def peek: A = elements.head
  def pop(): A = {
    val currentTop = peek
    elements = elements.tail
    currentTop
  }
}
