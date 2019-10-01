import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Primality {

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
		boolean prime=true;
		for(int i =0 ; i<t;i++)
		{
			prime=true;
			int a = inputStream.nextInt();
				
			for(int divisor = 2; divisor <= a / 2; divisor++) {
			    if (a % divisor == 0) {
			        prime = false;
			        break; // num is not a prime, no reason to continue checking
			    }
			}
			if(prime)
			System.out.println("It is a prime number");
			else
				System.out.println("Not a prime number");

		}
		
		
		
	}

}