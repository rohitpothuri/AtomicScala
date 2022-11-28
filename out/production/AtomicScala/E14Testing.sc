import com.atomicscala.AtomicTest._

//Q1
val myValue1 = 20
val myValue2 = 10

//myValue1 is myValue2

//Q2
val myValue3 = 10
val myValue4 = 10

myValue3 is myValue4

//Q3
myValue3 is myValue2

//Q4
val myValue5 = "10"
//myValue5 is myValue2

//Q5
def squareArea(x: Int): Int = {x*x}
def rectanglaArea(x: Int, y: Int) = {x*x}
def trapezoidArea(x: Int, y: Int, h: Int) = {h/2*(x+y)}

squareArea(3) is 9
squareArea(5) is 25

//rectanglaArea(5,6) is 30
def rectanglaArea2(x: Int, y: Int) = {x*y}
rectanglaArea2(5,6) is 30
trapezoidArea(5,5,5) is 25



