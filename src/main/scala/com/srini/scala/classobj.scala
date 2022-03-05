package com.srini.scala

class point (val xc: Int, val yc: Int) {
   var x: Int = xc
   var y: Int = yc
   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
      println ("Point x location : " + x);
      println ("Point y location : " + y);
   }
}

object classobj {
   def main(args: Array[String]) {
      val pt = new point(10, 20);

      // Move to a new location
      pt.move(10, 10);
   }

}