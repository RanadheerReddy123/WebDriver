package java;

public class SingleDimension1 {

	public static void main(String[] args) {
		// store integer values into array
		int x []= new int[5];
		x[0]=100;
		x[1]=200;
		x[2]=300;
		x[3]=400;
		x[4]=500;
		System.out.println(x.length);
		for (int each : x) {
			System.out.println(each);
			
		}
		

	}

}
