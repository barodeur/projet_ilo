package fr.chobert.paul.projet_ilo

import akka.actor._

class PrinterComponent extends Actor {
  def receive = {
    case Entry(x) => println(x)
  }
}
