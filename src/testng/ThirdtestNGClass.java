package testng;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testng.AppUtil;
public class ThirdtestNGClass  extends AppUtil{
@Test
public void branches()throws Throwable
{
	driver.findElement(By.xpath("(//img)[5]")).click();
	Thread.sleep(5000);
}
@Test
public void roles()throws Throwable
{
	driver.findElement(By.xpath("(//img)[6]")).click();
	Thread.sleep(5000);
}
@Test
public void users()throws Throwable
{
	driver.findElement(By.xpath("(//img)[7]")).click();
	Thread.sleep(5000);
}
}
