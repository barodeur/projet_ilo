package fr.chobert.paul.projet_ilo

import akka.actor._

class SinComponent(val output: ActorRef) extends FunctionComponent {
  val fn = (x:Double) => Math.sin(x)
}
