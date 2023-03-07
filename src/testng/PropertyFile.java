package testng;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class PropertyFile {
WebDriver driver;
Properties p;
@BeforeTest
public void setUp()throws Throwable
{
	p= new Properties();
	//load file
	p.load(new FileInputStream("D:\\11oClockBatch\\TestNG_Framework\\Repository.properties"));
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(p.getProperty("Url"));
	Thread.sleep(5000);
}
@Test
public void validateregister()throws Throwable
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	driver.findElement(By.xpath(p.getProperty("ObjAccount"))).click();
	driver.findElement(By.xpath(p.getProperty("ObjRegister"))).click();
	driver.findElement(By.xpath(p.getProperty("ObjFname"))).sendKeys("Akhilesh");
	driver.findElement(By.xpath(p.getProperty("ObjLname"))).sendKeys("testing");
	driver.findElement(By.xpath(p.getProperty("Objemail"))).sendKeys("Akhilesh@gmail.com");
	driver.findElement(By.xpath(p.getProperty("Objpass"))).sendKeys("testing123456");
	js.executeScript("document.querySelector(\"#input-newsletter-yes\").click()");
	Thread.sleep(2000);
	js.executeScript("document.querySelector(\"input[value='1'][name='agree']\").click()");
	Thread.sleep(5000);
	js.executeScript("document.querySelector(\"button[type='submit']\").click()");
	}
@AfterTest
public void tearDown() throws Throwable
{
	Thread.sleep(5000);
	driver.close();
}
}










