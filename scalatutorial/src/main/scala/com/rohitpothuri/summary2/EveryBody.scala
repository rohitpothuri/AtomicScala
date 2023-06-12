package com.rohitpothuri.summary2

class EveryBody {
  val all = Vector(new SomeBody,new SomeBody, new SomeBody)
  var c = ""
  for(x<-all){
    c+= x.name + " "
  }
  c
}
