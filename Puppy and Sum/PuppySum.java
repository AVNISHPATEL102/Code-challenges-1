import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class PuppySum {
	
	public static int addition(int s)
	{
		int r=0;
		for(int i = 1 ; i <= s;i++ )
			r+=i;
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
		int sum =0;
		int c;
		for(int i =0 ; i<t;i++)
		{
			int a = inputStream.nextInt();
			int b  = inputStream.nextInt();
			for(int j =1 ; j<=a;j++)
			{
				sum=addition(b);
				b=sum;
				
				
			}
			System.out.println(sum);
		}
		
			
			
			
			
			
			
		
			
		
	}

}