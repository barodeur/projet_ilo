package fr.chobert.paul.projet_ilo

import akka.actor._

trait FunctionComponent extends Actor {
  protected val output: ActorRef

  protected val fn: (Double) => Double

  def receive = {
    case Entry(x) => output ! Entry(fn(x))
  }
}