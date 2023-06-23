import com.atomicscala.AtomicTest._

import scala.collection.mutable.ListBuffer

//Q1
def explicitDouble(c1: Double, c2: Double, c3: Double): Vector[Double] = {
  Vector(c1, c2, c3)
}
explicitDouble(1.0, 2.0, 3.0) is Vector(1.0, 2.0, 3.0)

//Q2
def explicitList(input: Vector[Double]): List[Double] = {
  input.toList
}
explicitList(Vector(10.0, 20.0)) is List(10.0, 20.0)
explicitList(Vector(1, 2, 3)) is List(1.0, 2.0, 3.0)

//Q3
def explicitSet(input: Vector[Double]): Set[Double] = {
  input.toSet
}
explicitSet(Vector(10.0, 20.0, 10.0)) is Set(10.0, 20.0)
explicitSet(Vector(1, 2, 3, 2, 3, 4)) is Set(1.0, 2.0, 3.0, 4.0)

//Q4
def forecast(temp: Int): String = {
  temp match {
    case 100 => "Sunny"
    case 80 => "Mostly Sunny"
    case 50 => "Partly Sunny"
    case 20 => "Mostly Cloudy"
    case 0 => "Cloudy"
    case _ => "Unknown"
  }
}

def historicalData(data:Vector[Int]): String = {
  val outputData =  ListBuffer[String]()
  data.foreach(v=>{
    outputData+=forecast(v)
  })
  outputData.groupBy(identity).mapValues(_.size).map(x=>s"${x._1}=${x._2}").mkString(", ")
}

val weather = Vector(100, 80, 20, 100, 20)
historicalData(weather) is "Sunny=2, Mostly Cloudy=2, Mostly Sunny=1"
