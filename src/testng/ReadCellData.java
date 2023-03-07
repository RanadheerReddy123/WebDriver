package testng;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadCellData {
	public static void main(String[] args) throws Throwable{
		// read path of excel file
		FileInputStream fi = new FileInputStream("D:/Book.xlsx");
		//get wb from file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//get sheet from wb
		XSSFSheet ws =wb.getSheetAt(0);
		//get third roww from sheet
		XSSFRow row =ws.getRow(10);
		//get first cell 
		XSSFCell c1= row.getCell(0);
		//get second cell
		XSSFCell c2 =row.getCell(1);
		//print c1 and c2 cell data
		String user =c1.getStringCellValue();
		String pass =c2.getStringCellValue();
		System.out.println(user+"     "+pass);
		fi.close();
		wb.close();
			}

}
