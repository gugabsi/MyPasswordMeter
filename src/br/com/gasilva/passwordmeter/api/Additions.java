package br.com.gasilva.passwordmeter.api;

import java.util.ArrayList;
import java.util.List;

import br.com.gasilva.passwordmeter.util.CalculationBonusUtil;
import br.com.gasilva.passwordmeter.util.CalculationCountUtil;

public class Additions {
		
	/**
	 * Quantidade de ocorrências para cada item analisado
	 */
	private int countNroOfChars;
	private int countUppercaseLetters;
	private int countLowercaseLatters;
	private int countNumbers;
	private int countSymbols;
	private int countMiddleNumberOrSymbol;
	private int countRequirements;
	
	/**
	 * Calculo realizado para cada item analisado.
	 */
	private int bonusNroOfChars;
	private int bonusUppercaseLetters;
	private int bonusLowercaseLatters;
	private int bonusNumbers;
	private int bonusSymbols;
	private int bonusMiddleNumberOrSymbol;
	private int bonusRequirements;
		
	public Additions(String pInputPassword,
			List<String> lstUpperLetter, 
			List<String> lstLowerLetter,
			List<String> lstLowerAndUpperLetter,
			List<String> lstNumber,
			List<String> lstSymbol) {
		
		if(lstUpperLetter == null){
			lstUpperLetter = new ArrayList<String>();
		}
		
		if(lstLowerLetter == null){
			lstLowerLetter = new ArrayList<String>();
		}
		
		if(lstLowerAndUpperLetter == null){
			lstLowerAndUpperLetter = new ArrayList<String>();
		}
		
		if(lstNumber == null){
			lstNumber = new ArrayList<String>();
		}
		
		if(lstSymbol == null){
			lstSymbol = new ArrayList<String>();
		}
		
		if (pInputPassword != null) {
			this.calculateCount(pInputPassword, lstUpperLetter, lstLowerLetter, lstLowerAndUpperLetter, lstNumber, lstSymbol);
			this.calculateBonus();
		}
	}
	
	private void calculateCount(String pInputPassword,
			List<String> lstUpperLetter, 
			List<String> lstLowerLetter,
			List<String> lstLowerAndUpperLetter,
			List<String> lstNumber,
			List<String> lstSymbol){
		
		countNroOfChars = CalculationCountUtil.countNumberOfCharacters(pInputPassword);           
		countUppercaseLetters = CalculationCountUtil.countUpperOrLowerLetter(pInputPassword, lstUpperLetter);     
		countLowercaseLatters = CalculationCountUtil.countUpperOrLowerLetter(pInputPassword, lstLowerLetter);     
		countNumbers = CalculationCountUtil.countNumbers(lstNumber);              
		countSymbols = CalculationCountUtil.countSymbols(lstSymbol);              
		countMiddleNumberOrSymbol = CalculationCountUtil.countMiddleNumbersOrSymbols(pInputPassword, lstNumber, lstSymbol); 
		countRequirements = CalculationCountUtil.countRequiriments(pInputPassword, 
				lstLowerLetter, 
				lstUpperLetter, 
				lstNumber, 
				lstSymbol);         
	}
	
	private void calculateBonus(){
		bonusNroOfChars = CalculationBonusUtil.multiplyParameterPerFour(countNroOfChars);          

//		bonusUppercaseLetters = CalculationBonusUtil.differenceOfLenAndQtMultiplyPerTwo(countUppercaseLetters, countNroOfChars);    
		bonusUppercaseLetters = calcBonusUppercaseAndLowercase(countUppercaseLetters, countNroOfChars);
		
//		bonusLowercaseLatters = CalculationBonusUtil.differenceOfLenAndQtMultiplyPerTwo(countLowercaseLatters, countNroOfChars);
		bonusLowercaseLatters = calcBonusUppercaseAndLowercase(countLowercaseLatters, countNroOfChars);
		
//		bonusNumbers = CalculationBonusUtil.multiplyParameterPerFour(countNumbers);
		bonusNumbers = calcBonusNumber(countNumbers, countNroOfChars);
		
		bonusSymbols = CalculationBonusUtil.multiplyParameterPerSix(countSymbols);             
		bonusMiddleNumberOrSymbol = CalculationBonusUtil.multiplyParameterPerTwo(countMiddleNumberOrSymbol);
		bonusRequirements = CalculationBonusUtil.multiplyParameterPerTwo(countNroOfChars, countRequirements);        
	}
	
	private int calcBonusUppercaseAndLowercase(int pCounLetters, int pCountNroOfChars){
		if(pCounLetters > 0 && pCounLetters < pCountNroOfChars){
			return CalculationBonusUtil.differenceOfLenAndQtMultiplyPerTwo(pCounLetters, pCountNroOfChars);
		}
		
		return 0;
	}
	
	private int calcBonusNumber(int pCountNumbers, int pCountNroOfChars){
		if(pCountNumbers > 0 && pCountNumbers < pCountNroOfChars){
			return CalculationBonusUtil.multiplyParameterPerFour(pCountNumbers);
		}
		
		return 0;
	}
	
	public int sumAllBonus(){
		int sum = bonusNroOfChars + bonusUppercaseLetters
				+ bonusLowercaseLatters + bonusNumbers
				+ bonusSymbols + bonusMiddleNumberOrSymbol
				+ bonusRequirements;

		return sum;
	}
	
	public int getCountNroOfChars() {
		return countNroOfChars;
	}

	public int getCountUppercaseLetters() {
		return countUppercaseLetters;
	}

	public int getCountLowercaseLatters() {
		return countLowercaseLatters;
	}

	public int getCountNumbers() {
		return countNumbers;
	}

	public int getCountSymbols() {
		return countSymbols;
	}

	public int getCountMiddleNumberOrSymbol() {
		return countMiddleNumberOrSymbol;
	}

	public int getCountRequirements() {
		return countRequirements;
	}

	public int getBonusNroOfChars() {
		return bonusNroOfChars;
	}

	public int getBonusUppercaseLetters() {
		return bonusUppercaseLetters;
	}

	public int getBonusLowercaseLatters() {
		return bonusLowercaseLatters;
	}

	public int getBonusNumbers() {
		return bonusNumbers;
	}

	public int getBonusSymbols() {
		return bonusSymbols;
	}

	public int getBonusMiddleNumberOrSymbol() {
		return bonusMiddleNumberOrSymbol;
	}

	public int getBonusRequirements() {
		return bonusRequirements;
	}	
}