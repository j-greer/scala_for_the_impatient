/**
  * Created by jonathangreer on 13/11/2016.
  */

// In the Scala REPL, compute the square root of 3, and then square that value. By how much does the result differ from
// 3?

import scala.math.{sqrt, pow}

val threeSquared = sqrt(3)

threeSquared - pow(threeSquared, 2)