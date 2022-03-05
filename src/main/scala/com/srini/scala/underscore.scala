package com.srini.scala

object underscore {
  def main(args: Array[String]) {
    val numbers = Array(1, 2, 3, 4, 5)
    val sum = numbers.reduceLeft[Int](_ + _)
    val sum1 = numbers.reduceRight[Int](_ + _)
    println("The sum of the numbers one through five is " + sum + "---" + sum1)
  }
}