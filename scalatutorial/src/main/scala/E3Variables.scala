object E3Variables extends App {
  //question1
  val vValue = 5
  //intValue = 10
  println(vValue)

  //question 2
  var v1: Int = 5
  v1 = 10
  val constantv1: Int = v1 //to store the variable value at a particular point of time
  println(v1)
  println(constantv1)

  //question 3
  v1=15
  println(v1)
  println(constantv1) //value didnt change

  var v2 = v1
  v1 = 20
  println(v1)
  println(v2) //didnt change
}
