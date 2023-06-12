import com.atomicscala.AtomicTest._

class Coffee(val shots:Int = 2,
             val decaf:Int = 1,
             val caf:Int = 1,
             val milk:Boolean = false,
             val toGo:Boolean = false,
             val syrup:String = "") {
  var result = ""
  println(shots, decaf, milk, toGo, syrup)
  def getCup():Unit = {
    if(toGo)
      result += "ToGoCup "
    else
      result += "HereCup "
  }
  /*def pourShots():Unit = {
    for(s <- 0 until shots)
      if(decaf)
        result += "decaf shot "
      else
        result += "shot "
  }*/
  def addMilk():Unit = {
    if(milk)
      result += "milk "
  }
  def addSyrup():Unit = {
    result += syrup
  }
  getCup()
  //pourShots()
  addMilk()
  addSyrup()
}

val doubleHalfCaf = new Coffee(shots=2, decaf=1)
val tripleHalfCaf = new Coffee(shots=3, decaf=2)
doubleHalfCaf.decaf is 1
doubleHalfCaf.caf is 1
doubleHalfCaf.shots is 2
tripleHalfCaf.decaf is 2
tripleHalfCaf.caf is 1
tripleHalfCaf.shots is 3


class Tea(val decaf: Boolean = false, val name: String = "Earl Grey",
          var calories: Int = 0,
          val sugar: Boolean = false,
          val milk: Boolean = false){
  var results = ""
  results += name
  if(decaf) results += " decaf"
  if(milk) {
    results += " + milk"
    calories += 100
  }
  if(sugar) {
    results += " + sugar"
    calories += 16
  }


  def describe: String = {
    results
  }
}

val lemonZinger = new Tea( decaf = true, name="Lemon Zinger")
lemonZinger.describe is "Lemon Zinger decaf"
lemonZinger.calories is 0

val sweetGreen = new Tea( name="Jasmine Green", sugar=true)
sweetGreen.describe is "Jasmine Green + sugar"
sweetGreen.calories is 16
val teaLatte = new Tea( sugar=true, milk=true)
teaLatte.describe is "Earl Grey + milk + sugar"
teaLatte.calories is 116

//Q3
class Tea2(val decaf: Boolean = false, val name: String = "Earl Grey",
          var calories: Int = 0,
          val sugar: Boolean = false,
          val milk: Boolean = false){
  var results = ""
  results += name
  if(decaf) results += " decaf"
  if(milk) {
    results += " + milk"
    calories += 100
  }
  if(sugar) {
    results += " + sugar"
    calories += 16
  }


  def describe: String = {
    results
  }
}

val tea = new Tea2
tea.describe is "Earl Grey"
tea.calories is 0
tea.name is "Earl Grey"
val lemonZinger = new Tea2(decaf = true, name="Lemon Zinger")
lemonZinger.describe is "Lemon Zinger decaf"
lemonZinger.calories is 0
lemonZinger.decaf is true
val sweetGreen = new Tea2( name="Jasmine Green", sugar=true)
sweetGreen.describe is "Jasmine Green + sugar"
sweetGreen.calories is 16
sweetGreen.sugar is true
val teaLatte = new Tea2(sugar=true, milk=true)
teaLatte.describe is "Earl Grey + milk + sugar"
teaLatte.calories is 116
teaLatte.milk is true

