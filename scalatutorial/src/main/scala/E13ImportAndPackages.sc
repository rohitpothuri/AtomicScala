import com.rohitpothuri.aspythagorean.{EquilateralTriangle, RightTriangle}

//Q1
val rt = new RightTriangle
println(rt.hypotenuse(3,4))
println(rt.area(3,4))
assert(rt.hypotenuse(3,4)==5)
assert(rt.area(3,4)==6)

//Q2
val et = new EquilateralTriangle
assert(math.round(et.area(3))==4)

//Q3
import com.rohitpothuri.aspythagorean.EquilateralTriangle
import com.rohitpothuri.aspythagorean.RightTriangle
import com.rohitpothuri.aspythagorean.{EquilateralTriangle, RightTriangle}
import com.rohitpothuri.aspythagorean.{EquilateralTriangle=> ETR, RightTriangle=> RTR}

val rt1 = new RTR
val et1 = new ETR
assert(rt1.area(3,4)==6)
assert(math.round(et1.area(3))==4)

import com.rohitpothuri.asanimals.Giraffe
import com.rohitpothuri.asanimals.Lion
import com.rohitpothuri.asanimals.Tiger

import com.rohitpothuri.asanimals.{Giraffe, Lion}

import com.rohitpothuri.asanimals._

