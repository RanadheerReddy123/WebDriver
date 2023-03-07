package testng;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Celldata {
	public static void main(String[] args)throws Throwable {
		// read path of excel file
		FileInputStream fi = new FileInputStream("D:/Book.xlsx");
		//get wb from file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//get sheet from wb
		XSSFSheet ws = wb.getSheet("Login");
		//count no of rows 
		int rowcount =ws.getLastRowNum();
		System.out.println("No of rows are::"+rowcount);
		//read first cell any row data
		String user = ws.getRow(5).getCell(0).getStringCellValue();
		String pass=ws.getRow(5).getCell(1).getStringCellValue();
		System.out.println(user+"    "+pass);
		fi.close();
		wb.close();

	}

}
