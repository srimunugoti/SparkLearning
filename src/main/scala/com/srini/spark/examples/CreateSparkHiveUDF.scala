package com.srini.spark.examples

import com.srini.spark.utils.ReadWriteUtils.readCsvData
import com.srini.spark.utils.SparkUtils.createSparkSession
import org.apache.spark.sql.functions.{expr, udf}
import org.joda.time.format.DateTimeFormat

object CreateSparkHiveUDF extends App{
  
  val spark= createSparkSession
  import spark.implicits._
  
  
  
  val eventsDf=readCsvData(spark,"events.csv")
  
  //Register UDF in Spark Session
  val timeStampConversionUDF=udf(timeStampConversion(_))
  
  //Register UDF in Spark Sql Catalogue
  
  spark.udf.register("hivetimeStampConversionUDF",timeStampConversion(_))
  
  eventsDf.withColumn("newTimeStamps",timeStampConversionUDF($"timestamp")).show()
  eventsDf.withColumn("newTimeStamp",expr("hivetimeStampConversionUDF(timestamp)")).show()
  
  
  def timeStampConversion(s:String) ={
    DateTimeFormat.forPattern("YYYY-MM-dd HH:mm:ss").print(s.toLong)
  }
}
