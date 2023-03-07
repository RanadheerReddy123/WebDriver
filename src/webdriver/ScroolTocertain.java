package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScroolTocertain {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("firstname")).sendKeys("Akhilesh");
		driver.findElement(By.name("lastname")).sendKeys("testing");
		driver.findElement(By.name("email")).sendKeys("Akhilesh@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Akhilesh678");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,900)");
		js.executeScript("document.querySelector(\"#input-newsletter-yes\").click()");
		Thread.sleep(2000);
     	js.executeScript("document.querySelector(\"input[value='1'][name='agree']\").click()");
     	Thread.sleep(2000);
		js.executeScript("document.querySelector(\"button[type='submit']\").click()");
	}
}
