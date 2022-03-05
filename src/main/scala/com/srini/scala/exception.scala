package com.srini.scala

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException
object exception {
  def main(args: Array[String]) {
    try {
      var a: Int = 0
      var b: Int = 10
      var c: Int = b / a
      println(c)
    } catch {
      case ex: ArithmeticException => {
        println("Divide by zero exception")
      }
      case ex: IOException => {
        println("IO Exception")
      }
    }
  }
}