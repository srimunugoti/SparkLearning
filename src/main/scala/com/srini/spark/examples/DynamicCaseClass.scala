package com.srini.spark.examples

import com.srini.spark.utils.ReadWriteUtils.readCsvData
import com.srini.spark.utils.SparkUtils.createSparkSession
import org.apache.spark.sql.types._

object DynamicCaseClass {
  type TypeConverter = (DataType) => String
  
  def main(args: Array[String]): Unit = {
    val spark=createSparkSession
    val resourcePath = "src/main/resources/practisefiles/"
    val fileName="events.csv"
    val csvDF = readCsvData(spark,resourcePath+fileName)
    val s2cc = new Schema2CaseClass
    import s2cc.implicits._
    
      println(s2cc.schemaToCaseClass(csvDF.schema, "MyClass"))
    
  
  
   
    
    
  }
  
  
  
}