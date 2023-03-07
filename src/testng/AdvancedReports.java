package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class AdvancedReports {
ExtentReports report;
ExtentTest test;
WebDriver driver;
@BeforeTest
public void generateReports()
{
	report= new ExtentReports("./Reports/Demo.html", false);
}
@BeforeMethod
public void setUp()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://google.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@Test
public void passTest()
{
	test=report.startTest("My Test Case Pass");
	test.assignAuthor("Ranga");
	String expected ="google";
	String actual =driver.getTitle();
	if(expected.equalsIgnoreCase(actual))
	{
		test.log(LogStatus.PASS, "My Test Case passed");
	}
	else
	{
		test.log(LogStatus.FAIL, "My Test Case Fail");
	}
}
@Test
public void failTest()
{
	test=report.startTest("My Test Case Fail");
	test.assignAuthor("Ranga");
	String expected ="gmail";
	String actual =driver.getTitle();
	if(expected.equalsIgnoreCase(actual))
	{
		test.log(LogStatus.PASS, "My Test Case passed");
	}
	else
	{
		test.log(LogStatus.FAIL, "My Test Case Failed");
	}
}
@AfterMethod
public void tearDown()
{
	report.endTest(test);
	report.flush();
	driver.close();
}
}
