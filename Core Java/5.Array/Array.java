// array is a collection of similar type of elements that have contiguous memory location.

import java.util.Scanner;

class Array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the Array");
		int n= sc.nextInt();
		
		int marks[]=new int[n];	// creating memory location
		
		System.out.println("Array Length : "+marks.length);
		
		System.out.println("Enter " +n+ " Elements");
		
		for(int i=0;i<marks.length;i++)			// array size is saved into length variable
		{
			marks[i]=sc.nextInt();
		}
		
		int total=0;
		System.out.println("Elements Are :");
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
			total=total+marks[i];
		}
		System.out.println("Total : "+total);
		
	}
}

/*
int roll[]={1,2,3};
int a[];
a=roll;  (Correct method to assign array values in java)
*/