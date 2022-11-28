import com.atomicscala.AtomicTest._
//Q1
val v1 = Vector(1,2,3)
val v2 = Vector("","","")
val v3 = Vector("1","2","3")
val v4 = Vector(1.0,2.9,3.5)

//Q2
val v5 = Vector(v1,v2,v3,v4)

//Q3
val v6 = Vector("The","dog","visited","the","firehouse")
var sentence: String = ""
for(i<-v6){
  println(i)
  sentence += i + " "
}
sentence is "The dog visited the firehouse "

//Q4
val s2 = sentence.replace("firehouse ","firehouse!")
s2 is "The dog visited the firehouse!"

//Q5
for(i<-v6){
  println(i.reverse)
}

//Q6
for(i<-v6.reverse){
  println(i)
}

//Q7
val v8 = Vector(1,2,3,5)
val v9 = Vector(1.6,0.2,3.5,5.6)

println(v8.min, v8.max, v8.sum)
println(v9.min, v9.max, v9.sum)

//Q8
val v10 = Vector("The","dog","visited","the","firehouse")
//println(v10.min, v10.max, v10.sum)

//Q9
Range(1,11).sum

//Q10
val set1 = Set(1,2,3,0)
val l1 = List(1,2,3,0)

//Q11
for(i<-set1)
  println(i)
for(i<-l1)
  println(i)
/*for(i<-set1.reverse)
  println(i)*/
for(i<-l1.reverse)
  println(i)
/*for(i<-set1.sorted)
  println(i)*/
for(i<-l1.sorted)
  println(i)

//Q12
val myVector1 = Vector(1,2,3)
val myVector2 = Vector(1,2,3)
myVector1 is myVector2