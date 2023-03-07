package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		//driver.get("https://yahoo.com");
		String expected ="google";
		String actual = driver.getTitle();
		//verify expected title with actual title
		if(expected.equalsIgnoreCase(actual))
		{
			System.out.println("Title is Matching::"+expected+"      "+actual);
		}
		else
		{
			System.out.println("Title is Not Matching::"+expected+"      "+actual);
		}
		driver.close();

	}
}
