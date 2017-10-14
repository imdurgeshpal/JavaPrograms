class One
{
	int x=10,y=20;
	void disp()
	{
		System.out.println("Class One Method");
		System.out.println("Value of X: "+x);
		System.out.println("Value of Y: "+y);
	}
}

class Two extends One
{
	void add()
	{
		System.out.println("Class Two Method");
		System.out.println("Addition :" +(x+y));
		
	}	
}

class Three extends One
{
	void mul()
	{
		System.out.println("Class Three Method");
		System.out.println("Multiplication : "+(x*y));
	}
}

class Hierarchical
{
	public static void main(String args[])
	{
		Two obj1=new Two();
		Three obj2=new Three();
		
		obj1.disp();
		obj1.add();
		
		obj2.mul();
		obj2.disp();
	}
}