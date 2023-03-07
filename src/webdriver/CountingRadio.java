package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingRadio {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(1000);
		//get collection of radio button
		List<WebElement> radios =driver.findElements(By.xpath("//span[@class='_5k_2 _5dba']"));
		System.out.println("No of radio buttons::"+radios.size());
		for (WebElement each : radios) {
			Thread.sleep(5000);
			System.out.println(each.getText());
		}
		driver.close();

	}

}
