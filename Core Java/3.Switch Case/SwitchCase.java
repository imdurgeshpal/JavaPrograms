import java.util.*;

class SwitchCase{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll Number From 1 to 5");
		int roll=sc.nextInt();
		
		switch(roll)
		{
			case 1 :{
				System.out.println("Durgesh Pal");
				break;
			}
			case 2 :{
				System.out.println("Anurag Niranjan");
				break;
			}
			case 3 :{
				System.out.println("Deepak Gangwar");
				break;
			}
			case 4 :{
				System.out.println("Hansa Saxena");
				break;
			}
			case 5 :{
				System.out.println("Alisha Rastogi");
				break;
			}
			default:{
				System.out.println("Record Not Found");
			}
		}
	}
}