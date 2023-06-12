import com.atomicscala.AtomicTest._

//Q1
def matchColor(color:String):String = {
    color match {
        case "red" => "RED"
        case "blue" => "BLUE"
        case "green" => "GREEN"
        case _ => "UNKNOWN COLOR: " + color
    }
}
matchColor("red") is "RED"

def matchColorIfElse(color:String):String = {
    if (color == "red")
        "RED"
    else if (color == "blue")
        "BLUE"
    else if (color == "green")
        "GREEN"
    else "UNKNOWN COLOR: " + color
}

matchColorIfElse("red1") is "UNKNOWN COLOR: red1"

//Q2
def oneOrTheOther(exp:Boolean):String = {
  exp match{
    case true => "True!"
    case false => "It's false"
  }
}

val v = Vector(1)
val v2 = Vector(3, 4)
oneOrTheOther(v == v.reverse) is "True!"
oneOrTheOther(v2 == v2.reverse) is
  "It's false"

//Q3
def checkTruth(exp1:Boolean, exp2:Boolean):String = {

  (exp1, exp2) match{
    case (true, true) => "Both are true"
    case (false, false) => "Both are false"
    case (true, _) => "First: true, second: false"
    case _ => "First: false, second: true"
  }
}

checkTruth(true || false, true) is
  "Both are true"
checkTruth(1 > 0 && -1 < 0, 1 == 2) is
  "First: true, second: false"
checkTruth(1 >= 2, 1 >= 1) is
  "First: false, second: true"
checkTruth(true && false,false && true) is
  "Both are false"


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
forecast(100) is "Sunny"
forecast(80) is "Mostly Sunny"
forecast(50) is "Partly Sunny"
forecast(20) is "Mostly Cloudy"
forecast(0) is "Cloudy"
forecast(15) is "Unknown"

//Q5
val sunnyData = Vector(100, 80, 50, 20, 0, 15)
for(x<-sunnyData){
  println(forecast(x))
}