package com.srini.spark.examples

import com.srini.spark.utils.ReadWriteUtils.readCsvData
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types.{DecimalType, DoubleType, IntegerType, LongType, StringType}
import org.scalatest.{BeforeAndAfterAll, FunSuite}

class ReadCsvFileTest extends FunSuite with BeforeAndAfterAll{
  var spark:SparkSession=_
  
  override def beforeAll(): Unit = {
    spark=SparkSession
      .builder()
      .appName("LocalSparkTest")
      .master("local[3]")
      .getOrCreate()
  }
  override def afterAll(): Unit = {
    spark.stop()
  }
  test("Read CSV File"){
    val resourcePath = "src/test/resources/"
    val fileName="business_employment_data.csv"
    val csvDF = readCsvData(spark,resourcePath+fileName)
    
    val recordCount=csvDF.count()
    assert(recordCount==4,"record cound should be 19093")
  
    val actualSumDf=csvDF.filter(col("Series_title_3")==="Actual")
      .groupBy("Series_title_3")
      .agg(sum(col("Data_value")).as("Ty_Data_Value"))
      .select("Series_title_3","Ty_Data_Value")
    
    val eqValue:Long=334995
    val sumValue=actualSumDf.select("Ty_Data_Value").first().getLong(0)
    assert(sumValue===eqValue,"Sum of DataValue for Actual series is 334995 ")
  }
}
