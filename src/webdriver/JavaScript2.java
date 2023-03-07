package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript2 {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://amazon.in'");
		Thread.sleep(4000);
		//store about us into web element
		WebElement aboutuslink= driver.findElement(By.linkText("About Us"));
		//scroll to about us link and link
		js.executeScript("document.scrollIntoView",aboutuslink);
		Thread.sleep(4000);
		aboutuslink.click();

	}

}
