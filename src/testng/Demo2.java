package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 {
	WebDriver driver;
	@Test
	public void verifyTitle()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		String expected="Google";
		String actual =driver.getTitle();
		try {
		Assert.assertTrue(expected.equalsIgnoreCase(actual), "Title is Not matching");
		}catch(Throwable t)
		{
		System.out.println(t.getMessage());	
		}
		driver.close();
	}
}
