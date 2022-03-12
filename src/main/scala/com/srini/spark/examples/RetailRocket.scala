package com.srini.spark.examples

import com.srini.spark.utils.ReadWriteUtils.readCsvData
import com.srini.spark.utils.SparkUtils.createSparkSession
import org.apache.spark.sql.Column
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types.StringType

object RetailRocket {
  def main(args: Array[String]): Unit = {

    val spark=createSparkSession
    val resourcePath = "src/main/resources/practisefiles/"
    
//    val categoryDf=readCsvData(spark,resourcePath+"category_tree.csv")
//    categoryDf.show(10)
    
    val eventsDf=readCsvData(spark,resourcePath+"events.csv")
    //val newUdf=spark.udf.register("retunTimestamp",retunTimestamp(_:Column))
    
    
    //eventsDf.withColumn("timestamp",newUdf(col("timestamp"))).show()
    
    
//   eventsDf.withColumn("timestamp", to_timestamp(col("timestamp").cast(StringType)/1000
//     ,"yyyy-mm-dd")).
//     show(2)
//
    
    
//
    val events=eventsDf.withColumn("date",
      from_unixtime(col("timestamp")/1000,"yyyy-mm-dd"))
  .filter(col("event")==="view")
  .groupBy("itemid").agg(count(col("event")).as("counts"))
  .orderBy(col("counts").desc).limit(10)
  events.show()
  
    eventsDf
      .filter(col("event")==="view")
      .groupBy("itemid")
      .count().orderBy(col("count").desc).limit(10).show()
      
    
    
    
   
    //events.show(false)
    
   // eventsDf.show(10)
    
//    val itemPropertiesDf=readCsvData(spark,resourcePath+"item_properties_*.csv")
//    itemPropertiesDf.show(10)
  
    
  
  
  }
}
