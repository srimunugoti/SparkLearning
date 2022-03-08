package com.srini.spark.examples

import com.srini.spark.utils.ReadWriteUtils.readCsvData
import com.srini.spark.utils.SparkUtils.createSparkSession

object RetailRocket {
  def main(args: Array[String]): Unit = {

    val spark=createSparkSession
    val resourcePath = "src/main/resources/practisefiles/"
    val categoryDf=readCsvData(spark,resourcePath+"category_tree.csv")
    categoryDf.printSchema()
    val eventsDf=readCsvData(spark,resourcePath+"events.csv")
    eventsDf.select("transactionid").distinct().show()
    val itemPropertiesDf=readCsvData(spark,resourcePath+"item_properties_*.csv")
    itemPropertiesDf.printSchema()
    
  }
}
