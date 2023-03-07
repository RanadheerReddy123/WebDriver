package testng;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class RowCell {
	public static void main(String[] args) throws Throwable{
		//read path of excel
		FileInputStream fi = new FileInputStream("D://Book.xlsx");
		//get workbook from file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//get sheet from wb
		XSSFSheet ws =wb.getSheet("Login");
		//get first row from sheet
		XSSFRow row =ws.getRow(0);
		//count no of rows in a sheet
		int rowcount =ws.getLastRowNum();
		//count no of cells in first row
		int cellcount =row.getLastCellNum();
		System.out.println("No o f rows are::"+rowcount+"   "+"No of cells in first row::"+cellcount);
		fi.close();
		wb.close();
			}
            }
