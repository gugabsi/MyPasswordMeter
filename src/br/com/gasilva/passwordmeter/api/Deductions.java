package br.com.gasilva.passwordmeter.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.gasilva.passwordmeter.util.CalculationBonusUtil;
import br.com.gasilva.passwordmeter.util.CalculationCountUtil;

public class Deductions {
	
	/**
	 * Quantidade de ocorrências para cada item analisado
	 */
	private int countLettersOnly;
	private int countNumbersOnly;
	
	private int countNroRepChar;
	private int countNroRepInc;
	
	private int countConsecutiveUpperLetters;
	private int countConsecutiveLowerLetters;
	private int countConsecutiveNumbers;
	private int countSequentialLetters;
	private int countSequentialNumbers;
	private int countSequentialSymbols;
	
	
	/**
	 * Calculo realizado para cada item analisado.
	 */
	private int bonusLettersOnly;            
	private int bonusNumbersOnly;            
	private int bonusRepeatCharacters;       
	private int bonusConsecutiveUpperLetters;
	private int bonusConsecutiveLowerLetters;
	private int bonusConsecutiveNumbers;     
	private int bonusSequentialLetters;      
	private int bonusSequentialNumbers;      
	private int bonusSequentialSymbols;
	
	public Deductions(String pInputPassword,
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
		
		countLettersOnly = CalculationCountUtil.countLatterOnly(pInputPassword, lstLowerAndUpperLetter, lstNumber, lstSymbol);             
		countNumbersOnly = CalculationCountUtil.countNumbersOnly(pInputPassword, lstLowerLetter, lstUpperLetter, lstNumber, lstSymbol);             
		
		Map<String, Integer> mapCountRepeatCharacters = CalculationCountUtil.countRepeatCharacters(pInputPassword);        
		countNroRepChar = mapCountRepeatCharacters.get(CalculationCountUtil.QTY_NRO_REP_CHAR);
		countNroRepInc = mapCountRepeatCharacters.get(CalculationCountUtil.QTY_NRO_REP_INC);		
		
		countConsecutiveUpperLetters = CalculationCountUtil.countConsecutiveUpperLetters(pInputPassword); 
		countConsecutiveLowerLetters = CalculationCountUtil.countConsecutiveLowerLetters(pInputPassword);
		countConsecutiveNumbers = CalculationCountUtil.countConsecutiveNumbers(pInputPassword);      
		countSequentialLetters = CalculationCountUtil.countSequentialLettersUpperAndLower(pInputPassword);       
		countSequentialNumbers = CalculationCountUtil.countSequentialNumbers(pInputPassword);       
		countSequentialSymbols = CalculationCountUtil.countSequentialSymbols(pInputPassword);              
	}
	
	private void calculateBonus(){
		bonusLettersOnly = CalculationBonusUtil.withoutCalculation(countLettersOnly);         
		bonusNumbersOnly = CalculationBonusUtil.withoutCalculation(countNumbersOnly);            
		bonusRepeatCharacters = calcBonusRepeatCharacters();       
		bonusConsecutiveUpperLetters = CalculationBonusUtil.multiplyParameterPerTwo(countConsecutiveUpperLetters);
		bonusConsecutiveLowerLetters = CalculationBonusUtil.multiplyParameterPerTwo(countConsecutiveLowerLetters);
		bonusConsecutiveNumbers = CalculationBonusUtil.multiplyParameterPerTwo(countConsecutiveNumbers);     
		bonusSequentialLetters = CalculationBonusUtil.multiplyParameterPerThree(countSequentialLetters);      
		bonusSequentialNumbers = CalculationBonusUtil.multiplyParameterPerThree(countSequentialNumbers);      
		bonusSequentialSymbols = CalculationBonusUtil.multiplyParameterPerThree(countSequentialSymbols);             
	}
	
	private int calcBonusRepeatCharacters(){
		int bonusRepChar = 0;
		if (countNroRepChar > 0) {
			bonusRepChar = countNroRepInc;
		}
		
		return bonusRepChar;
	}
	
	public int sumAllBonus(){
		int sum = bonusLettersOnly + bonusNumbersOnly
				+ bonusRepeatCharacters + bonusConsecutiveUpperLetters
				+ bonusConsecutiveLowerLetters + bonusConsecutiveNumbers
				+ bonusSequentialLetters + bonusSequentialNumbers 
				+ bonusSequentialSymbols;

		return sum;
	}
	
	public int getCountLettersOnly() {
		return countLettersOnly;
	}

	public int getCountNumbersOnly() {
		return countNumbersOnly;
	}

	public int getCountNroRepChar() {
		return countNroRepChar;
	}

	public int getCountNroRepInc() {
		return countNroRepInc;
	}

	public int getCountConsecutiveUpperLetters() {
		return countConsecutiveUpperLetters;
	}

	public int getCountConsecutiveLowerLetters() {
		return countConsecutiveLowerLetters;
	}

	public int getCountConsecutiveNumbers() {
		return countConsecutiveNumbers;
	}

	public int getCountSequentialLetters() {
		return countSequentialLetters;
	}

	public int getCountSequentialNumbers() {
		return countSequentialNumbers;
	}

	public int getCountSequentialSymbols() {
		return countSequentialSymbols;
	}

	public int getBonusLettersOnly() {
		return bonusLettersOnly;
	}

	public int getBonusNumbersOnly() {
		return bonusNumbersOnly;
	}

	public int getBonusRepeatCharacters() {
		return bonusRepeatCharacters;
	}

	public int getBonusConsecutiveUpperLetters() {
		return bonusConsecutiveUpperLetters;
	}

	public int getBonusConsecutiveLowerLetters() {
		return bonusConsecutiveLowerLetters;
	}

	public int getBonusConsecutiveNumbers() {
		return bonusConsecutiveNumbers;
	}

	public int getBonusSequentialLetters() {
		return bonusSequentialLetters;
	}

	public int getBonusSequentialNumbers() {
		return bonusSequentialNumbers;
	}

	public int getBonusSequentialSymbols() {
		return bonusSequentialSymbols;
	}   	
}
