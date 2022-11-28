//Q1
class SailBoat{
  def raise: String = "Sails raised"
  def lower: String = "Sails lowered"
}

class Motorboat{
  def on: String = "Motor on"
  def off: String = "Motor off"
}

val sailBoat = new SailBoat
val r1 = sailBoat.raise
assert(r1 == "Sails raised","Expected Sails raised, Got "+r1)
val r2 = sailBoat.lower
assert(r2 == "Sails lowered","Expected Sails lowered, Got "+r2)

val motorboat = new Motorboat
val s1 = motorboat.on
assert(s1 == "Motor on","Expected Motor on, Got "+s1)
val s2 = motorboat.off
assert(s2 == "Motor off","Expected Motor off, Got "+s2)

//Q2
class Flare{
  def light = "Flare used!"
}
val flare = new Flare
val f1 = flare.light
assert(f1 == "Flare used!","Expected Flare used!, Got "+f1)

//Q3
class SailBoat2{
  def raise: String = "Sails raised"
  def lower: String = "Sails lowered"
  def signal: String = {
    new Flare().light
  }
}

class Motorboat2{
  def on: String = "Motor on"
  def off: String = "Motor off"
  def signal: String = {
    new Flare().light
  }
}
val sailBoat2 = new SailBoat2
val signal = sailBoat2.signal
assert(signal == "Flare used!","Expected Flare used!, Got "+signal)

val motorboat2 = new Motorboat2
val flare2 = motorboat2.signal
assert(flare2 == "Flare used!","Expected Flare used!, Got "+flare2)