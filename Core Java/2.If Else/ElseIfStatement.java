import java.util.Scanner;

class ElseIfStatement{
	public static void main(String args[])
	{
		int marks;
		char grade;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the percentage.  ");
		marks=sc.nextInt();
		
		if(marks>=85)
		{
			grade='A';
		}
		else if(marks>=75)
		{
			grade='B';
		}
		else if(marks>=65)
		{
			grade='C';
		}
		else
		{
			grade='D';
		}
		System.out.println("Grade="+grade);
	}
}