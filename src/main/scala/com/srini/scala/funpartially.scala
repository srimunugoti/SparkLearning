package com.srini.scala

import java.util.Date
/*object funpartially {
  def main(args: Array[String]) {
    val date = new Date
    log(date, "message1")
    Thread.sleep(1000)
    log(date, "message2")
    Thread.sleep(1000)
    log(date, "message3")
  }

  def log(date: Date, message: String) = {
    println(date + "----" + message)
  }
}*/
//Partially Applied Functions
object funpartially {
   def main(args: Array[String]) {
      val date = new Date
      val logWithDateBound = log(date, _ : String,_:String)//underscore is like joker no matter what it is

      logWithDateBound("message1","" )
      Thread.sleep(1000)
      logWithDateBound("message2" ,"")
      Thread.sleep(1000)
      logWithDateBound("message3" ,"")
   }

   def log(date: Date, message: String,ff:String)  = {
     println(date + "----" + message+""+ff)
   }
}
