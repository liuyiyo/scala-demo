


/**
 * 基础测试
 */
object BaseTest {
  def main(args: Array[String]): Unit = {
    //val代表常量，不能别重新赋值,下面这种写法是错误的
    //常量可以被推断，也可以显示的声明
    //    val a = 1
    //    a = 3
    //常量显示声明
    val b: Int = 2
    //var代表变量，值可以被修改
    var a = 1
    a = 3
    //变量也可以显示声明
    var c: Int = 2
    //代码块的最后一句话就是返回的值
    println({
      a = a + b
      a
    })
    //匿名函数（中间=>，左边是参数列表，右边是包含参数的表达式）
      //给函数命名
      val addOne = (x: Int) => x + 1
      println(addOne(2))

      //方法，跟匿名函数类似
      // 方法由关键字def定义，后面跟方法名称、参数列表、返回类型、方法体
    //如果返回值为Unit,则类似java的void
    //方法体的最后一个表达式就是方法的返回值。（Scala中也有一个return关键字，但是很少使用）
      def add(x: Int, y: Int): Int = x + y
      println(add(2, 6))
    //创建实例
    val baseClass = new BaseClass("a","b")
    baseClass.test("测试实例")
  }
}

//类示例(class+类名称+构造参数)
class BaseClass(x:String,y:String){
  def test(str: String):Unit={
    println(str)
  }
}
