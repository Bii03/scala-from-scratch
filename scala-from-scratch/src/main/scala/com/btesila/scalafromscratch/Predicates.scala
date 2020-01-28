package com.btesila.scalafromscratch

/**
 * On function values
 */
object Predicates {

  val isEven: Int => Boolean = _ % 2 == 0

  val areEven: (Int, Int) => Boolean = (x, y) => isEven(x) && isEven(y)

  /**
   * Serves as a generalization for `areEven` and how it uses `isEven`
   */
  def forBoth(x: Int, y: Int, cond: Int => Boolean): Boolean =
    cond(x) && cond(y)

}
