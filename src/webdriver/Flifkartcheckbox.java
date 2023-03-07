package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flifkartcheckbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("mobiles");
		driver.findElement(By.xpath("(//*[name()='svg'])[1]")).click();
		Thread.sleep(2000);
		List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@class='_24_Dny']"));
		System.out.println(checkboxes.size());
		for (WebElement each : checkboxes) {
			Thread.sleep(500);
			each.click();
		}

	}

}
