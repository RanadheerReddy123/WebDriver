package java;
public class Methods {
//write void ype method
	public static void addition(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public static String verifyStrings(String str1,String str2)
	{
		String res="";
		if(str1.equals(str2))
		{
			res="Strings are Equal";
		}
		else
		{
			res="Strings are not equal";
		}
		return res;
		}
	public static boolean compareValues(int x, int y)
	{
		if(x==y)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		Methods.addition(12098, 765);
		String results =Methods.verifyStrings("india", "india");
		System.out.println(results);
	boolean flag=Methods.compareValues(900, 900);
	System.out.println(flag);

	}

}
