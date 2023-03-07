package testng;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadWriteFormate {
@SuppressWarnings("deprecation")
public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("D:/Book.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Login");
		int rowcount =ws.getLastRowNum();
		System.out.println("No of rows are::"+rowcount);
		for(int i=1;i<=rowcount;i++)
		{
			String user=ws.getRow(i).getCell(0).getStringCellValue();
			String pass =ws.getRow(i).getCell(1).getStringCellValue();
			System.out.println(user+"   "+pass);
			//ws.getRow(i).createCell(2).setCellValue("Pass");
			ws.getRow(i).createCell(2).setCellValue("Fail");
			XSSFCellStyle style =wb.createCellStyle();
			XSSFFont font = wb.createFont();
			//colour text green 
			//font.setColor(IndexedColors.BRIGHT_GREEN.getIndex());
			font.setColor(IndexedColors.RED.getIndex());
			font.setBold(true);
			font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
			style.setFont(font);
			ws.getRow(i).getCell(2).setCellStyle(style);
		}
		fi.close();
		FileOutputStream fo = new FileOutputStream("D:/Results.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();

	}

}
