package com.srini.scala

object list {

   def main(args: Array[String]) {
     //val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))
     val fruit :List[String]=List( "apples" ,"oranges","pears")
      val nums = Nil

      println( "Head of fruit : " + fruit.head )
      println( "Tail of fruit : " + fruit.tail )
      println( "Check if fruit is empty : " + fruit.isEmpty )
      println( "Check if nums is empty : " + nums.isEmpty )
   }
}


/*
 *  val fruit :List[String]=List( "apples" ,"oranges","pears")
      val nums = Nil

      println( "Head of fruit : " + fruit.head )
      println( "Tail of fruit : " + fruit.tail )
      println( "Check if fruit is empty : " + fruit.isEmpty )
      println( "Check if nums is empty : " + nums.isEmpty )
 */
