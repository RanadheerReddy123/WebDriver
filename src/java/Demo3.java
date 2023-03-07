package java;

import java.util.ArrayList;
import java.util.Iterator;

 class Demo3 {

	public static void main(String[] args) throws Throwable {
		// store company list into array list
				ArrayList<String> company = new ArrayList<String>();
				company.add("Google");
				company.add("HCL");
				company.add("TCS");
				company.add("IBM");
				company.add("INFOSYS");
				company.add("WIPRO");
				company.add("Amazon");
				System.out.println(company.size());
				Iterator<String> x=company.iterator();
				while (x.hasNext()) {
					Thread.sleep(4000);
					System.out.println(x.next());
					
				}

	}

}
