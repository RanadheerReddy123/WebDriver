package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCheckbox {

	public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	Thread.sleep(5000);
	//verify checkbox is selected or not
	WebElement checkbox = driver.findElement(By.name("remember"));
	boolean flag =checkbox.isSelected();
	System.out.println(flag);
	checkbox.click();

	}

}
