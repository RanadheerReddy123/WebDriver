package java;

public class SingleDimension2 {

	public static void main(String[] args) {
		Object x[]= new Object[5];
		x[0]=100;
		x[1]="Hello";
		x[2]=987.98;
		x[3]='j';
		x[4]=true;
		for (Object each : x) {
			System.out.println(each);
			
		}

	}

}
