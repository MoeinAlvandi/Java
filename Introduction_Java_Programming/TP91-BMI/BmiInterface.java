public interface BmiInterface {
	
	public double convert_Pound_To_kilograms(double Weight_In_Pound);
	public double convert_Inch_To_Meter(double Height_In_Inch);
	
	public double calcBmi(double Weight,double Height);
	
	public String returnCaption(double BMI);
}