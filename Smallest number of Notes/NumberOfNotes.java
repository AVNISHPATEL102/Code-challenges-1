import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
public class NumberOfNotes {

	public static int notes(int k)
	{
		int result=0;
		if((k/100)>=1)
		{
			result+=(k/100);
			k=k%100;
		}
		if((k/50)>=1)
		{
			result+=(k/50);
			k=k%50;
		}
		if((k/10)>=1)
		{
			result+=(k/10);
			k=k%10;
		}
		if((k/5)>=1)
		{
			result+=(k/5);
			k=k%5;
		}
		if((k/2)>=1)
		{
			result+=(k/2);
			k=k%2;
		}
		if((k/1)>=1)
		{
			result+=(k/1);
			k=k%1;
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
		
		
		for(int i = 0 ; i<t;i++)
		{
		 	int k = inputStream.nextInt();
		 	System.out.println(notes(k));
		}

		
	}
}