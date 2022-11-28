object E6EvaluationOrder extends App {

  val sky: String = "sunny"
  val temp: Int = 90
  val farenheit: Int = 100
  val celsius: Int = 100
  val output: Boolean = {
    if (sky.equalsIgnoreCase("sunny") && temp > 80) {
      true
    }
    else
      false
  }

  val question2: Boolean = {
    if ((sky.equalsIgnoreCase("sunny") || sky.equalsIgnoreCase("partly cloudy")) && temp > 80) {
      true
    }
    else
      false
  }

  val question3: Boolean = {
    if ((sky.equalsIgnoreCase("sunny") || sky.equalsIgnoreCase("partly cloudy"))
      && (temp > 80 || temp < 20)) {
      true
    }
    else
      false
  }

  val farenheitToCelsius: Double = {
    (farenheit - 32)*(5.toDouble/9)
  }
  println(farenheitToCelsius)

  val celsiusToFarenheit: Double = {
    (farenheitToCelsius * (9.toDouble/5))+32
  }
  println(celsiusToFarenheit)


}
