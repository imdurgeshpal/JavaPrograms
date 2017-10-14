import java.io.*;
public class filewriting {

	public static void main(String[] args) {
	try
	{
		FileOutputStream f= new FileOutputStream("file.txt");
		String str="The file has been created";
		byte b[] = str.getBytes();
		f.write(b);
		f.close();
		System.out.println("Success");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

	}
}
