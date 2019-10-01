import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.util.Arrays;
public class PackagingCupcakes {

	
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
		int s[] = new int[t];
		
		for(int i=0;i<t;i++)
		{
			s[i]=inputStream.nextInt();
		}
		
		Arrays.sort(s);
		int total =0;
		System.out.println(s[0]);
		for(int i =1 ;i<t;i++ )
		{
			total+=(s[i]-s[0]);
					
		}
		System.out.println(total);
	}
}