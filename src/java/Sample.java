package java;
public class Sample {
	//global variables
	 int a,b,c;
	 double x,y,z;
	public  void addition()
	{
		a=7654;
		b=98;
		c=a+b;
		System.out.println(c);
	}
	public  void multiplication()
	{
		a=54656;
		b=86;
		c=a*b;
		System.out.println(c);
	}
	public void division()
	{
		x=6786786;
		y=98;
		z=x/y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		//calling non static methods with refrenece object
		Sample x = new Sample();
		x.addition();
		x.division();
		x.multiplication();
			}
        }
