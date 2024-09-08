package guessing_number;
import java.util.Random;
import java.util.Scanner;

public class NumberGame 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Welcome to the Gussing Number Game");
		System.out.println("Remember Things : \n  1.You have maximum of 3 attempts only. \n  2.Guess any numbers between 0 to 100. \nBest of luck!!");
		System.out.print("Do you need clue ? ");
		String clue = scn.nextLine();
	    
		//Random Number Generating
		Random random = new Random();
		int randomNum = random.nextInt(100)+1;
		int count =1;
		
		while (true) 
		{
			System.out.println("Enter the guess number 1 to 100");
			int playerGuess = scn.nextInt();
			count++;
			if (count <=3) 
			{
				if(clue.equals("yes")) 
				{
					if(playerGuess== randomNum) 
					{
						System.out.println("Congratulations!! You got it Correct!!");
						System.out.println("Hurrayy!! It took you  "+ count+ "tries");
					}
					else if (playerGuess > randomNum)
					{
						System.out.println("Guess number is lower than entered number!! \n");
					}
					else if (playerGuess < randomNum)
					{
						System.out.println("Guess number is higher than entered number!! \n");
					}
				}
				else
				{
					if(playerGuess== randomNum) 
					{
						System.out.println("Congratulations!! You got it Correct!!");
					}
					else
					{
						System.out.println("Oops!! Try Again \n");
					}
				}
			}
			else 
			{
				System.out.println("OH NOO !! You are out of Attempts : ");
				System.out.println("Nice Try !! \nAnswer is : "+ randomNum);
			}
		}
	}
}
