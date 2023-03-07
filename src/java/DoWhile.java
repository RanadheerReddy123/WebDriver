package java;

public class DoWhile {

	public static void main(String[] args) throws Throwable {
		// print odd numbers from 1 to 20
		int i=1;
		do {
			Thread.sleep(2000);
			System.out.println(i);
			i+=2;
		} while (i<=20);

	}

}
