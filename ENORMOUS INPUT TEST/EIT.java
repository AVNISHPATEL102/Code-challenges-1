import java.util.*;

public class EIT {
	
	public static int counting(int n,int k)
	{
		Scanner input =new Scanner(System.in);
		int r =0;
		for(int i =0 ; i<n;i++)
		{
			int h = input.nextInt();
			if(h%k == 0)
				r++;
		}
		return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int c = counting(n,k);
		System.out.println(c);
	}

}
