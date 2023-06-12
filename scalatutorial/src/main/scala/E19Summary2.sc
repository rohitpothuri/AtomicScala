import com.atomicscala.AtomicTest._
import com.rohitpothuri.summary2.{EveryBody, Grid, NoBody, SomeBody, Temperature}
//Q1
val v1 = Vector(2,1,3)
println(v1.max, v1.min)
val v2 = Vector("bc","cd","ab")
println(v2.max, v2.min)
val v3 = Vector('a','b','c')
println(v3.max, v3.min)

var v1String: String = ""
for(x<-v1.sorted){
    v1String += x + " "
}
println(v1String)

var v2String: String = ""
for(x<-v2.sorted){
    v2String += x + " "
}
println(v2String)

var v3String: String = ""
for(x<-v3.sorted){
    v3String += x + " "
}
println(v3String)

//Q2
var v4String: String = ""
val v4 = Vector(v1, v2, v3)
for(x<-v4){
    for(y<-x){
        v4String += y + " "
    }
}
v4String is "2 1 3 bc cd ab a b c "

//Q3
val v5 = Vector(1,'1',"123")
//println(v5.max, v5.min)

//Q4
import com.rohitpothuri.summary2.BasicMethods
val b = new BasicMethods
b.cube(3) is 27
b.bang("pop") is "pop!"

//Q5
val nb = new NoBody
nb.value is "There is nobody"

val sb = new SomeBody
sb.name is "Janet Doe"

val eb = new EveryBody
eb.c is "Janet Doe Janet Doe Janet Doe "

//Q6

val t = new Temperature
t.setCelsius(1)
t.getKelvin() is 274.15
t.setKelvin(123)
t.getKelvin() is 123

val g = new Grid()
g.play('X',0,0)
g.play('X',1,1)
g.play('X',2,2)
//
g.play('X',2,2)
