package webdriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CaptureText {
	public static void main(String[] args) throws Throwable {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(5000);
		//capture gmail text in google page'
		String visibletext =driver.findElementByLinkText("Gmail").getText();
		System.out.println(visibletext);
		//capture gmail url
		String gmailurl =driver.findElementByLinkText("Gmail").getAttribute("href");
		System.out.println(gmailurl);
		driver.close();
		

	}

}
