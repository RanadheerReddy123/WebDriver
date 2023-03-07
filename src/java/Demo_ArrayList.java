package java;

import java.util.ArrayList;

public class Demo_ArrayList {

	public static void main(String[] args) throws Throwable{
		// store company list into array list
		ArrayList<Object> company = new ArrayList<Object>();
		company.add("Google");
		company.add("HCL");
		company.add("TCS");
		company.add("IBM");
		company.add("INFOSYS");
		company.add("WIPRO");
		company.add("Amazon");
		System.out.println(company.size());
		System.out.println(company.get(4));
		for(int i=0;i<company.size();i++)
		{
			Thread.sleep(2000);
			System.out.println(company.get(i));
		}
		

	}

}
