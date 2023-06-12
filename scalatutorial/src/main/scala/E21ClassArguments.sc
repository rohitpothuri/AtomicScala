import com.atomicscala.AtomicTest._

class Family(names: String*){
  def familySize(): Int ={
    names.size
  }
}

val family1 = new Family("Mom", "Dad", "Sally", "Dick")
family1.familySize() is 4

val family2 = new Family("Dad", "Mom", "Harry")
family2.familySize() is 3

class FlexibleFamily(father: String, mother: String, children: String*){
  def familySize(): Int ={
    children.size + 2
  }
}

val family4 = new FlexibleFamily("Dad", "Mom", "Harry")
 family4.familySize() is 3

val familyNoKids = new FlexibleFamily("Mom", "Dad")
familyNoKids.familySize() is 2

//Q4 No

//Q5 No

//Q6
class Cup2(var percentFull: Int){
  val maxPercent = 100
  val minPercent = 100
  def increase(fills: Int*): Int ={
    for(x<-fills){
      percentFull += x
      if(percentFull>100) percentFull = 100
    }
    percentFull
  }
}

//Q7
val c1 = new Cup2(1)
c1.percentFull is 1
c1.percentFull=2
c1.percentFull is 2


//Q8
val cup5 = new Cup2(0)
cup5.increase(20, 30, 50, 20, 10, -10, -40, 10, 50) is 100
cup5.percentFull
cup5.increase(10, 10, -10, 10, 90, 70, -70) is 30

//Q9
class SumSquares{
  def squareThem(args: Int*): Int = {
    var sum: Int = 0
    for (x <- args) {
      sum += x * x
    }
    sum
  }
}

val s1 = new SumSquares
s1.squareThem(2) is 4
s1.squareThem(2, 4) is 20
s1.squareThem(1, 2, 4) is 21
