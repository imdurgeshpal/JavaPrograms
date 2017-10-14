// Multi Level Inheritance

class Student			// Super Class
{
	int roll;
	
	void getroll(int x)
	{
		roll=x;
	}
	void putroll()
	{
		System.out.println("Roll Number : "+roll);
	}
}

class Test extends Student
{
	int m1,m2;
	
	void getmark(int x,int y)
	{
		m1=x;
		m2=y;
	}
	void putmark()
	{
		System.out.println("Test1 Marks :" +m1);
		System.out.println("Test2 Marks :" +m2);
	}
}

class Result extends Test
{
	int total;
	void disp()
	{
		putroll();
		putmark();
		total=m1+m2;
		System.out.println("Total Marks : "+total);
	}
}

class MultiLevel
{
	public static void main(String args[])
	{
		Result obj = new Result();
		obj.getroll(101);
		obj.getmark(80,90);
		obj.disp();
	}
}