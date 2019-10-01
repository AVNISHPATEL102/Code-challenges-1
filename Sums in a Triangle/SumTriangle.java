import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
public class SumTriangle {


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
		int total=0;
		int a;
		
		for(int i = 0 ; i<t;i++)
		{
			total=0;
			int k = inputStream.nextInt();
			for(int j=0;j<k;j++)
			{
				for(int u =0 ; u<=j ;u++) 
				{
					a = inputStream.nextInt();
					total+=a;
				}
			}
			
			System.out.println(total );
		}

		
	}
}