package webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class HandlingAlert {
public static void main(String[] args) throws Throwable{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin1");
		driver.findElement(By.name("login")).click();
		//capture alert message
		String alertmessage =driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		Thread.sleep(5000);
		//accept alert
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.quit();

	}

}
