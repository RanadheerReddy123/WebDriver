package webdriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class CountingItems {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		//store list box into select class
		Select element = new Select(driver.findElement(By.id("searchDropdownBox")));
		//verify list box is single or multiple selection
		boolean flag =element.isMultiple();
		System.out.println(flag);
		//get collection of items in list box
		List<WebElement> allitems =element.getOptions();
		System.out.println("No of items are::"+allitems.size());
		Thread.sleep(5000);
		//print each item name
		for (WebElement each : allitems) {
			Thread.sleep(500);
			System.out.println(each.getText());
		}
		Thread.sleep(5000);
		driver.close();
	}
}
