import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class LeadGame {

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
		int lead =0;
		boolean win = false;
		
		for(int i =0 ; i<t;i++)
		{
			int a = inputStream.nextInt();
			int b = inputStream.nextInt();
			lead = 0;
			
			if(Math.abs(a-b) > lead)
				lead = Math.abs(a-b);
			if(a>b)
				win = true;
			else 
				win = false;
		}
		if(win)
			System.out.print("1");
		else
			System.out.print("2");
		System.out.println(" " + lead);

		
	}

}