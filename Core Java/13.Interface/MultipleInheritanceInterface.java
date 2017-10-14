interface A		// this is interface
{
	int roll=101;		// public static final int roll=101; (by default)
	void dispa();		// by default abstract method..  public abstract void dispa();
}
interface B		// this is interface 
{
	void dispb(); 		// abstract method
}
class C implements A,B  // multiple inheritance: 
{
	public void dispa()		// this should be public because it was by default public in above interface. No need to write abstract
	{
		System.out.println("Roll Number: "+roll);
	}
	public void dispb()
	{
		System.out.println("Method From B interface");
	}
}
class MultipleInheritanceInterface
{
	public static void main(String args[])
	{
		C obj=new C();
		obj.dispa();
		obj.dispb();
	}
}