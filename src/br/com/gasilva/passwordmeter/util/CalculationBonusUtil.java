package br.com.gasilva.passwordmeter.util;

public class CalculationBonusUtil {

	private static final int MAX_PASSWORD_LENGTH = 8; 
	
	public static int multiplyParameterPerTwo(int pCountNroOfChars, int pQt){
		int result = 0;	
		int nMinReqChars = 0;
		
		if (pCountNroOfChars >= MAX_PASSWORD_LENGTH) { 
			nMinReqChars = 3; 
		} else { 
			nMinReqChars = 4; 
		}
		
		if (pQt > nMinReqChars) {  // One or more required characters exist
			result = (pQt*2);
		}		
				
		return (result);
	}
	
	public static int multiplyParameterPerTwo(int pQt){
		int result = 0;		
		result = (pQt*2);		
		return (result);
	}
	
	public static int multiplyParameterPerThree(int pQt){
		int result = 0;
		result = (pQt*3);
		return (result);
	}
	
	public static int multiplyParameterPerFour(int pQt){
		int result = 0;
		result = (pQt*4);
		return (result);
	}
	
	public static int multiplyParameterPerSix(int pQt){
		int result = 0;
		result = (pQt*6);
		return (result);
	}
	
	public static int withoutCalculation(int pQt){
		int result = 0;
		result = pQt;
		return (result);
	}
	
	public static int differenceOfLenAndQtMultiplyPerTwo(int pQt, int pStringLength){
		int result = 0;
		if (pQt > 0){
			result = +((pStringLength-pQt)*2);
		}
		return (result);
	}
	
	public static int validateResult(int result){
		if(result > 100){
			return 100;
		}else if (result < 0){
			return 0;
		}else{
			return result;
		}
	}
}