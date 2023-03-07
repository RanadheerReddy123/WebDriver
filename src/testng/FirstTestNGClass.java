package testng;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
public class FirstTestNGClass {
	WebDriver driver;
	@BeforeTest
	public void setUp() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(2000);
		Reporter.log("Running Precondition",true);
	}
	@Test
	public void cBanking() throws Throwable {
		driver.findElement(By.xpath("(//img)[5]")).click();
		Thread.sleep(4000);
		Reporter.log("Executing cbanking test",true);
	}
	@Test
	public void iBanking() throws Throwable{
		driver.findElement(By.xpath("(//img)[6]")).click();
		Thread.sleep(4000);
		Reporter.log("Executing ibanking test",true);
	}
	@Test
	public void pBanking()throws Throwable {
		driver.findElement(By.xpath("(//img)[4]")).click();
		Thread.sleep(4000);
		Reporter.log("Executing pbanking test",true);
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		Reporter.log("Running postCondition",true);
	}

}
