import com.atomicscala.AtomicTest._


val v = Vector(1, 2, 3, 4)

//Exercise 1
val str = v.mkString
str is "1234"

//Exercise 2
val str = v.map(n => n + ",").mkString
str is "1,2,3,4,"


val dogYears = (n: Int) => n * 7

dogYears(10) is 70


var s = ""
val v = Vector(1, 5, 7, 8)
v.foreach(n=>s = s+dogYears(n)+" ")
s is "7 35 49 56 "


var s = ""
val v = Vector(1, 5, 7, 8)
v.foreach(n=>s = s+n*7+" ")
s is "7 35 49 56 "


val between = (temperature: Int, low: Int,  high: Int) => {
  if(temperature >= low && temperature <= high) true
  else false
}

between(70, 80, 90) is false
between(70, 60, 90) is true


var s = ""
val numbers = Vector(1, 2, 5, 3, 7)
numbers.foreach(n => s = s+n*n + " " )
s is "1 4 25 9 49 "

val pluralize = (word: String) => word + "s"
pluralize("cat") is "cats"
pluralize("dog") is "dogs"
pluralize("silly") is "sillys"


var s = ""
val words = Vector("word", "cat", "animal")
words.foreach(n=> s = s+pluralize(n) + " ")
s is "words cats animals "