class A
{
	A()			// Constructor of class A
	{
		System.out.println("Constructor in class A");
	}
}

class B extends A
{
	B()
	{
		// super;    No need to write super but it implicitly call the immediate Super Class Constructor
		System.out.println("Constructor in class B");
	}
}

class SuperConstructor
{
	
	public static void main(String args[])
	{
		B obj=new B();
	}
}