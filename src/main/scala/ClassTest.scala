
/**
 * 定义类(关键字class+标识符，类名首字母应大写)
 */
class ClassTest {
  val user = new User
}
object ClassTest{
  def main(args: Array[String]): Unit = {
    //如果构造参数带默认值，则可以不用传参
    val point1 = new Point1()
    point1.x = 5
    println(point1.x)
    println(point1.y)
    //如果传一个参数,则默认传第一个
    val point2 = new Point1(3)
    println(point2.x)
    println(point2.y)
    //可以根据参数名传参
    val point3 = new Point1(y=3)
    println(point3.x)
    println(point3.y)
  }
}

/**
 * 无参构造的类
 */
class User{

}

/**
 * 关键字new被用于创建类的实例。User由于没有定义任何构造器，因而只有一个不带任何参数的默认构造器。
 * 然而，你通常需要一个构造器和类体。下面是类定义的一个例子：
 *
 * Point类有4个成员：变量x和y，方法move和toString。与许多其他语言不同，
 * 主构造方法在类的签名中(var x: Int, var y: Int)。
 */

class Point(var x: Int, var y: Int) {

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }
  override def toString: String =
    s"($x, $y)"
}

/**
 * 构造器可以通过提供一个默认值来拥有可选参数
 *
 * 在这个版本的Point类中，x和y拥有默认值0所以没有必传参数。然而，
 * 因为构造器是从左往右读取参数，所以如果仅仅要传个y的值，你需要带名传参。
 * @param x
 * @param y
 */
class Point1(var x: Int=0, var y: Int=0) {

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }
  override def toString: String =
    s"($x, $y)"
}