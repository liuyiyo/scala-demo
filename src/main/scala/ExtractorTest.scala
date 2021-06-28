
import scala.util.Random

/**
 * 提取器对象是一个包含有 unapply 方法的单例对象。apply 方法就像一个构造器，
 * 接受参数然后创建一个实例对象，反之 unapply 方法接受一个实例对象然后返回最
 * 初创建它所用的参数。提取器常用在模式匹配和偏函数中。
 */
class ExtractorTest {

}

/**
 * 这里 apply 方法用 name 创建一个 CustomerID 字符串。而 unapply 方法正好相反，它返回 name 。
 * 当我们调用 CustomerID("Sukyoung") ，其实是调用了 CustomerID.apply("Sukyoung") 的简化语法。
 * 当我们调用 case CustomerID(name) => println(name)，就是在调用提取器方法。
 */
object CustomerID{
  def apply(name: String) = s"$name--${Random.nextLong()}"
  def unapply(customerId: String): Option[String]={
    val stringArray:Array[String] = customerId.split("--")
    if(stringArray.tail.nonEmpty) Some(stringArray.head) else None
  }

  def main(args: Array[String]): Unit = {
    val customer1ID = CustomerID("Sukyoung")  // Sukyoung--23098234908
    customer1ID match {
      case CustomerID(name) => println(name)  // prints Sukyoung
      case _ => println("Could not extract a CustomerID")
    }
  }

}
