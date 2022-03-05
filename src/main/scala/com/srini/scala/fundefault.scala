package com.srini.scala

object fundefault
 {
   def main(args: Array[String]) {
        println( "Returned Value : " + addInt() );//params omitted from function call
   }
   def addInt( a:Int=5, b:Int=7 ) : Int = {
      var sum:Int = 0
      sum = a + b

      return sum
   }
   /*def addInt(x:Int=0 ,z:Int=1,c:Int=2) : Int= {
    return x
   }*/
}

