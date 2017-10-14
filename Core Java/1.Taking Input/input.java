import java.util.*;

class input{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		
		String s=sc.nextLine();   // throws exception if we take string as input at middle because of nextLine function
		
		int a=sc.nextInt();
		
		float b=sc.nextFloat();
		
		double c=sc.nextDouble();
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(s);
		
	}
}

