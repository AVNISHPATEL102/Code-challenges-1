import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class TotalExpenses {

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
		for(int i =0 ; i<t;i++)
		{
			double a = inputStream.nextInt();
			double b = inputStream.nextInt();
			if(a>1000)
			{
				System.out.println(((a*b)-(a*b*0.1)));
			}
			else
				System.out.println((a*b));
		}
		
	}

}