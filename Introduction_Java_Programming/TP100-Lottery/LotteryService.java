public class LotteryService implements LotteryInterface{
	

	public String calcLattery(int Lottery,int EnterValue){
		
		int LotteryDigit1=Lottery/10;

		int LotteryDigit2=Lottery%10;
		
		
		int GustDigit1=EnterValue/10;
		int GustDigit2=EnterValue%10;
		
		if(Lottery==EnterValue){
			
			return "Exact match: you win $10,000";
			
		}else if(LotteryDigit1==GustDigit2 && LotteryDigit2==GustDigit1){
			return "Match all digits: you win $3,000";
		}else if(LotteryDigit1==GustDigit1 || LotteryDigit2==GustDigit1 || LotteryDigit2==GustDigit1 || LotteryDigit2==GustDigit2){
			return "Match one digit: you win $1,000";
		}else{
		return "Sorry, no match";	
		}
			
		
		
		
		
	}
	
	
	
}