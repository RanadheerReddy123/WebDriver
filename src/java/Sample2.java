package java;

public class Sample2 {

	public static void main(String[] args) {
		
		String str ="Welcome to very beautiful World";
		String x [] =str.split("very");
		System.out.print(x[0]);
		System.out.println(x[1]);
		System.out.println("=======================");
		String tr ="Mon@tue@wed@thu@fri@sat@sun";
		String var []=tr.split("@");
		for (String each : var) {
			System.out.println(each);
		}
		}
		
	}


