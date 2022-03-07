package com.srini.scala

object qfunvariable {
   def main(args: Array[String]) {
        printStrings("Hello", "Scala", "spark");
   }
   def printStrings( args:String* ) = {
      var i : Int = 0;
      for( arg <- args ){//for comprehension also known as for
         println("Arg value[" + i + "] = " + arg );
         i = i + 1;
      }
   }
}
// "String*" is actually Array[String].


