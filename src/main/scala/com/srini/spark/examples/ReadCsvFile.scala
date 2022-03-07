package com.srini.spark.examples

import com.srini.spark.utils.ReadWriteUtils.readCsvData
import com.srini.spark.utils.SparkUtils.createSparkSession

object ReadCsvFile {
  def main(args: Array[String]): Unit = {

   val spark=createSparkSession
    val resourcePath = "src/main/resources/practisefiles/"
    val fileName="business_employment_data.csv"
    val csvDF = readCsvData(spark,resourcePath+fileName)
    csvDF.printSchema()
    csvDF.show()

  }
}
