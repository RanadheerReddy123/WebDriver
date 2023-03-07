package testng;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class ValidateCalculation {
WebDriver driver;
XSSFWorkbook wb;
@BeforeTest
public void setUp()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}
@SuppressWarnings("deprecation")
@Test
public void validatepercentage() throws Throwable
{
	FileInputStream fi= new FileInputStream("D:/cal.xlsx");
	wb =new XSSFWorkbook(fi);
	XSSFSheet ws = wb.getSheet("Calculation");
	int rowcount =ws.getLastRowNum();
	Reporter.log("No of rows are::"+rowcount,true);
	for(int i=1;i<=rowcount;i++)
	{
	driver.get("https://www.calculator.net/percent-calculator.html");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(wb.getSheet("Calculation").getRow(i).getCell(0).getCellType()==Cell.CELL_TYPE_NUMERIC)
	{
		int celldata1 =(int)wb.getSheet("Calculation").getRow(i).getCell(0).getNumericCellValue();
		String percentage =String.valueOf(celldata1);
		if(wb.getSheet("Calculation").getRow(i).getCell(1).getCellType()==Cell.CELL_TYPE_NUMERIC)
		{
			int celldata2 =(int)wb.getSheet("Calculation").getRow(i).getCell(1).getNumericCellValue();
			String amount =String.valueOf(celldata2);
			driver.findElement(By.name("cpar1")).sendKeys(percentage);
			driver.findElement(By.name("cpar2")).sendKeys(amount);
			driver.findElement(By.xpath("(//input[@value='Calculate'])[1]")).click();
			//capture results
			String results = driver.findElement(By.xpath("//p[@class='verybigtext']")).getText();
			//write results into results cell
			ws.getRow(i).createCell(2).setCellValue(results);
			Reporter.log(percentage+"      "+amount+"        "+results,true);
		}
	}
	}
	fi.close();
	FileOutputStream fo = new FileOutputStream("D:/CalculationResults.xlsx");
	wb.write(fo);
	fo.close();
	wb.close();
}
@AfterTest
public void tearDown()
{
	driver.close();
}
}













