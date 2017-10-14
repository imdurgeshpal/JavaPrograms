import java.io.*;
public class filereading {

	public static void main(String[] args) {
		try{
		FileInputStream f=new FileInputStream("file.txt");
		int i=0;
		while((i=f.read())!=-1)
		{
			System.out.print((char)i);
		}
		// System.out.print();
		f.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
