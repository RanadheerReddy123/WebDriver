package webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Login {
public static void main(String[] args)throws Throwable {
		// create instance object
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url in a browser
		driver.get("http://primusbank.qedgetech.com/");
		//suspend tool for 5 seconds
		Thread.sleep(5000);
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		//suspend tool for 5 seconds
		Thread.sleep(5000);
		driver.quit();
	}
   }
