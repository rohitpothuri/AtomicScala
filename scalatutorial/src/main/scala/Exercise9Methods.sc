//question 1
def getSquare(ip: Int): Int = {
  ip*ip
}

val ip1 = 3
val a = getSquare(ip1)
assert(a==9,s"$ip1 squared is not 9")

val ip2 = 6
val b = getSquare(ip2)
assert(b==36,s"$ip2 squared is not 36")

val ip3 = 5
val c = getSquare(ip3)
assert(c==25,s"$ip3 squared is not 25")

//question 2
def getSquareDouble(ip: Double): Double = {
  ip*ip
}

val sd1 = getSquareDouble(1.2)
assert(1.44==sd1,s"1.44 is not equal to $sd1")

val sd2 = getSquareDouble(5.7)
assert(32.49==sd2,s"32.49 is not equal to $sd2")

//question 3
def isArg1GreaterThanArg2(arg1: Double, arg2: Double): Boolean = {
  arg1>arg2
}
val t1 = isArg1GreaterThanArg2(4.1,4.12)
assert(t1==false, "t1 should be false")
val t2 = isArg1GreaterThanArg2(2.1,1.2)
assert(t2==true, "t2 should be true")

//question 4
def getMe(ip: String): String = {
  ip.toLowerCase
}
val g1 = getMe("abraCaDabra")
assert(g1=="abracadabra","g1 is not abracadabra")
val g2 = getMe("zyxwVUT")
assert(g2=="zyxwvut","g2 is not zyxwVUT")

//question 5
def addStrings(s1: String, s2: String): String = {
  s1+s2
}
val s1 = addStrings("abc","def")
assert(s1=="abcdef","s1 should be abcdef")

val s2 = addStrings("zyx","abc")
assert(s2=="zyxabc","s2 should be zyxabc")

//question 6
def manyTimesString(s1: String, times: Int): String = {
  s1*times
}
val m1 = manyTimesString("abc",3)
assert("abcabcabc"== m1,"m1 should be abcabcabc")
val m2 = manyTimesString("123",2)
assert("123123"== m2,"m2 should be 123123")

//question 6
def bmiStatus(lbs: Double, height: Double): String = {
  val bmi = lbs/(height * height) * 703.07
  if(bmi < 18.5)  "Underweight"
  else if(bmi < 25)  "Normal weight"
  else  "Overweight"
}
val normal = bmiStatus(160,68)
assert("Normal weight"== normal,s"Expected Normal weight, Got $normal")
val overweight = bmiStatus(180,60)
assert("Overweight"== overweight,s"Expected Overweight, Got $overweight")
val underweight = bmiStatus(100,68)
assert("Underweight"== underweight,s"Expected Underweight, Got $underweight")

