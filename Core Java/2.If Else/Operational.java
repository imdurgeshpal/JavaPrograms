import java.util.*;

class Operational{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c= (a>b)?a:b;
		System.out.println("Greater Value is : "+c);
	}
				
}