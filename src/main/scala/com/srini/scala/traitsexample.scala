package com.srini.scala

trait Equal {
  def isEqual(x: Any): Boolean //no implementation
  def isNotEqual(x: Any): Boolean = !isEqual(x) // with implementation
}

class Demo1(xc: Int, yc: Int) extends Equal {
  var x: Int = xc
  var y: Int = yc
  def isEqual(obj: Any) =
    obj.isInstanceOf[Demo1] &&
      obj.asInstanceOf[Demo1].x == y
}
object traitsexample {

  def main(args: Array[String]) {
    val p1 = new Demo1(2, 3)
    val p2 = new Demo1(2, 4)
    val p3 = new Demo1(3, 3)

    println(p1.isNotEqual(p2))
    println(p1.isNotEqual(p3))
    println(p1.isNotEqual(2))
  }
}

