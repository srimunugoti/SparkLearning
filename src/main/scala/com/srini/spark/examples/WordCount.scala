package com.srini.spark.examples

import com.srini.spark.utils.SparkUtils.createSparkSession
import org.apache.spark.sql.functions.expr

object WordCount {
  def main(args: Array[String]): Unit = {
    val spark=createSparkSession
    val resourcePath = "src/main/resources/practisefiles/"
    val fileName="sample.txt"
    val df=spark.read.text(resourcePath+fileName)
    val words=df.select(expr("explode(split(value,' ')) as word"))
    println("words Count             : "+words.count())
    val countDf=words.groupBy("word").count()
    countDf.show()
  }
}
