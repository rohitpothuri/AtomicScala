import com.atomicscala.AtomicTest._

class Cup2{
  var percentFull = 0
  val max = 100
  def add(increase: Int) = {
    percentFull += increase
    if(percentFull>max){
      percentFull = max
    }
    if(percentFull<0)
      percentFull=0
    percentFull
  }

  def set(value: Int):Unit= percentFull=value

  def get: Int= percentFull
}
//Q1
val cup2 = new Cup2
cup2.add(45) is 45
cup2.add(-15) is 30
cup2.add(-50) is -20
//Q2
val cup3 = new Cup2
cup3.add(45) is 45
cup3.add(-55) is 0
cup3.add(10) is 10
cup3.add(-9) is 1
cup3.add(-2) is 0
//Q3
cup3.percentFull = 56
cup3.percentFull is 56
//Q4
val cup4 = new Cup2
cup4.set(56)
cup4.get is 56