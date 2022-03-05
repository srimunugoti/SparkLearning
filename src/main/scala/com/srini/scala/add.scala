package com.srini.scala

object add{
   def addInt( a:Int, b:Int ) : Int = {
      var sum:Int = 0
      sum = a + b

      return sum
   }
   def main(args:Array[String]){
    println("the result is :"+addInt(2, 1));
   }
}

/* unit like void in java
 * object Hello{
   def printMe( ) : Unit = {
      println("Hello, Scala!")
   }
}
 */
