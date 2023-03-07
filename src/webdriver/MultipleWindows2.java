package webdriver;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MultipleWindows2 {
	public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(4000);
		//click three links to open in new windows
		driver.findElement(By.xpath("(//label[contains(text(),'FLIGHTS')])[2]")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'HOTELS')])[2]")).click();
		driver.findElement(By.xpath("(//label[normalize-space()='RAIL DRISHTI'])[1]")).click();
		//get collection of all windows into array list
		ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(brw);
		//switch to window 3
		driver.switchTo().window(brw.get(3));
		Thread.sleep(4000);
		driver.findElement(By.name("ltc")).click();
		Thread.sleep(4000);
		driver.close();
		//switch to window 2 and verify title
		driver.switchTo().window(brw.get(2));
		Thread.sleep(4000);
		String expectetitle ="IRCTC Hotels";
		String actualtitle =driver.getTitle();
		if(expectetitle.equalsIgnoreCase(actualtitle))
		{
			System.out.println("Tile is Matching::"+expectetitle+"   "+actualtitle);
		}
		else
		{
			System.out.println("Tile is Not Matching::"+expectetitle+"   "+actualtitle);
		}
		Thread.sleep(4000);
		driver.close();
		}
        }




