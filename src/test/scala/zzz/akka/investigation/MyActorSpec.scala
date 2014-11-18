//package zzz.akka.investigation
//
//import akka.actor.{ActorRef, Props, ActorSystem}
//import org.scalatest.{fixture, Matchers, ParallelTestExecution}
//
//class MyActorSpec extends fixture.WordSpec with Matchers with fixture.UnitFixture with ParallelTestExecution {
//  def makeActor(): ActorRef = system.actorOf(Props[MyActor], "MyActor")
//
//  "MyActor" should {
//    "throw when made with the wrong name" in new ActorSys {
//      evaluating {
//        // use a generated name
//        val a = system.actorOf(Props[MyActor])
//      } should produce [Exception]
//    }
//    "construct without exception" in new ActorSys {
//      val a = makeActor()
//      // The throw will cause the test to fail
//    }
//    "respond with a Pong to a Ping" in new ActorSys {
//      val a = makeActor()
//      a ! "Ping"
//      expectMsg("Pong")
//    }
//  }
//}
