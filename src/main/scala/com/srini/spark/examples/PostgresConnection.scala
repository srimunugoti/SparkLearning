package com.srini.spark.examples

import com.srini.spark.utils.ReadWriteUtils.{readCsvData, writeToPostgres}
import com.srini.spark.utils.SparkUtils.createSparkSession
import org.apache.spark.sql.SaveMode

object PostgresConnection {
  def main(args: Array[String]): Unit = {
    
    val spark=createSparkSession
    
    val resourcePath = "src/main/resources/practisefiles/"
    val fileName="business_employment_data.csv"
    
    val inputdf=readCsvData(spark,resourcePath+fileName)
    
    writeToPostgres(spark,SaveMode.Append,"sparkcsv","testing",inputdf)
  }
}
