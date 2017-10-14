/* Abstract class is a class that is declared abstract.
	It may or may not include the abstract method.
	They can't be use to initiate the object because they are incomplete.
	It may contain only the definition of method not the declaration of abstract method.
	These classes are used to declare or share common characteristics in the sub-class
*/

/* Rule for abstraction :-

1. If there is any abstract method in a class, that class must be abstract.
2.  If you are extending any abstract class that have abstract method, you must either provide the implementation of the method or make this class abstract.
*/


abstract class X // abstract class  which can''t create object because it has abstract method and this class is extended and it define abstracted disp() method
{
	
	abstract void disp(); // abstract method . //In real scenario, implementation is provided by others i.e. unknown by end user  
	
	void display()		// normal method
	{
		System.out.println("Method from abstracted class X");
	}
}

class Y extends X
{
	void disp()
	{
		System.out.println("Abstracted disp() method is defined in extended class Y");
	}
}

class Abstraction
{
	public static void main(String args[])
	{
		X obj= new Y();  	// we can't create an object of abstracted class
		//  Y obj =new Y();       // we can create an object like this also
		obj.disp();
		obj.display();
	}
}


