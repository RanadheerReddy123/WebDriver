package webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragDrop3 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		//switch to first frmae
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement dst = driver.findElement(By.id("droppable"));
		int x =dst.getLocation().getX();
		int y = dst.getLocation().getY();
		System.out.println(x+"     "+y);
		ac.dragAndDropBy(source, x, y).perform();

	}

}
