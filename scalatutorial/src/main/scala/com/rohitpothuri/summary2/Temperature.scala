package com.rohitpothuri.summary2

class Temperature {
  var current = 0.0
  var scale = "f"
  def setFahrenheit(now:Double):Unit = {
    current = now
    scale = "f"
  }
  def setCelsius(now:Double):Unit = {
    current = now
    scale = "c"
  }
  def getFahrenheit():Double = {
    if(scale == "f")
      current
    else
      current * 9.0/5.0 + 32.0
  }
  def getCelsius():Double = {
    if(scale == "c")
      current
    else
      (current - 32.0) * 5.0/9.0
  }

  def setKelvin(now: Double): Unit = {
    current = now
    scale = "k"
  }

  def getKelvin():Double = {
    if(scale == "k"){
      current
    }
    else{
      getCelsius() + 273.15
    }
  }
}
