package com.srini.spark.utils

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

import java.util.Properties
import scala.collection.JavaConverters._
import scala.io.Source

object SparkUtils {

  def createSparkSession:SparkSession ={
    val spark = SparkSession
      .builder().config(getSparkAppConf)
      .getOrCreate()
    println("Spark Conf:")
    spark.conf.getAll.foreach(x=>println(x.toString()))
    spark
  }

  def getSparkAppConf:SparkConf={
    val sparkAppConf=new SparkConf()
    val props= new Properties()
    props.load(Source.fromFile("spark.conf").bufferedReader())

    /*For Scala 2.12

    props.forEach((k,v) => sparkAppConf.set(k.toString,v.toString))*/

    props.asScala.foreach(kv => sparkAppConf.set(kv._1,kv._2))
    sparkAppConf
  }
}
