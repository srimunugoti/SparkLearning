package com.srini.scala

import scala.util.control._
object Test {
/*   def main(args: Array[String]) {
      var x = 30;

      if( x < 20 ){
         println("This is if statement");
      }else{
         println("This is else statement");
      }
   }
}*/

/*Nested if...else Statement:
  
  def main(args: Array[String]) {
        var x = 30;
        var y = 10;

         if( x == 30 ){
            if( y == 10 ){
            println("X = 30 and Y = 10");
         }
      }
   }*/


/*break statement 
 * 
 * */def main(args: Array[String]) {
      var a = 0;
      val numList = List(1,2,3,4,5,6,7,8,9,10);

      val loop = new Breaks;
      loop.breakable {
         for( a <- numList){
            println( "Value of a: " + a );
            if( a == 4 ){
               loop.break;
            }
         }
      }
      println( "After the loop" );
   }
}