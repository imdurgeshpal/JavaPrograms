class Super
{
	int x=10;
	
	void disp()	// method overridden
	{
		System.out.println("Super Class :"+x);
	}
}

class Sub extends Super
{
	int y=20;
	
	void disp()		// method overriding
	{
		System.out.println("Super :"+x);
		System.out.println("Subclass :"+y);
	}
}
class MethodOverriding
{
	public static void main(String args[])
	{
		Sub obj = new Sub();
		obj.disp();
	}
}