package testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class SecondTestNGClass {
WebDriver driver;
@BeforeMethod
public void setUp() throws Throwable
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://calc.qedgetech.com/");
	Thread.sleep(5000);
	Reporter.log("Running Precondition",true);
}
@Test
public void addition() throws Throwable
{
	driver.findElement(By.name("display")).sendKeys("676767");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@id='btn'])[6]")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("display")).sendKeys("876");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
	Reporter.log("Executing Addition test",true);
	}
@Test
public void division() throws Throwable
{
	driver.findElement(By.name("display")).sendKeys("55455454");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@id='btn'])[21]")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("display")).sendKeys("56");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
	Reporter.log("Executing division test",true);
	
}
@Test
public void multiplication() throws Throwable
{
	driver.findElement(By.name("display")).sendKeys("65654");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@id='btn'])[16]")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("display")).sendKeys("78");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
	Reporter.log("Executing multiplication test",true);
	
}
@AfterMethod
public void tearDown()
{
	Reporter.log("Running Post Condition",true);
	driver.close();
	
}
}












