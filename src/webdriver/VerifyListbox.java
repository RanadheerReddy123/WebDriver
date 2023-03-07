package webdriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class VerifyListbox {
public static void main(String[] args) throws Throwable {
	String expecteditem="books";
	//String expecteditem="hyderabad";
	boolean flag =false;
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.amazon.in/");
	Thread.sleep(5000);
	//store list box into select class
	Select element = new Select(driver.findElement(By.id("searchDropdownBox")));
	List<WebElement> allitems =element.getOptions();
	for (WebElement each : allitems) {
		String actualitems =each.getText();
		Thread.sleep(1000);
		System.out.println(actualitems);
		if(actualitems.equalsIgnoreCase(expecteditem))
		{
			flag=true;
			break;
		}
		}
	if(flag)
	{
		System.out.println("Item Found in Listbox:::"+expecteditem);
	}
	else
	{
		System.out.println("Item Not Found in Listbox:::"+expecteditem);
	}
	driver.close();
}
}




