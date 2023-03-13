package webdriver;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MultipleWindows {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
	//print parent window id
		String parent =  driver.getWindowHandle();
		System.out.println(parent);
		//click three links to open in new window
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		//get collection of all window id's
		Set<String> allwins = driver.getWindowHandles();
		System.out.println(allwins);
		for (String each : allwins) {
			//switch to each window when parent is not equal to child
			if(!parent.equals(each))
			{
				//switch to child window
				String pagetitle=driver.switchTo().window(each).getTitle();
				System.out.println(pagetitle);
				Thread.sleep(5000);
				driver.close();
			}
		}
		//switch back to parent window
		driver.switchTo().window(parent);
		Thread.sleep(5000);
		driver.findElement(By.id("identifierId")).sendKeys("pranga2010");
		Thread.sleep(5000);
		driver.close();
	}
}










