public class BmiService implements BmiInterface{
	
	final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
	final double METERS_PER_INCH = 0.0254; // Constant
	
	
	public double convert_Pound_To_kilograms(double Weight_In_Pound){
		
		return Weight_In_Pound * KILOGRAMS_PER_POUND;
		
	}
	
	public double convert_Inch_To_Meter(double Height_In_Inch){
		
		return Height_In_Inch * METERS_PER_INCH;
	}
	
	public double calcBmi(double Weight,double Height){
		
		double result=Height*Height;
		if(result !=0)
		{
		result = Weight / result;	
		return result;
		}
		else
		{
			return 0;
		}
		
		
		
	}
	
	
	public String returnCaption(double BMI){
		if(BMI<18.5){
			return "Underweight";
		}
		else if(BMI>=18.5 && BMI<25.0)
		{
			return "Normal";
		}else if(BMI >= 25.0 && BMI<30.0)
		{
			return "Overweight";
		}else if(BMI>=30.0)
		{
			return "Obese";
		}
		else
		{
			return "Out OF Renge";
		}
	}
}