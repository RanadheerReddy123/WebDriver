package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo3 {
	WebDriver driver;
	@Test
	public void verifyTitle()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		String expected="Google";
		String actual =driver.getTitle();
		try {
		Assert.assertFalse(expected.equalsIgnoreCase(actual), "Title is matching");
		}catch(Throwable t)
		{
		System.out.println(t.getMessage());	
		}
		driver.close();
	}
}
