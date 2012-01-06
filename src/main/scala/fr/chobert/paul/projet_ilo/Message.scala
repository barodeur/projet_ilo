package fr.chobert.paul.projet_ilo

sealed trait Message
case object Tick
case object Start
case object Stop
case object Clear
case class Entry(value: Double) extends Message
