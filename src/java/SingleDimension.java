package java;

public class SingleDimension {

	public static void main(String[] args) throws Throwable {
		// store weekdays into array
		String x []= {"Mon","tue","wed","thu","fri","sat","sun"};
		System.out.println(x[6]);
		System.out.println(x.length);
		for (String each : x) {
			Thread.sleep(2000);
			System.out.println(each);
			
		}

	}

}
