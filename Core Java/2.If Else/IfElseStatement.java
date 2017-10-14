import java.util.*;

class IfElseStatement{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int sal,b;
		System.out.print("Enter the Salary");
		sal=sc.nextInt();
		if(sal>=10000)
		{
			b=(sal*10)/100;
			sal=sal+b;
			
		}
		else
		{
			b=(sal*5)/100;
			sal=sal+b;
			
		}
		System.out.println("Total Salary with "+b+" rs bonus is:"+sal);
	}		
}