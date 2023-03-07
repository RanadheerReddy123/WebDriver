package java;

public class WhileStatement {

	public static void main(String[] args) throws Throwable   {
		// print even numbers from 0 to 20
		int i=0;
		while (i<=20) {
			Thread.sleep(1000);
			System.out.println(i);
			i+=2;
			
		}

	}

}
