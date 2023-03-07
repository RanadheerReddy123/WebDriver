package webdriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class JavaScript1 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//launch url
		js.executeScript("window.location='https://amazon.in'");
		Thread.sleep(5000);
		//print title and length of title
		String pagetitle=js.executeScript("return document.title").toString();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		//print url and length of url
		String strurl =js.executeScript("return document.URL").toString();
		System.out.println(strurl);
		System.out.println(strurl.length());
		//print domain and lenght of domain
		String domainname =js.executeScript("return document.domain").toString();
		System.out.println(domainname);
		System.out.println(domainname.length());
		driver.close();
		}
  }
