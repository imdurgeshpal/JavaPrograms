class A
{
	int no;
	void message()
	{
		System.out.println("No in Super Class : "+no);
	}
}
class B extends A
{
	int no;				// this variable the super class value
	B(int a,int b)
	{
		super.no=a;
		no=b;
	}
	
	void message()
	{
		System.out.println("No in Sub Class : "+no);
	}
	void disp()
	{
		super.message();
		message();
	}
}
class Super
{
	public static void main(String args[])
	{
		B obj=new B(20,30);
		obj.disp();
	}
}