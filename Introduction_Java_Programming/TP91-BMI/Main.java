import java.util.Scanner;

public class Main{
	
	public static void main(String[] a)
	{
		Scanner input = new Scanner(System.in);
		
		
		//Program banner
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		System.out.println("----------Wellcom To Calc BMI---------");
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		System.out.println("");
		
		
		//init variable
		int isexist=0;
		double weight=0.0;
		double height=0.0;
		double CalcBmi=0.0;
		BmiService bmiService= new BmiService();
		//end init
		

			//Initial implementation of the program
				System.out.print("Please Enter Weight(Pound) : ");
				weight = input.nextDouble();
		
				System.out.println("");
		
				System.out.print("Please Enter Height(Inch) : ");
				height = input.nextDouble();
		
				
		
				weight=bmiService.convert_Pound_To_kilograms(weight);
				height=bmiService.convert_Inch_To_Meter(height);
		
				CalcBmi=bmiService.calcBmi(weight,height);
		
				System.out.println("");
				
				System.out.println("Your BMI is "+ CalcBmi +", so you are " + bmiService.returnCaption(CalcBmi));
				
				
				//This part of the code is such that the program 
				//continues until the user presses the y key
			
		while(isexist == 0)
		{
				System.out.println("");	
			
				System.out.print("Do you want to continue(Enter y To Continue)? ");
				
				String exist_char = input.next();
				
				System.out.println("");
			if(exist_char.equals("y"))
			{
				
				isexist=0;
				System.out.print("Please Enter Weight(Pound) : ");
				weight = input.nextDouble();
				System.out.println("");
				System.out.print("Please Enter Height(Inch) : ");
				height = input.nextDouble();
		
				
		
				weight=bmiService.convert_Pound_To_kilograms(weight);
				height=bmiService.convert_Inch_To_Meter(height);
		
				CalcBmi=bmiService.calcBmi(weight,height);
		
				System.out.println("");
				System.out.println("Your BMI is "+ CalcBmi +", so you are " + bmiService.returnCaption(CalcBmi));
				System.out.println("");
			}
			else
			{
				
				isexist++;
				
			}
			
			
		}
		
		
		//Programmer's signature
		System.out.println("");
		System.out.println("---------------------------------------");
		System.out.println("     We hope you enjoyed. see you again");
		System.out.println("");
		System.out.println("              Mr.Programmer 	");
		System.out.println("---------------------------------------");

	}
	
}