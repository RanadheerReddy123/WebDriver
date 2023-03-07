package testng;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWrite {

	public static void main(String[] args) throws Throwable {
		//read path of excel file
		FileInputStream fi = new FileInputStream("C:/RR/POI/Book.xlsx");
		//get file form wb
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//get sheet from wb
		XSSFSheet ws = wb.getSheet("Login");
		//count no of rows
		int rowcount =ws.getLastRowNum();
		//iterate all rows
		for(int i=1;i<=rowcount;i++)
		{
			//read allrows first cell data
			String username =ws.getRow(i).getCell(0).getStringCellValue();
			//read all rows second cell data
			String password =ws.getRow(i).getCell(1).getStringCellValue();
			System.out.println(username+"    "+password);
			//write some text into results cell
			ws.getRow(i).createCell(2).setCellValue("pass");
		}
		fi.close();
		//create new wb
		FileOutputStream fo = new FileOutputStream("C:/RR/POI/Results.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();

	}

}
