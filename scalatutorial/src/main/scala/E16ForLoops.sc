import com.atomicscala.AtomicTest._
//Q3
var r1 = ""
for (i<-Range(0,10)){
    r1 += i + " "
}

r1 is "0 1 2 3 4 5 6 7 8 9 10 "

//Q2
r1 = ""
for (i<-Range(0,10).inclusive){
    r1 += i + " "
}
r1 is "0 1 2 3 4 5 6 7 8 9 10 "

//Q3
var r3 = 0
for (i<-Range(0,10)){
    r3 += i
}

r3 is 45

//Q4
var r4 = 0
for (i<-Range(1,10).inclusive){
    if(i%2==0)
        r4 += i
}
r4 is 30

//Q5
var even = 0
var odd = 0
for (i<-Range(1,10).inclusive){
    if(i%2==0)
        even += i
    else
        odd += i
}
even is 30
odd is 25
even+odd is 55

//Q6
var even1 = 0
var odd1 = 0
for (i<-1 until 11){
    if(i%2==0)
        even1 += i
    else
        odd1 += i
}
even1 is 30
odd1 is 25
even1+odd1 is 55

var even2 = 0
var odd2 = 0
for (i<-1 to 10){
    if(i%2==0)
        even2 += i
    else
        odd2 += i
}
even2 is 30
odd2 is 25
even2+odd2 is 55
