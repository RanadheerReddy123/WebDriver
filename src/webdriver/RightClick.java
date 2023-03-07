package webdriver;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		//right click on gmail link
		ac.moveToElement(driver.findElement(By.linkText("Gmail"))).contextClick().perform();
		Thread.sleep(5000);
		//create Object for robot class
		Robot r = new Robot();
		//press down arrow for two times
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		//store all windows into arraylist
		ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
		//switch to child window
		driver.switchTo().window(brw.get(1));
		//click on create account
		ac.moveToElement(driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/a[3]"))).click().perform();
		Thread.sleep(5000);
		driver.close();
		//switch back to parent window
		driver.switchTo().window(brw.get(0));
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.linkText("Sign in"))).click().perform();
		Thread.sleep(5000);
		driver.close();
		

	}

}
