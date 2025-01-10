//package base;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//
//import java.io.File;
//import java.io.IOException;
//
//public class ReportBase {
//    private static volatile ExtentReports extent;
//
//    public static ExtentReports getExtentInstance(){
//        try {
//            extent = new ExtentReports();
//            ExtentSparkReporter spark = new ExtentSparkReporter("target/spark/spark.html");
//            spark.loadJSONConfig(new File("src/main/resources/spark-config.json"));
//            extent.attachReporter(spark);
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//        return extent;
//    }
//
//}
