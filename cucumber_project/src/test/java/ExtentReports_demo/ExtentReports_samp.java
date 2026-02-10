package ExtentReports_demo;

//import org.junit.BeforeClass;

//import org.junit.BeforeClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReports_samp {

	static ExtentReports extent;
	static ExtentSparkReporter spark;
	
	@BeforeClass
	public void startest()
	{
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("target/spark.html");
		
	}
	@Test
	public void extentest() {
		
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("AutomationReport");
		spark.config().setReportName("ReportDemo");
		
		extent.attachReporter(spark);
		
		//create test node in the report
		ExtentTest test=extent.createTest("Login test").assignAuthor("vijju");
		test.pass("homepage sucessfull");
		test.info("value entered");
		test.fail("home page fail");
	
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.co.in/");
		if(driver.getTitle().equals("Google"))
		{
			test.log(Status.PASS ,"Navigated to the specified URL");
		}
		else {
			
			test.log(Status.FAIL , "Test Failed");
		}
		driver.quit();
	}
	@AfterMethod
	public void teardown() {
		extent.flush();
	}

}
