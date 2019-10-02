import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class GcdLcm {

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
			int a = inputStream.nextInt();
			int b = inputStream.nextInt();
			int numerator,denominator,remainder;
			
			
			
			if (a>b)
			 { 
			         numerator=a;
			         denominator=b;
			 }
		     else
		     {
			       numerator=b;
			       denominator=a;
		     }
			     	remainder=numerator%denominator;
			 while(remainder!=0)
			     {
			    	   numerator=denominator;
			        denominator=remainder;
			       remainder=numerator%denominator;
			     }
			     int gcd = denominator;
			     int lcm = a*b/gcd;
			     System.out.println(gcd + " " +lcm);
			     
			 }
		
			
			
			
			
			
			
		
			
		
	}

}