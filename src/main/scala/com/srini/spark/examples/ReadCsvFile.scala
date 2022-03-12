package com.srini.spark.examples

import com.srini.spark.utils.ReadWriteUtils.readCsvData
import com.srini.spark.utils.SparkUtils.createSparkSession
import org.apache.spark.sql.{Dataset, Row}

object ReadCsvFile {
  case class Schema(Series_reference:String)
  def main(args: Array[String]): Unit = {

   val spark=createSparkSession
    val fileName="business_employment_data.csv"
    import spark.implicits._
    val csvDF= readCsvData(spark,fileName).select("Data_value")
    csvDF.filter($"Data_value" === 80078)
    csvDF.show()

  }
}

