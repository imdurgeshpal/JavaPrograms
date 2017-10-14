import java.util.Scanner;

public class inputc {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt(); // for integer
            double y=sc.nextDouble();	// for double
			
			
            sc.nextLine();   // for string, two lines are used if we use nextLine
            String s=sc.nextLine();
			
			String s1=sc.next(); // for string

            System.out.println("String: "+s);
            System.out.println("String: "+s1);
            System.out.println("Double: "+y);
            System.out.println("Int: "+x);
    }
}
