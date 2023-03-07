package webdriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class MultiListbox {
	//https://money.rediff.com/mutual-funds
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/MultiListbox.html");
		Thread.sleep(5000);
		Select element = new Select(driver.findElement(By.name("multiSelection")));
		//verify list box is single or multiple selection
		boolean flag =element.isMultiple();
		System.out.println(flag);
		//select ten items in list box
		for(int i=0;i<10;i++)
		{
			Thread.sleep(2000);
			element.selectByIndex(i);
		}
		//get collection of items which are selected
		List<WebElement> selecteditems =element.getAllSelectedOptions();
		System.out.println(selecteditems.size());
		//print name of each item selected
		for (WebElement each : selecteditems) {
			System.out.println(each.getText());
		}
		//deselect items
		element.deselectByIndex(5);
		Thread.sleep(2000);
		element.deselectByIndex(0);
		Thread.sleep(2000);
		element.deselectByIndex(4);
		Thread.sleep(2000);
		element.deselectAll();
		Thread.sleep(5000);
		driver.close();
	}
}
