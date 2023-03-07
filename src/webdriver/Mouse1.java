package webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Mouse1 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		//create object for actions class
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).perform();
		//mouse to fashions
		ac.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Fashion')]"))).perform();
		Thread.sleep(5000);
		//mouse to all link and click it
		ac.moveToElement(driver.findElement(By.linkText("All"))).click().perform();
		Thread.sleep(5000);
		//mouse to electronics
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Electronics']"))).perform();
		Thread.sleep(5000);
		//mouse to mouse link and click it
		ac.moveToElement(driver.findElement(By.linkText("Mouse"))).click().perform();
		Thread.sleep(5000);
		//mouse to baby and kids
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Baby & Kids']"))).perform();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.linkText("Puzzles"))).click().perform();
		Thread.sleep(9000);
		driver.quit();
	}
    }






