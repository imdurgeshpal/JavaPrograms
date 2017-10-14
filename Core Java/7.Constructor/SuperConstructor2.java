class A
{
	int a,b;
	A(int x)
	{
		a=x;
		System.out.println("Value of A : "+a);
	}
}
class B extends A
{
	B( int x,int y)
	{
		super(x); // this should be first line in subclass which will call the super class constructor explicitily
		b=y;
		System.out.println("Value of B : "+b);
	}
	
}
class SuperConstructor2
{
	public static void main(String args[])
	{
		B obj=new B(100,200);
	}
}