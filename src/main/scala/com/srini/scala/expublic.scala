package com.srini.scala

class expublic {
  protected def display() {
    println("i am parent")
  }
}

class child extends expublic {
  def print() {
    println("i am child")
  }

  def main(args:Array[String])
  {
    val demo =new child()
    demo.print
    demo.display
  }
}

//other class
class other{
  val demo=new child()
  
}
