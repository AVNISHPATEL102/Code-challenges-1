import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class CuttingReceipes {
	
	public static int gcd(int a,int b)
	{
		while(a!=b)
		{
			if(a>b)
				a=a-b;
			else
				b=b-a;
		}
		return a;
	}
	
	public static int findGcd(int[] a,int n)
	{
		int result = a[0];
		for (int i = 1; i < n; i++) 
            result = gcd(a[i], result); 
  
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
		for(int i =0 ; i<t;i++) 
		{
			int x = inputStream.nextInt();
			int[] arr = new int[x]; 
			for(int j =0 ; j<x;j++) 
			{
				arr[j] = inputStream.nextInt();
			}
			
			int a = findGcd(arr,arr.length);
			if(a != 1)
			{
				for(int j =0 ; j<x;j++) 
				{
					System.out.print((arr[j]/a) + " ");
				}
			}
			else 
			{
				for(int j =0 ; j<x;j++) 
				{
					System.out.print(arr[j]+" ");
				}
			}
			System.out.println();

		}
		
		System.out.println();
		
		
		
	}

}