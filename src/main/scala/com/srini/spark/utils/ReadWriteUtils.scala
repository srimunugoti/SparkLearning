package com.srini.spark.utils

import org.apache.spark.sql.{DataFrame, SaveMode, SparkSession}

import java.util.Properties

object ReadWriteUtils {
  val resourcePath = "src/main/resources/practisefiles/"
  val url = "jdbc:postgresql://localhost:5432/"
  val connectionProperties = new Properties()

  def readCsvData(spark:SparkSession,fileName:String):DataFrame={

    spark.read.option("header",true).option("inferSchema","true").csv(resourcePath+fileName)

  }

  def readFromPostgres(spark:SparkSession,tableName:String,schema:String):DataFrame={
    connectionProperties.setProperty("Driver", "org.postgresql.Driver")
    spark.read.option("user","postgres")
      .option("password","postgres")
      .jdbc(url+schema, tableName, connectionProperties)
  }

  def writeToPostgres(spark:SparkSession,mode:SaveMode,tableName:String,schema:String,df:DataFrame)={
    df.write.mode(mode)
      .option("user", "postgres")
      .option("password", "postgres")
      .jdbc(url+schema,"sparkCsv",connectionProperties)
  }
}
