package com.srini.scala

object iterator {
def main(args: Array[String]) {
      val it = Iterator("a", "number", "of", "words")
      
      while (it.hasNext){
         println(it.next())
      }
   }
}

