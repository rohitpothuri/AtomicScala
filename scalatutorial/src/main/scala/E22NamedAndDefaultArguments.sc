import com.atomicscala.AtomicTest._

class SimpleTime(val hours: Int, val minutes: Int)

val s1 =  new SimpleTime(hours = 5, minutes = 30)
s1.hours is 5
s1.minutes is 30

class SimpleTime2(val hours: Int, val minutes: Int = 0)
val t2 = new SimpleTime2(hours=10)
t2.hours is 10
t2.minutes is 0

class Planet( name: String, description : String, moons: Int = 1){
  def hasMoon = if(moons>0) true else false
}

val p = new Planet(name = "Mercury", description = "small and hot planet", moons = 0)
p.hasMoon is false

val earth = new Planet(moons = 1, name = "Earth", description = "a hospitable planet")
earth.hasMoon is true

//Q5 No
/*
class FlexibleFamily(father: String = "Dad", mother: String = "Mom", children: String*){
  def familySize(): Int ={
    children.size + 2
  }
}*/

//Q6
class Item(name: String, price: Double){

  def cost(grocery: Boolean = false, medication: Boolean = false, taxRate: Double = 0.10): Double = {
    price + (if(grocery || medication) 0 else price*taxRate)
  }

}

val flour = new Item(name="flour", 4)
flour.cost(grocery=true) is 4
val sunscreen = new Item( name="sunscreen", 3)
sunscreen.cost() is 3.3
val tv = new Item(name="television", 500)
tv.cost(taxRate = 0.06) is 530