object E4Expressions extends App {
  //question1
  val feetPerMile: Int = 5280
  //question2
  val yardPerMile: Double = feetPerMile/3.0
  //question3
  val miles: Double = 2000/yardPerMile
  //question4
  val miles1 = {
    val feetPerMile1: Int = 5280
    val yardPerMile1: Double = feetPerMile1/3.0
    2000/yardPerMile1
  }
  println(miles1)

}
