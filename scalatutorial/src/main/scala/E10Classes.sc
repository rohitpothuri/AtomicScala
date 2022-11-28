//Q1
val r1 =  Range(1,10,1)
println(r1.step)
println(r1.mkString(","))

val r2 =  Range(1,10,2)
println(r2.step)
println(r2.mkString(","))

//Q2
val s1 = "This is an experiment"
s1.split(" ").foreach(println)

//Q3
var s1 = "Sally"
var s2 = "Sally"

def isMatch(s1: String, s2: String) = {
  s1.equals(s2) match {
    case true => println("s1 and s2 are equal")
    case false => println("s1 and s2 are not equal")
  }
}
isMatch(s1,s2)

//Q4
s2 = "Sam"
isMatch(s1,s2)

val s3 = s1.toUpperCase

s1.contentEquals(s3) match {
  case true => println("s1 and s3 are equal")
  case false => println("s1 and s3 are not equal")
}

