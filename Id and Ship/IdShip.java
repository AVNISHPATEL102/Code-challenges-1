import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class IdShip {

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
		char a;
		for(int i =0 ; i<t;i++)
		{
			a = inputStream.next().charAt(0);
			System.out.println( ( (a=='B' || a== 'b') ? "BattleShip":(a=='C' || a== 'c') ? "Cruiser":(a=='D' || a== 'd') ? "Destroyer"
					:(a=='F' || a== 'f') ? "Frigate": "No such id for a ship"));

		}
		
		
		
	}

}