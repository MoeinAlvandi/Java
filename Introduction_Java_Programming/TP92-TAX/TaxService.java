public class TaxService implements TaxInterface{
	

	public double calcTAX(int Status,double EnterValue){
		
		double result=-1;
		
		if(Status==0)
		{
			if(EnterValue<=8350){
				result=EnterValue*0.10;
				return result;
			}else if(EnterValue<=33950){
				result = 8350 * 0.10 + (EnterValue - 8350) * 0.15;
				return result;
			}else if(EnterValue<=82250){
				result = 8350*0.10+(33950-8350)*0.15+(EnterValue-33950)*0.25;
				return result;
			}else if(EnterValue<=171550){
				result = 8350*0.10+(33950-8350)*0.15+(82250-33950)*0.25+(EnterValue-82250)*0.28;
				return result;
			}else if(EnterValue<=372950){
				result = 8350*0.10+(33950-8350)*0.15+(82250-33950)*0.25+(171550-82250)*0.28+(EnterValue-171550)*0.33;
				return result;
			}else{
				result = 8350* 0.10+(33950-8350)*0.15+(82250-33950)*0.25+(171550-82250)*0.28+(372950-171550)*0.33+(EnterValue-372950)*0.35;
				return result;
			}
			
		}else if(Status==1){
			if(EnterValue<=16700){
				result=EnterValue*0.10;
				return result;
			}else if(EnterValue<=67900){
				result = 16700 * 0.10 + (EnterValue - 16700) * 0.15;
				return result;
			}else if(EnterValue<=137050){
				result = 16700*0.10+(67900-16700)*0.15+(EnterValue-67900)*0.25;
				return result;
			}else if(EnterValue<=208850){
				result = 16700*0.10+(67900-16700)*0.15+(137050-67900)*0.25+(EnterValue-137050)*0.28;
				return result;
			}else if(EnterValue<=372950){
				result = 16700*0.10+(67900-16700)*0.15+(137050-67900)*0.25+(208850-137050)*0.28+(EnterValue-208850)*0.33;
				return result;
			}else{
				result = 16700* 0.10+(67900-16700)*0.15+(137050-67900)*0.25+(208850-137050)*0.28+(372950-208850)*0.33+(EnterValue-372951)*0.35;
				return result;
			}
		}else if(Status==2){
			if(EnterValue<=8350){
				result=EnterValue*0.10;
				return result;
			}else if(EnterValue<=33950){
				result = 8350 * 0.10 + (EnterValue - 8350) * 0.15;
				return result;
			}else if(EnterValue<=68525){
				result = 8350*0.10+(33950-8350)*0.15+(EnterValue-33950)*0.25;
				return result;
			}else if(EnterValue<=104425){
				result = 8350*0.10+(33950-8350)*0.15+(68525-33950)*0.25+(EnterValue-68525)*0.28;
				return result;
			}else if(EnterValue<=186475){
				result = 8350*0.10+(33950-8350)*0.15+(68525-33950)*0.25+(104425-68525)*0.28+(EnterValue-104425)*0.33;
				return result;
			}else{
				result = 8350* 0.10+(33950-8350)*0.15+(68525-33950)*0.25+(104425-68525)*0.28+(186475-104425)*0.33+(EnterValue-186476)*0.35;
				return result;
			}
		}else if(Status==3){
			if(EnterValue<=11950){
				result=EnterValue*0.10;
				return result;
			}else if(EnterValue<=45500){
				result = 11950 * 0.10 + (EnterValue - 11950) * 0.15;
				return result;
			}else if(EnterValue<=117450){
				result = 11950*0.10+(45500-11950)*0.15+(EnterValue-45500)*0.25;
				return result;
			}else if(EnterValue<=190200){
				result = 11950*0.10+(45500-11950)*0.15+(117450-45500)*0.25+(EnterValue-117450)*0.28;
				return result;
			}else if(EnterValue<=372950){
				result = 11950*0.10+(45500-11950)*0.15+(117450-45500)*0.25+(190200-117450)*0.28+(EnterValue-190200)*0.33;
				return result;
			}else{
				result = 11950* 0.10+(45500-11950)*0.15+(117450-45500)*0.25+(190200-117450)*0.28+(372950-190200)*0.33+(EnterValue-372951)*0.35;
				return result;
			}
		}else{
			return -1;
		}
		
	}
	
	
	
}