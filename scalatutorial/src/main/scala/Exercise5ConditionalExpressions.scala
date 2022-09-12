object Exercise5ConditionalExpressions extends App {
  //question 1
  val a: Int  = 1
  val b: Int = 5

  if(a<b){
    println("a is less than b")
  }
  else{
    println("a is not less than b")
  }

  //question 2
  if(a<2){
    println("a is less than 2")
  }
  else{
    println("a is not less than 2")
  }

  if(b<2){
    println("b is less than 2")
  }
  else{
    println("b is not less than 2")
  }

  //question 3
  val c: Int = 5

  if(a<c){
    println("a is less than c")
    if(b<c){
      println("b is less than c")
    }
    else{
      println("b is not less than c")
    }
  }
  else{
    println("a is not less than c")
    if(b<c){
      println("b is less than c")
    }
    else{
      println("b is not less than c")
    }
  }
}
