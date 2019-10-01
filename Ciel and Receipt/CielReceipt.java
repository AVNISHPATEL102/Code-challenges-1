import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

// If we see every price is the exponential of 2 means 2^x where  0 <= x <= 11

public class CielReceipt {
	
	public static int menus(int s)
	{
		int r = 0;
		int k;
		int p;
		for(int i=11;i>=0;i--)
		{
			k=s/(int)(Math.pow(2, i));
			
			if(k>0)
			{
				r+=k;
				s=s%(int)(Math.pow(2, i));
			}
		}
		return r;
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
			System.out.println(menus(s));
		}
		
		
	}
}