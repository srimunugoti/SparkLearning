package sample

import org.apache.spark.sql.SparkSession

object ReadCsvFile {
  def main(args: Array[String]): Unit = {
    val spark=SparkSession
      .builder()
      .master("local")
      .appName("localTest")
      .getOrCreate()
spark.sparkContext.setLogLevel("WARN")
    val resourcePath="src/main/resources/practisefiles/"
    val csvDF=spark.read.option("header",true).csv(resourcePath+"crash_catalonia.csv")
    csvDF.show()
  }
}
