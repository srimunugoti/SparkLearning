package com.srini.scala

import java.io._
object fileio {
  def main(args: Array[String]) {
    val writer = new PrintWriter(new File("test.txt"))

    writer.write("Hello Scala")
    println("Successfully writen")
    writer.close()
  }
}

