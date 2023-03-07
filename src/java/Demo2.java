package java;
import java.util.Scanner;
public class Demo2 {
public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
			System.out.println("Enter Your Course");
			String course =s.next();
			switch (course) {
			case "selenium":
				System.out.println("Course is Avialable::"+course);
				break;
			case "manual":
				System.out.println("Course is Avialable::"+course);
				break;
			case "qtp":
				System.out.println("Course is Avialable::"+course);
				break;
			case "datasceince":
				System.out.println("Course is Avialable::"+course);
				break;
			default:
				System.out.println("Course is Not Avialable::"+course);
				break;
			}
		}
	}
}
