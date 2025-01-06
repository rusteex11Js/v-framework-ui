package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import java.io.File;
import java.io.IOException;

public class ReportUtils {
    private static volatile ExtentReports extent;
    private static volatile ExtentSparkReporter spark;

    private static void initiateReport(){
        try {
            extent = new ExtentReports();
            spark = new ExtentSparkReporter("target/spark/spark.html");
            spark.loadJSONConfig(new File("src/main/resources/spark-config.json"));
            extent.attachReporter(spark);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static ExtentReports getFullReport() {
        if(extent == null){
            initiateReport();
        }
        return extent;
    }

    public static void flushReport(){
        if(extent != null){
            extent.flush();
        }
    }

}
