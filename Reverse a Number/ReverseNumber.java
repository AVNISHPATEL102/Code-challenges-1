import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReverseNumber {
	public static int reverse(int h)
	{
		int r = 0;
		while(h>0)
		{
			int digit = h%10;
			r=r*10+digit;
			h=h/10;
		}
				return (r+h);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner inputStream = null;
		try {
			inputStream = new Scanner( new FileInputStream("/Users/mr.a/Desktop/eclipse/Codechef/src/stuff.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File stuff .txt was not found");
			System.exit(0);
		}
		
		int t = inputStream.nextInt();
		int s;
		for(int i=0;i<t;i++)
		{
			s=inputStream.nextInt();
			System.out.println((reverse(s)));
		}
		
		
	}
}