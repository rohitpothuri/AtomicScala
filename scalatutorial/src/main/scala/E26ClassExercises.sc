import com.atomicscala.AtomicTest._
//Q1
class Dimension(var height: Int, var width: Int)

val c = new Dimension(5,7)
c.height is 5
c.height = 10
c.height is 10
c.width = 19
c.width is 19

//Q2
class Info(//Q3
           var name: String, var description: String)

val info = new Info("stuff", "Something")
info.name is "stuff"
info.description is "Something"
info.description = "Something else"
info.description is "Something else"


//Q3
info.name = "This is the new name"
info.name is "This is the new name"

//Q4
class SimpleTime(var hours: Int, var minutes: Int){

  def subtract(aTime: SimpleTime) = {
    val h = hours - aTime.hours
    val m = minutes - aTime.minutes
    if (h < 0) {
      new SimpleTime(0, 0)
    } else if (m >= 0) {
      new SimpleTime(h, m)
    } else {
      new SimpleTime(h - 1, m + 60)
    }
  }
}

val t1 = new SimpleTime(10, 30)
val t2 = new SimpleTime(9, 30)
val st = t1.subtract(t2)
st.hours is 1
st.minutes is 0
val st2 = new SimpleTime(10, 30).subtract(new SimpleTime(9, 45))
st2.hours is 0
st2.minutes is 45
val st3 = new SimpleTime(9, 30).subtract(new SimpleTime(10, 0))
st3.hours is 0
st3.minutes is 0

//Q5
class SimpleTimeDefault(var hours: Int, var minutes: Int=0){

  def subtract(aTime: SimpleTimeDefault) = {
    val h = hours - aTime.hours
    val m = minutes - aTime.minutes
    if (h < 0) {
      new SimpleTimeDefault(0, 0)
    } else if (m >= 0) {
      new SimpleTimeDefault(h, m)
    } else {
      new SimpleTimeDefault(h - 1, m + 60)
    }
  }
}
val anotherT1 = new SimpleTimeDefault(10, 30)
val anotherT2 = new SimpleTimeDefault(9)
val anotherST = anotherT1.subtract(anotherT2)
anotherST.hours is 1
anotherST.minutes is 30

val anotherST2 = new SimpleTimeDefault(10). subtract(new SimpleTimeDefault(9, 45))
anotherST2.hours is 0
anotherST2.minutes is 15


//Q5
class SimpleTimeAux(var hours: Int, var minutes: Int){

  def this(hours: Int) = {
    this(hours, 0)
  }

  def subtract(aTime: SimpleTimeAux) = {
    val h = hours - aTime.hours
    val m = minutes - aTime.minutes
    if (h < 0) {
      new SimpleTimeAux(0, 0)
    } else if (m >= 0) {
      new SimpleTimeAux(h, m)
    } else {
      new SimpleTimeAux(h - 1, m + 60)
    }
  }
}

val auxT1 = new SimpleTimeAux(10, 5)
val auxT2 = new SimpleTimeAux(6)
val auxST = auxT1.subtract(auxT2)
auxST.hours is 4
auxST.minutes is 5
val auxST2= new SimpleTimeAux(12).subtract( new SimpleTimeAux(9, 45))
auxST2.hours is 2
auxST2.minutes is 15

//Q6
//Q5
class SimpleTimeAuxDef(var hours: Int=9, var minutes: Int=0){


  def subtract(aTime: SimpleTimeAuxDef) = {
    val h = hours - aTime.hours
    val m = minutes - aTime.minutes
    if (h < 0) {
      new SimpleTimeAuxDef(0, 0)
    } else if (m >= 0) {
      new SimpleTimeAuxDef(h, m)
    } else {
      new SimpleTimeAuxDef(h - 1, m + 60)
    }
  }
}

val auxDef = new SimpleTimeAuxDef(6)