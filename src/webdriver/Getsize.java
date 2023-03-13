package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getsize {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.name("txtUsername"));
		Dimension dim =username.getSize();
		System.out.println(dim.getHeight()+"     "+dim.getWidth());
		WebElement loginbtn = driver.findElement(By.name("Submit"));
		Dimension dim1 =loginbtn.getSize();
		System.out.println(dim1.getHeight()+"      "+dim1.getWidth());
		driver.close();

	}

}
