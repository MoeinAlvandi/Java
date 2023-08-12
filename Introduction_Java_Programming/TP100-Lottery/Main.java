import java.util.Scanner;

public class Main{
	
	public static void main(String[] a)
	{
		Scanner input = new Scanner(System.in);
		
		
		//Program banner
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		System.out.println("----------Wellcom To Lottery---------");
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		System.out.println("");
		
		
		//init variable
		int isexist=0;
		int LotteryNumber=0;
		int UserNumber=0;
		int lotteryDigit1=0;
		int lotteryDigit2=0;
		LotteryService latteryService= new LotteryService();
		//end init
		
			LotteryNumber= (int)(Math.random() * 100);
			
			//Initial implementation of the program
			System.out.println("Enter your lottery pick (two digits): ");
			
			UserNumber = input.nextInt();
			
			if(UserNumber<0 || UserNumber>99)
				{
					System.out.println("Error,Please enter a number between 0 and 99");
					System.out.println("");
					
					while(UserNumber<0 || UserNumber>99)
					{
				
						System.out.println("Enter your lottery pick (two digits): ");
			
			
						UserNumber = input.nextInt();
						
						if(UserNumber<0 || UserNumber>99)
						{
							System.out.println("Error,Please enter a number between 0 and 99");
							System.out.println("");
						}
						

					}
				}
			

				
				System.out.println("The lottery number is " + LotteryNumber);

				System.out.println("");
				System.out.println("");
				
				System.out.print(latteryService.calcLattery(LotteryNumber,UserNumber));
				
				System.out.println("");
		
		while(isexist == 0)
		{
				System.out.println("");	
			
				System.out.print("Do you Want to Play Again(Enter y To Continue)? ");
				
				String exist_char = input.next();
				
				System.out.println("");
			if(exist_char.equals("y"))
			{
				
LotteryNumber= (int)(Math.random() * 100);
			
			//Initial implementation of the program
			System.out.println("Enter your lottery pick (two digits): ");
			
			UserNumber = input.nextInt();
			
			if(UserNumber<0 || UserNumber>99)
				{
					System.out.println("Error,Please enter a number between 0 and 99");
					System.out.println("");
					
					while(UserNumber<0 || UserNumber>99)
					{
				
						System.out.println("Enter your lottery pick (two digits): ");
			
			
						UserNumber = input.nextInt();
						
						if(UserNumber<0 || UserNumber>99)
						{
							System.out.println("Error,Please enter a number between 0 and 99");
							System.out.println("");
						}
						

					}
				}
			

				
				System.out.println("The lottery number is " + LotteryNumber);

				System.out.println("");
				System.out.println("");
				
				System.out.print(latteryService.calcLattery(LotteryNumber,UserNumber));
				
				System.out.println("");
			}
			else
			{
				
				isexist++;
				
			}
			
			
		}
		
		
		
		
	
			
				
				//This part of the code is such that the program 
				//continues until the user presses the y key
			

		//Programmer's signature
		System.out.println("");
		System.out.println("---------------------------------------");
		System.out.println("     We hope you enjoyed. see you again");
		System.out.println("");
		System.out.println("              Mr.Programmer 	");
		System.out.println("---------------------------------------");

	}
	
}