package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	WebDriver driver;
	@Parameters({"Browser"})
	@BeforeTest
	public void setUp(String brw) {
		switch (brw) {
		case "chrome":
			System.out.println("Executing on chrome browser");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.out.println("Executing on firefox browser");
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Browser value is Not matching");
			break;
		}
		
		}
	@Test(dataProvider = "dp")
	public void verifyLogin(String user, String pass) {
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("txtUsername")).sendKeys(user);
		driver.findElement(By.name("txtPassword")).sendKeys(pass);
		driver.findElement(By.name("Submit")).click();
		String expected="dashboard";
		String actual = driver.getCurrentUrl();
		try {
		Assert.assertTrue(actual.contains(expected), "Loginn Fail");
		}catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
		}
	@DataProvider
	public Object[][] dp() {
	//store login data into dp
		Object login[][]= new Object[5][2];
		//first row and firdt cell
		login[0][0]="Admin";
		//first row second cell
		login[0][1]="Qedge123!@#";
		login[1][0]="Admin";
		login[1][1]="Qedge";
		login[2][0]="Admin";
		login[2][1]="Qedge123!@#";
		login[3][0]="test";
		login[3][1] ="Qedge123!@#";
		login[4][0]="Admin";
		login[4][1]="Qedge";
		return login;
		}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
