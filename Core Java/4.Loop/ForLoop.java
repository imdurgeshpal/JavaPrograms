import java.util.*;
class ForLoop{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		// Program for Table
		System.out.println("Enter The Number");
		int a = sc.nextInt();
		for(int i=1;i<=10;i++)
			System.out.println(a+" X "+i+" = " +(a*i));
	}
}