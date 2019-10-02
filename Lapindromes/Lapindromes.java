import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Lapindromes {

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
		String a = inputStream.next();
		char f[]=new char[a.length()/2];
		
	
		char l[]=new char[(a.length())/2];
	
		int k = a.length()-1;
		
		for(int i = 0 ; i<a.length()/2;i++)
		{
			f[i]= a.charAt(i);
		}
		for(int i = 0 ; i<a.length()/2;i++)
		{
			
			l[i]= a.charAt(k);
			k--;
		}
		Arrays.sort(f);
		Arrays.sort(l);
		
		
		boolean compare = true;
		
		for(int i = 0 ; i<f.length;i++)
		{
			if(f[i] != l[i])
			{
				compare =false;
			}
		}
		
		System.out.println(compare ? "Yes" : "No");
	
		}
		
	}
		

}