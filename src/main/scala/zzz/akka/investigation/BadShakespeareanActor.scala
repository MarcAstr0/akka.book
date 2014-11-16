package zzz.akka.investigation

import akka.actor.{Actor, Props, ActorSystem}

/**
 * Created by mario on 06-10-14.
 */
class BadShakespeareanActor extends Actor {
  def receive = {
    case "Good Morning" =>
      println("Him: Forsooth 'tis the 'morn, but mourneth " +
              "for thou doest I do")
    case "You're terrible" =>
      println("Him: Yup")
  }
}

object BadShakespeareanMain {
  val system = ActorSystem("BadShakespearean")
  val actor = system.actorOf(Props[BadShakespeareanActor],
                             "Shake")
  def send(msg: String): Unit = {
    println(s"Me: $msg")
    actor ! msg
    Thread.sleep(100)
  }
  def main(args: Array[String]): Unit = {
    send("Good Morning")
    send("You're terrible")
    system.shutdown()
  }
}
