//package fr.chobert.paul.projet_ilo
//
//import akka.actor._
//
//class BufferComponent(val output: ActorRef) extends Actor {
//  private var l = List()
//  def receive = {
//    case Entry(x) => l = x::l
//    case Clear => output ! l
//  }
//}
