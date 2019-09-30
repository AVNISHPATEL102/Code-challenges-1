import java.util.*;
public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the amount you want to withdraw. Amount should be between 1$ to 2000$ and in multiples of 5 ");
		
		int withdraw=0;
		while(!(withdraw > 0 && withdraw <=2000))
		 	withdraw =input.nextInt();
		System.out.println("Please enter the amount you have in your account. Amount should be between 0$ to 2000$ and in multiples of 5 ");

		int balance=2001;
		while(!(balance >= 0 && balance <=2000))
		 	balance =input.nextInt();
		
		if((withdraw%5) == 0)
		{
			if(withdraw<balance)
			{
				balance -= withdraw;
				System.out.println(balance);
			}
			else if(withdraw>balance)
			{
				System.out.println(balance);
			}
			
		}
		else
			System.out.println(balance);

	}

}
