object E2DataTypes extends App {
  //question 1
  val intValue: Int = 5
  println(intValue)
  //question 2
  val stringValue: String = "ABCD1234"
  println(stringValue)
  //question 3
  val doubleValue: Double = 5.4
  println(doubleValue)
  //question 4
  val boolValue: Boolean = true
  println(boolValue)
  //question 5 -- yes
  val mlString: String =
    """
      |A
      |A
      |A""".stripMargin

  println(mlString)
  //question 6 - error
  //val stringBool: Boolean = "maybe"
  //question 7 - error
  //val doubleInt: Int = 15.4
  //question 8
  val intDouble: Double=15
  println(intDouble)
}
