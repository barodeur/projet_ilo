package fr.chobert.paul.projet_ilo

import akka.actor.Actor._

object Project {
  def main(arg: Array[String]) {
    val printerComponentActor = actorOf[PrinterComponent]
    val sinComponentActor = actorOf(new SinComponent(printerComponentActor))
    val tickerComponentActor = actorOf(new TickerComponent(sinComponentActor)(3, 40, 1))
    printerComponentActor.start()
    sinComponentActor.start()
    tickerComponentActor.start()
    tickerComponentActor ! Start
  }
}
