

import scala.util.Random

/**
 * 模式匹配
 * 模式匹配是检查某个值（value）是否匹配某一个模式的机制，
 * 一个成功的匹配同时会将匹配值解构为其组成部分。它是Java
 * 中的switch语句的升级版，同样可以用于替代一系列的 if/else 语句。
 */
class PatternMatchingTest {
  def showNotification(notification: Notification): String = {
    notification match {
      case Email(sender, title, _) =>
        s"You got an email from $sender with title: $title"
      case SMS(number, message) =>
        s"You got an SMS from $number! Message: $message"
      case VoiceRecording(name, link) =>
        s"you received a Voice Recording from $name! Click the link to hear it: $link"
    }
  }

}

object PatternMatchingTest{
  def main(args: Array[String]): Unit = {
    val x: Int = Random.nextInt(4)
    val prints = (s:String)=>println(s)
    x match {
      case 0 => prints("zero")
      case 1 => prints("one")
      case 2 => prints("two")
      case 3 => prints("three")
    }

    val patternMatchingTest = new  PatternMatchingTest
    val email = Email("liuyi","emailTitle","emailBody")
    val someSms = SMS("12345", "Are you there?")
    val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")
    println(patternMatchingTest.showNotification(email))
    println(patternMatchingTest.showNotification(someSms))  // prints You got an SMS from 12345! Message: Are you there?
    println(patternMatchingTest.showNotification(someVoiceRecording))  // you r
  }

}


/**
 * 案例类非常适合用于模式匹配。
 */
abstract class Notification

case class Email(sender: String, title: String, body: String) extends Notification

case class SMS(caller: String, message: String) extends Notification

case class VoiceRecording(contactName: String, link: String) extends Notification


/**
 * 仅类型匹配
 */
abstract class Device
case class Phone(model: String) extends Device {
  def screenOff = s"Turning screen off $model"
}
case class Computer(model: String) extends Device {
  def screenSaverOn = "Turning screen saver on..."
}

object DeviceTest{
  def goIdle(device: Device) = device match {
    case p: Phone => p.screenOff
    case c: Computer => c.screenSaverOn
  }

  def main(args: Array[String]): Unit = {
    val phone = new Phone("华为p30")
    println(goIdle(phone))
  }
}


/**
 * 密封类
 * 特质（trait）和类（class）可以用sealed标记为密封的，
 * 这意味着其所有子类都必须与之定义在相同文件中，从而保证所有子类型都是已知的。
 */
sealed abstract class Furniture
case class Couch() extends Furniture
case class Chair() extends Furniture
