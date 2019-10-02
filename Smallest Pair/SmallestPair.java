import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class SmallestPair {

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
		
		for(int j=0;j<t;j++) {
			int a = inputStream.nextInt();
			int h[] = new int[a];
			for(int i = 0 ; i<a;i++)
			{
				h[i] = inputStream.nextInt();
			}
			Arrays.sort(h);
			
			System.out.println(h[0]+h[1]);
		}
		
	}
		

}