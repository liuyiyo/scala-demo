

/**
 * 案例类（Case classes）和普通类差不多，只有几点关键差别，
 * 接下来的介绍将会涵盖这些差别。案例类非常适合用于不可变的数据。
 */
class CaseClassTest {

}

object CaseClassTest{
  def main(args: Array[String]): Unit = {
    //创建案例类对象不需要new关键字，这是因为案例类有一个默认的apply方法来负责对象的创建。
    val frankenstein = Book("978-0486282114")
    //当你创建包含参数的案例类时，这些参数是公开（public）的val
    println(frankenstein.isbn)

    //案例类在比较的时候是按值比较而非按引用比较
    //尽管message2和message3引用不同的对象，但是他们的值是相等的，所以message2 == message3为true
    val message2 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
    val message3 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
    println(message2==message3)
  }
}

/**
 * 一个最简单的案例类定义由关键字case class，类名，参数列表（可为空）组成：
 * @param isbn
 */
case class Book(isbn: String)

case class Message(sender: String, recipient: String, body: String)
