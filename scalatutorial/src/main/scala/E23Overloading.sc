import com.atomicscala.AtomicTest._


/*
class Overloading1 {

  def f(n:Int):Int = { 88 }

  def f(n:Int):Int = { n + 2 }

}
class Overloading2 {
  def f():Int = { 99 }
  def f():Int = { 3 }
}*/


class Overloading3 {
  def f():Int = { 0 }
  def f(a: Int):Int = { a }
  def f(a: Int, b: Int):Int = { a + b }
  def f(a: Int, b: Int, c: Int):Int = { a + b + c }
  def f(a: Int, b: Int, c: Int, d: Int):Int = { a + b + c + d }
  def f(a: Double, b: Double, c: Double, d: Double) = { a + b + c + d }


  f() is 0
  f(1) is 1
  f(1, 2) is 3
  f(1, 2, 3) is 6
  f(1, 2, 3, 4) is 10

}

val o3 =  new Overloading3

