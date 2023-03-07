package webdriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginJavaScript {
public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.location='http://orangehrm.qedgetech.com/'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#txtUsername\").value='Admin4'");
		Thread.sleep(4000);
		js.executeScript("document.querySelector(\"#txtPassword\").value='Qedge123!@#'");
		Thread.sleep(4000);
		js.executeScript("document.querySelector(\"#btnLogin\").click()");
		Thread.sleep(4000);
		String expected ="dashboard";
		String actual=js.executeScript("return document.URL").toString();
		if(actual.contains(expected))
		{
			System.out.println("Login success::"+expected+"   "+actual);
		}
		else
		{
		//capture error message
			String errormessage =js.executeScript("return document.querySelector(\"#spanMessage\").innerHTML").toString();
			System.out.println(errormessage+"    "+expected+"     "+actual);
		}
		Thread.sleep(5000);
		driver.close();
		}

}
