package com.srini.scala

object strconcat {
 def main(args: Array[String]) {
      var str1 = "Dot saw I was ";
      var str2 =  "Tod";
      println("Dot " + str1 + str2);
      //or
     println( str1.concat(str2))
   }
}