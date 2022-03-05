package com.srini.scala

object PolymorphicMethod {
def main(args: Array[String]) {
    def add(a: Int, b: Int) {
      val c = a + b;
      println(c)
    }
 
    def addStrings(a: String, b: String) {
      val s = a + b
      println(s)
    }
 
    add(72, 67);
    addStrings("Hello", "World");
  }
}