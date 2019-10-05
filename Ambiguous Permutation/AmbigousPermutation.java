import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class AmbigousPermutation {

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
		while(true) {
		int t = inputStream.nextInt();
		if(t==0)System.exit(0);
		int [] arr = new int[t];
		for(int i =0 ; i<t;i++)
		{
			arr[i] = inputStream.nextInt();
			
		}
		int [] brr = new int[t];
		for(int i =0 ; i<t;i++)
		{
			brr[arr[i]-1] = i+1;
			
		}
		
		boolean check = true;
		
		for(int i =0 ; i<t;i++)
		{
			if(arr[i] != brr[i])
			{
				check =false;
			}
			
		}
			System.out.println(check ? "Ambigous" : "Not Ambigous");
		
		
		}
		
	}

}