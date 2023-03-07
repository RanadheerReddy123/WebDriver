package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLogin {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("pranga2010");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test23456");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(5000);
		driver.close();
		
	}

}
