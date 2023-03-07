package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(1000);
		//verify reenter mail text is diaplayed or hidden
		WebElement textbox =driver.findElement(By.name("reg_email_confirmation__"));
		boolean flag =textbox.isDisplayed();
		System.out.println(flag);
		//verify radiobutton is selected or not selected
		WebElement radio =driver.findElement(By.xpath("//input[@value='1']"));
		boolean flag1 = radio.isSelected();
		System.out.println(flag1);
		radio.click();
	}
}
