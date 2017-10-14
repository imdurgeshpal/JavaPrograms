class Rectangle{
	int length,width,res;
	Rectangle(int x,int y) // This is parameterized Constructor
	{
		length=x;
		width=y;
	}
	void rectArea() // instance method
	{
		res=length*width;
		System.out.println("Area of Rectangle "+res);
	}
}

class CParameterized{
	public static void main(String args[]){
		Rectangle obj=new Rectangle(20,30);
		obj.rectArea();
	}
}