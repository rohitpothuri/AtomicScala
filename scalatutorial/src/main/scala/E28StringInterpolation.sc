import com.atomicscala.AtomicTest._
//Q1
case class GardenGnome(val height:Double, val weight:Double, val happy:Boolean) {
  println("Inside primary constructor")
  var painted = true
  def magic(level:Int):String = {
    s"Poof! $level $happy $painted"
    }
  def this(height:Double) {
    this(height, 100.0, true)
     }
  def this(name:String) = {
     this(15.0)
    painted is true
  }

  def show(): String = {
    s"$height $weight $happy $painted"
  }

  def show(level:Int): String = {
    magic(level)
  }

  def showV2(): String = {
    if (height != 15.0 && weight != 100.0) {
      s"height: $height + weight: $weight happy: $happy painted: $painted"
    }
    else {
      s"height: $height weight: $weight $happy $painted"
    }
  }
}



new GardenGnome(20.0, 110.0, false).show() is "20.0 110.0 false true"
new GardenGnome("Bob").show() is "15.0 100.0 true true"

val gnome = new GardenGnome(20.0, 110.0, false)
gnome.show() is "20.0 110.0 false true"
val bob = new GardenGnome("Bob")
bob.show() is "15.0 100.0 true true"

//Q2
val gnome = new GardenGnome(20.0, 50.0, false)
gnome.show(87) is "Poof! 87 false true"

//Q3
val gnome = new GardenGnome(20.0, 110.0, false)
gnome.showV2() is "height: 20.0 " + "weight: 110.0 happy: false painted: true"
val bob = new GardenGnome(name="Bob")
bob.show() is "height: 15.0 weight: 100.0 true true"