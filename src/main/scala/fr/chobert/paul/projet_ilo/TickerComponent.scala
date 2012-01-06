package fr.chobert.paul.projet_ilo

import akka.actor._

class TickerComponent(val output: ActorRef)(val from: Double, val to: Double, val incr: Double) extends Actor {
  def receive = {
    case Start =>
      for(x <- from until to by incr) output ! Entry(x)
  }
}
