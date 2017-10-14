import java.util.*;

class NestedIf{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,greater;
		System.out.print("Enter the Three Numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				greater=a;
			}
			else
				greater=c;
			
		}
		else
		{
			if(b>c)
			{
				greater=b;
			}
			else
			{
				greater=c;
			}
		}
		System.out.println("Greater Value is :"+greater);
		
	}		
}