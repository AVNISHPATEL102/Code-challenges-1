import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Mahasena {

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
		int e=0,o=0;
		for(int i =0 ; i<t;i++)
		{
			int a = inputStream.nextInt();
			if(a%2==0)
				e++;
			else
				o++;
		}
		
		System.out.println((e>o)?"Ready for battle" : "Not Ready");
		
	}

}