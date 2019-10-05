import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class SquaresTriangles {
	
	 public static  int numberOfSquares(int base) 
	   { 
	      // removing the extra part  
	      // we would always need 
	      base = (base - 2); 
	   
	      // Since each square has  
	      // base of length of 2 
	      base = base / 2; 
	   
	      return base * (base + 1)/2; 
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
		for(int i =0 ; i<t;i++) 
		{
			int x = inputStream.nextInt();
			System.out.println(numberOfSquares(x));

		}
		
		
		
		
	}

}