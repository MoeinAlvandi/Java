import java.util.*;

public class TP83{
	
	
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter Purchase Amount:   ");
		double PurchaseAmount=input.nextDouble();
		
		double tax=PurchaseAmount*0.06;
		System.out.print("Your Result Is:   "+ (int)(tax*100)/100);
			
	}
	
	
}