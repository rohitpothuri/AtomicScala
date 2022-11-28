object E8Summary1 extends App {
  val intValue: Int = 8
  println(intValue)

  //question 2 error
  //intValue = 2

 // question 3 error
  // var varValue = 2
 // varValue = 8.0

  //Q4
  val dValue: Double = 9.0
  println(dValue)
  //Q5
  val intDValue: Double = 15
  println(intDValue)
  //Q6
  val mlineString =
    """
      |tes
      |acdfwdf
      |cefceef""".stripMargin

  println(mlineString)
  //Q7 error
  //val bValue: Boolean = "maybe"

  //Q8 error
  //val dIntValue: Int = 9.0
  //println(dIntValue)

  //Q9
  val lbs = 150.0
  val height = 68.0
  val weightStatus = {
    val bmi = lbs/(height * height) * 703.07
    if(bmi < 18.5)  println("Underweight")
    else if(bmi < 25)  println("Normal weight")
    else  println("Overweight")
  }

  //Q10

  val lbs1 = 150.0
  val height1 = 68.0
  val bmi=22.0
  val idealWeight = {
    val bmi1 = bmi * (height1 * height1) / 703.07
    if(bmi < 18.5) "Underweight"
    else if(bmi < 25) "Normal weight"
    else "Overweight"
  }
  println(idealWeight)

}
