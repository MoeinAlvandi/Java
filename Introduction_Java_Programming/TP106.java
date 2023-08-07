import java.util.*;

public class TP106{
	
	
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter Radius :   ");
		double Radius=input.nextDouble();
		double Pi=3.14;
		if(Radius>=0)
		{
			double area=Radius*Radius*Pi;
			System.out.print("Result Is : " + area);
		}
		else
		{
			System.out.print("Negative Input");
		}
		

			
	}
	
	
}