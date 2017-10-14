// Single Level Example

class A			// This is Super Class/ Base Class / Parent Class
{
	int x,y;
	
	void getdata(int a,int b)		// Super class method
	{
		x=a;
		y=b;
	}
	int add()						// super class method
	{
		System.out.println("Super Class Method");
		return (x+y);
	}
}

class B extends A  // This is Derived Class/Sub Class / Child Class
{
		int mul()
		{
			System.out.println("Sub Class Method");
			return (x*y);								// take (x,y) from super class
		}
}

class SingleLevel
{
	public static void main(String args[])
	{
		B obj=new B();							// object of sub class
		int add,mul;
		
		obj.getdata(10,20);						// object of sub class calls super class method
		add=obj.add();							// object of sub class calls super class method
		mul=obj.mul();
		
		System.out.println("Addition : "+add);
		System.out.println("Multiplication : "+mul);
	}
}
