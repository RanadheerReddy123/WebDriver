package webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class VerifyUrl {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get("http://gmail.com");
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		String expected ="https://";
		String actual = driver.getCurrentUrl();
		if(actual.startsWith(expected))
		{
			System.out.println("Url is secured::"+expected+"       "+actual);
		}
		else
		{
			System.out.println("Url is Not secured::"+expected+"       "+actual);
		}
		driver.quit();

	}

}
