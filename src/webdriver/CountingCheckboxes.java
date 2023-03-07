package webdriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CountingCheckboxes {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/checkbox_1.html");
		Thread.sleep(5000);
		//get collection of checkboxes in a page
		List<WebElement> allcheckboxes =driver.findElements(By.tagName("input"));
		System.out.println("No of checkboxes are::"+allcheckboxes.size());
		Thread.sleep(5000);
		//iterate all check box
		for (WebElement each : allcheckboxes) {
			//verify which checkbox is true or false
			boolean flag =each.isSelected();
			//capture each check box name stored in value property
			String checkboxname =each.getAttribute("value");
			System.out.println(checkboxname+"\n"+flag);
			//which check is true unselecte which check box flase select
			if(flag)
			{
				each.click();
			}
			else
			{
				each.click();
				Thread.sleep(5000);
			}
		}
		driver.close();

	}
}
