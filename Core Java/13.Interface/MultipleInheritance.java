 class Student
 {
	 int m1,m2; // Two Subject Marks
	 
	 void getmarks(int x,int y)
	 {
		 m1=x;
		 m2=y;
	 }
	 void putmarks()
	 {
		 System.out.println("Subject 1 Marks :"+m1);
		 System.out.println("Subject 2 Marks :"+m2);
	 }
 }
 
 interface Sport
 {
	 int sp=6;
	 void spmarks();	// abstract method, defined in inherited class
 }
 
 class Result extends Student implements Sport
 {
	 public void spmarks()
	 {
		 System.out.println("Sport Marks : "+sp);
	 }
	 
	 void disp()
	 {
		 putmarks();
		 spmarks();
		 
		 int total=m1+m2+sp;
		 System.out.println("Total Marks : "+total);
		 
	 }
 }
 
 class MultipleInheritance
 {
	 public static void main(String args[])
	 {
			Result obj = new Result();
			obj.getmarks(80,20);
			obj.disp();
	 }
	 
 }