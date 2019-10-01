import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class factorial {

	public static long fact(int h)
	{
		long result =1;
		for(int factor=1 ; factor<=h;factor++)
		{
			result*=factor;
		}
		return result;
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
		
		for(int i =0 ; i<t;i++) {
			int h = inputStream.nextInt();
			long r = fact(h);
			System.out.println(r);
			
		}
	}

}
