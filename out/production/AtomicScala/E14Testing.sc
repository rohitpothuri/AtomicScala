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
def rectanglaArea(x: Int, y: Int) = {x*y}
def trapezoidArea(x: Int, y: Int, h: Double): Double = {h/2*(x+y)}

squareArea(1) is 1
squareArea(2) is 4
squareArea(5) is 25
rectanglaArea(2,2) is 4
rectanglaArea(5,4) is 20
trapezoidArea(2,2,4) is 8
trapezoidArea(3,4,1) is 3.5




