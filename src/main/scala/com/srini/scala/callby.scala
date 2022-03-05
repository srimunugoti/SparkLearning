package com.srini.scala

object callby {
  def main(args: Array[String]) {
  //  delayed(time(),time());
    delayed(time())
    
  }
/*def r(x:String)={
 
  
}*/
  def time()={
    println("Getting time in nano seconds")
    System.nanoTime
  }
  def delayed(t: => Long) = {//call by name
    println("In delayed method")
    println("Param: " + t)
    //println(x)
  //  println("Param: " + t1)

  }
}