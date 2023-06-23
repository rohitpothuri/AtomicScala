import com.atomicscala.AtomicTest._
//Q1
class ClothesWasher(model : String, capacity: Double) {

  def this(model: String) = {
    this(model, 100.0)
  }

  def this(capacity: Double) = {
    this(model = "LG",capacity)
  }

  //Q4
  def wash(): String= {
    "Simple wash"
  }

  def wash(bleach: Int, fabricSoftner: Int): String = {
    s"Wash used $bleach bleach and $fabricSoftner fabric softener"
  }

}
//Q2
class ClothesWasher2(model : String = "LG", capacity: Double = 100.0) {

}

val washer = new ClothesWasher("LG 100", 3.6)
washer.wash(2, 1) is "Wash used 2 bleach and 1 fabric softener"
washer.wash() is "Simple wash"


