object Exercise7CompoundExpressions extends App {
  //question 1
  val a: Int  = 1
  val b: Int = 5
  val c: Int = 5
  val question1 = {
    if(a<=c){
      println("a is less than or equal to c")
      if(b<=c){
        println("b is less than or equal to c")
      }
    }
  }

  val question2 = {
    if(a<=c && b<=c){
      println("both are!")
    }
    else if(a<=c || b<=c){
      println("one is and one isnt!")
    }
  }

  val activity = "swimming"
  val hour = 10
  val goodTemperature: Int =  70

  val isOpen: Boolean = {
    if(activity == "swimming" || activity == "ice skating") {
      val opens = 9
      val closes = 20

      val lowtemp = 60
      val hightemp = 100
      println("Operating hours: " + opens + " " + closes)
      if (hour >= opens && hour <= closes) {
        true
      }
      else {
        false
      }
    }
    else{
      false
    }
  }

  val doActivity: Boolean = {
    val lowTemp: Int = 50
    val highTemp: Int = 100
    isOpen && (goodTemperature>=lowTemp && goodTemperature<=highTemp)
  }

//question 4
  val activity4 = "running"
  val distance = 9
   val willDo = {
    val runningDistance = 6
    val bikingDistance = 20
    val swimmingDistance = 1
    if(activity4 == "running" && distance<=runningDistance){
      true
    }
    else if(activity4 == "biking" && distance<=bikingDistance){
      true
    }
    else if(activity4 == "swimming" && distance<=swimmingDistance){
      true
    }
    else false
  }


}
