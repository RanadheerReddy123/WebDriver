package testng;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ConvertString {
@SuppressWarnings("deprecation")
public static void main(String[] args)throws Throwable {
		//read path of excel file
				FileInputStream fi = new FileInputStream("D:/Book.xlsx");
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
					if(wb.getSheet("Login").getRow(i).getCell(1).getCellType()==Cell.CELL_TYPE_NUMERIC)
					{
						//get integer type cell and store
						int celldata =(int)wb.getSheet("Login").getRow(i).getCell(1).getNumericCellValue();
						//convert integer type into string type
						String password =String.valueOf(celldata);
					System.out.println(username+"    "+password);
					//write some text into results cell
					ws.getRow(i).createCell(2).setCellValue("pass");
				}
				}
				fi.close();
				//create new wb
				FileOutputStream fo = new FileOutputStream("D:/Results.xlsx");
				wb.write(fo);
				fo.close();
				wb.close();

			}


	}


