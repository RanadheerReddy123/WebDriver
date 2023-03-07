package webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class UsingWebelement {
public static void main(String[] args) throws Throwable {
		//create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		//store username textbox into webelement
		WebElement user =driver.findElement(By.name("txtUsername"));
		user.clear();
		user.sendKeys("Admin");
		//store password textbox into webelement
		WebElement pass =driver.findElement(By.name("txtPassword"));
		pass.clear();
		pass.sendKeys("Qedge123!@#");
		//click on lgin
		driver.findElement(By.name("Submit")).submit();
		Thread.sleep(5000);
		driver.close();
	}
    }
