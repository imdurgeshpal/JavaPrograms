class Test{
	int a,b,id; // instance variable
	String name; // instance variable
	
	Test() // first default constructor is called
	{
		System.out.println("This is Default Constructor");
		a=10; 
		b=20;
	}
	void display()  // method
	{
		System.out.println("Value of A is " +a);
		System.out.println("Value of B is " +b);
		System.out.println(id+" "+name); // return Null Value
		
	}
	
}
class Dconstructor
{
	public static void main(String args[])
	{
		Test obj=new Test(); // create an object of default constructor
		obj.display();
	}
}