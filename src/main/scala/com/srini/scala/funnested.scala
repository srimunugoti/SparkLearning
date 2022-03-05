package com.srini.scala

object funnested {
   def main(args: Array[String]) {
      println( factorial(3) )
      
   }

   def factorial(i: Int): Int = {
      def fact(i: Int, accumulator: Int): Int = {
         if (i <= 1)
            accumulator
         else
            fact(i - 1, i * accumulator)
      }
      fact(i, 1)
   }
}

