package webdriver;
import java.io.*;
public class ReadData {

	public static void main(String[] args) throws Throwable {
	FileReader fr = new FileReader("D://Sample.txt");
	@SuppressWarnings("resource")
	BufferedReader br = new BufferedReader(fr);
	String str ="";
	while ((str=br.readLine())!=null) {
		{
			Thread.sleep(1000);
			System.out.println(str);
		}
		
	}
	}
}
