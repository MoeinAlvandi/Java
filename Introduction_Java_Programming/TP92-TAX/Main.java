import java.util.Scanner;

public class Main{
	
	public static void main(String[] a)
	{
		Scanner input = new Scanner(System.in);
		
		
		//Program banner
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		System.out.println("----------Wellcom To Calc TAX---------");
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		System.out.println("");
		
		
		//init variable
		int isexist=0;
		double EnterValue=0.0;
		int status=-1;
		double CalcTAX=0.0;
		TaxService taxService= new TaxService();
		//end init
		

			//Initial implementation of the program
			System.out.println("Please Choose One of These Options");
			
			System.out.println("------------------------------------------------------------");
			System.out.println("0-single filer");
			System.out.println("1-married jointly or qualifying widow(er)");
			System.out.println("2-married separately");
			System.out.println("3-head of household");
			status = input.nextInt();
			
			
			if(status<0 || status>3)
				{
					System.out.println("Unfortunately, this option is wrong. Please try again");
					System.out.println("");
					
					while(status<0 || status>3)
					{
				
						System.out.println("Please Choose One of These Options");
			
						System.out.println("------------------------------------------------------------");
						System.out.println("0-single filer");
						System.out.println("1-married jointly or qualifying widow(er)");
						System.out.println("2-married separately");
						System.out.println("3-head of household");
			
						status = input.nextInt();

					}
				}
			
					int Status=status;
						if(Status==0)
							{
								System.out.print("You Choose "+"0-single filer");
							}else if(Status==1){
								System.out.print("You Choose "+"1-married jointly or qualifying widow(er)");
							}else if(Status==2){
								System.out.print("You Choose "+"2-married separately");
							}else if(Status==3){
								System.out.print("You Choose "+"3-head of household");
							}else{
								System.out.print("System Error");
							}
			
				
				System.out.println("");
				System.out.println("");
				
				System.out.print("Please Enter the taxable income: ");
				EnterValue = input.nextDouble();
		
				System.out.println("");
				System.out.println("");
		
	
		
				CalcTAX=taxService.calcTAX(status,EnterValue);
		
				System.out.println("");
				
				System.out.println("Tax is "+ CalcTAX);
				
				
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
				
					System.out.println("Please Choose One of These Options");
			
			System.out.println("------------------------------------------------------------");
			System.out.println("0-single filer");
			System.out.println("1-married jointly or qualifying widow(er)");
			System.out.println("2-married separately");
			System.out.println("3-head of household");
			status = input.nextInt();
			
			
			if(status<0 || status>3)
				{
					System.out.println("Unfortunately, this option is wrong. Please try again");
					System.out.println("");
					
					while(status<0 || status>3)
					{
				
						System.out.println("Please Choose One of These Options");
			
						System.out.println("------------------------------------------------------------");
						System.out.println("0-single filer");
						System.out.println("1-married jointly or qualifying widow(er)");
						System.out.println("2-married separately");
						System.out.println("3-head of household");
			
						status = input.nextInt();

					}
				}
			
					Status=status;
						if(Status==0)
							{
								System.out.print("You Choose "+"0-single filer");
							}else if(Status==1){
								System.out.print("You Choose "+"1-married jointly or qualifying widow(er)");
							}else if(Status==2){
								System.out.print("You Choose "+"2-married separately");
							}else if(Status==3){
								System.out.print("You Choose "+"3-head of household");
							}else{
								System.out.print("System Error");
							}
			
				
				System.out.println("");
				System.out.println("");
				
				System.out.print("Please Enter the taxable income: ");
				EnterValue = input.nextDouble();
		
				System.out.println("");
				System.out.println("");
		
	
		
				CalcTAX=taxService.calcTAX(status,EnterValue);
		
				System.out.println("");
				
				System.out.println("Tax is "+ CalcTAX);
				
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