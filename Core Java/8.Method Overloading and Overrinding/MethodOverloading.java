// This is also called compile time polymorphism and static binding

class test{
	int a,b;
	
	calc(int x) // method with one argument
	{
		a=x;
		System.out.println("Sqaure = "+(a*a));
	}
	
	calc(int x, int y)  // method with two argument
	{
		a=x;
		b=y;
		System.out.println("Addition is :"+(a+b));
	}
}

class MethodOverloading{
	public static void main(String args[]){
		test obj=new test();
		obj.calc(10,20); // this is called static binding
		obj.calc(5);   // this is called static binding
	}
}