class StaticP{
	static int a=0;
	
	void disp()
	{
		a++;
		System.out.println(""+a);
	}
	public static void main(String args[])
	{
		StaticP obj =new StaticP();
		obj.disp();
		
		StaticP obj1 =new StaticP();
		obj1.disp();
		
		StaticP obj2 =new StaticP();
		obj2.disp();
		
		StaticP obj3 =new StaticP();
		obj3.disp();
	}
}