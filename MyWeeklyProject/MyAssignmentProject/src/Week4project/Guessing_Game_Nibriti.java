
package Week4project;
import java.util.Scanner;

public class Guessing_Game_Nibriti {

	public static void main(String[] args) {
		int firstnum =1; 
		int lastnum = 20000;
		int GuessingNum = (int )(Math.random() * 20000 + 1); //Random First Guess 
		System.out.println(GuessingNum);
		Scanner intp = new Scanner(System.in);
		char ans='h';
		
		while (firstnum < lastnum)
		{
			System.out.println("Press 'c' for Correct, 'h' for Higher, and 'l' for Lower");
			ans = intp.next().charAt(0);
			if(ans != 'c')
			{
				if(ans == 'l')
				{
					firstnum = GuessingNum +1 ;
				}
				else if (ans =='h')
				{
					lastnum = GuessingNum -1 ;
				}  
				GuessingNum = (firstnum + lastnum)/2;
				System.out.println(GuessingNum);
			}
			else
				break;
		}
		
		if(ans == 'c')
			System.out.println("Congratulations!!! You chose the correct answer.");
		else
			System.out.println("Sorry, You are still far away from getting the answer right.");
	
	}

}
