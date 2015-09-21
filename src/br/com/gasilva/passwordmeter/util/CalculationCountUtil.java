package br.com.gasilva.passwordmeter.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalculationCountUtil {
	
	public static final String QTY_NRO_REP_CHAR = "qtyNroRepChar";
	public static final String QTY_NRO_REP_INC = "qtyNroRepInc";
	
	private static final String ALPHAS = "abcdefghijklmnopqrstuvwxyz";
	private static final String NUMERICS = "01234567890";
	private static final String SYMBOLS = ")!@#$%^&*()";
	
	private static int changeToZeroIfLessThan(int pQty){
		return pQty < 0 ? 0 : pQty;
	}
	
	/******************** Metodos Auxiliares ************************************/
	
	private static int getQtySequenialLetters(String pInputPassword){
		int qty = 0;
		
		for (int i = 0; i < 23; i++) {
			String sFwd = ALPHAS.substring(i, (i+3));
			String sRev = new StringBuilder(sFwd).reverse().toString();
			if (pInputPassword.toLowerCase().indexOf(sFwd) != -1 || pInputPassword.toLowerCase().indexOf(sRev) != -1) { 
				qty++;
			}
		}
		
		return qty;
	}
	
	private static int getQtySequenialNumbers(String pInputPassword){
		int qty = 0;
		
		for (int i = 0; i < 8; i++) {
			String sFwd = NUMERICS.substring(i, (i+3));
			String sRev = new StringBuilder(sFwd).reverse().toString();
			if (pInputPassword.toLowerCase().indexOf(sFwd) != -1 || pInputPassword.toLowerCase().indexOf(sRev) != -1) { 
				qty++;
			}
		}
		
		return qty;
	}
	
	private static int getQtySequenialSymbols(String pInputPassword){
		int qty = 0;
		
		for (int i = 0; i < 8; i++) {
			String sFwd = SYMBOLS.substring(i, (i+3));
			String sRev = new StringBuilder(sFwd).reverse().toString();
			if (pInputPassword.toLowerCase().indexOf(sFwd) != -1 || pInputPassword.toLowerCase().indexOf(sRev) != -1) { 
				qty++;
			}
		}
		
		return qty;
	}
	
	private static int sumLengthOfItensList(List<String> pLst){
		int qty = 0;
		if (pLst != null) {
			for (String str : pLst){
				qty += str.length();
			}
		}
		return changeToZeroIfLessThan(qty);
	}
	
	private static int sumLengthOfItensListMinusOnePerIteraction(List<String> pLst){
		int qty = 0;
		if (pLst != null) {
			for (String str : pLst){
				str = str.replaceAll("\\s", "");
				
				if (str.length() > 1){
					qty += str.length() - 1;
				}
			}
		}
		return changeToZeroIfLessThan(qty);
	}
	
	private static boolean hasElemnts(List<String> lstGenerica){
		return lstGenerica != null && lstGenerica.size() > 0 ? true : false;
	}
	
	/************************************************** Additions ****************************************/
	
	public static int countNumberOfCharacters(String pInputPassword){
		int qty = 0;
		
		if (pInputPassword != null) {
			qty += pInputPassword.length();
		}
		
		return changeToZeroIfLessThan(qty);
	}
	
	public static int countUpperOrLowerLetter(String pInputPassword, List<String> pLstOfCharacter){
		int qty = sumLengthOfItensList(pLstOfCharacter);
		
		return changeToZeroIfLessThan(qty);
	}
	
	public static int countNumbers(List<String> pLstOfNumbers){
		int qty = sumLengthOfItensList(pLstOfNumbers);
		
		return changeToZeroIfLessThan(qty);
	}
	
	public static int countSymbols(List<String> pLstOfSymbols){
		int qty = sumLengthOfItensList(pLstOfSymbols);
		
		return changeToZeroIfLessThan(qty);
	}
	
	public static int countMiddleNumbersOrSymbols(String pInputPassword, List<String> pLstOfNumbers, List<String> pLstOfSymbols){
		int qtyNumbers = sumLengthOfItensList(pLstOfNumbers);
		int qtySymbols = sumLengthOfItensList(pLstOfSymbols);
		
		int qty = (qtyNumbers + qtySymbols);
		
		if (pInputPassword != null && !pInputPassword.trim().equals("")){
			String strFirtsElement = String.valueOf(pInputPassword.trim().charAt(0));
			String strLastElement = String.valueOf(pInputPassword.trim().charAt(pInputPassword.trim().length() - 1));
			boolean isNumberOrSymbolFirstElement = 
					strFirtsElement.matches(SplitPasswordUtil.PATTERN_NUMBER) || strFirtsElement.matches(SplitPasswordUtil.PATTERN_SYMBOL);
			boolean isNumberOrSymbolLastElement = 
					strLastElement.matches(SplitPasswordUtil.PATTERN_NUMBER) || strLastElement.matches(SplitPasswordUtil.PATTERN_SYMBOL);
			
			if (isNumberOrSymbolFirstElement){
				--qty;
			}
			
			if (isNumberOrSymbolLastElement){
				--qty;
			}
		}
		
		return changeToZeroIfLessThan(qty);
	}
	
	public static int countRequiriments(String pInputPassword,
			List<String> pLstLowerCharacter, List<String> pLstUpperCharacter,
			List<String> pLstNumber, List<String> pLstSymbol) {
		
		int qty = 0;

		qty += (pInputPassword != null && pInputPassword.length() >= 8) ? 1 : 0;
		qty += hasElemnts(pLstLowerCharacter) ? 1 : 0;
		qty += hasElemnts(pLstUpperCharacter) ? 1 : 0;
		qty += hasElemnts(pLstNumber) ? 1 : 0;
		qty += hasElemnts(pLstSymbol) ? 1 : 0;

		return changeToZeroIfLessThan(qty);
	}
	
	/************************************************** Additions ****************************************/
	
	public static int countLatterOnly(String pInputPassword, List<String> pLstLowerAndUpperCharacter, List<String> pLstNumber, List<String> pLstSymbol){
		
		int qty = 0;
		
		if(!hasElemnts(pLstNumber) && !hasElemnts(pLstSymbol)){		
			qty = sumLengthOfItensList(pLstLowerAndUpperCharacter);
		}
		
		return changeToZeroIfLessThan(qty);
	}
	
	public static int countNumbersOnly(String pInputPassword, List<String> pLstLowerCharacter,
			List<String> pLstUpperCharacter, List<String> pLstNumber,
			List<String> pLstSymbol) {
		
		int qty = 0;

		if (!hasElemnts(pLstLowerCharacter) && !hasElemnts(pLstUpperCharacter)
				&& !hasElemnts(pLstSymbol)) {
			qty = sumLengthOfItensList(pLstNumber);
		}

		String strTmp = pInputPassword.replaceAll("\\s", "");
		int diff = pInputPassword.length() - strTmp.length();
		if (qty > 0 && diff > 0){
			qty += diff;
		}
		
		return changeToZeroIfLessThan(qty);
	}
	
	public static Map<String, Integer> countRepeatCharacters(String pInputPassword) {
		int qtyNroRepChar = 0;
		Double qtyNroRepIncTmp = 0.0;
		int qtyNroRepInc = 0;
		int qtyNrUnqChar = 0;
		
		pInputPassword = pInputPassword.replaceAll("\\s+", "");
		boolean bCharExists = false;
		if (pInputPassword != null){
			for(int i = 0 ; i < pInputPassword.length() ; i++){
				
				bCharExists = false;
				for(int j = 0 ; j < pInputPassword.length() ; j++){
					if (pInputPassword.charAt(i) == pInputPassword.charAt(j) && i != j && pInputPassword.charAt(j) != ' ') { 
						bCharExists = true;
						
						float diffLenBeweenIndex = Float.parseFloat(String.valueOf(pInputPassword.length())) / (j-i);
						qtyNroRepIncTmp += Math.abs(diffLenBeweenIndex);
					}
				}
				
				if (bCharExists){
					qtyNroRepChar++;
					qtyNrUnqChar = pInputPassword.length() - qtyNroRepChar;
					qtyNroRepIncTmp = Double.valueOf((qtyNrUnqChar > 0) ? Math.ceil(qtyNroRepIncTmp/qtyNrUnqChar) : Math.ceil(qtyNroRepIncTmp)); 
				}
			}
		}
		
		qtyNroRepChar = changeToZeroIfLessThan(qtyNroRepChar);
		qtyNroRepInc = changeToZeroIfLessThan(qtyNroRepIncTmp.intValue());
		
		Map<String, Integer> mapCountRepeatChars = new HashMap<String, Integer>();
		mapCountRepeatChars.put(QTY_NRO_REP_CHAR, qtyNroRepChar);
		mapCountRepeatChars.put(QTY_NRO_REP_INC, qtyNroRepInc);
		
		return mapCountRepeatChars;
	}
	
	public static int countConsecutiveUpperLetters(String pInputPassword){
		int qty = 0;
		
		List<String> pLstUpperCharacter = SplitPasswordUtil.splipUpperLatterWithSpace(pInputPassword);
				
		qty = sumLengthOfItensListMinusOnePerIteraction(pLstUpperCharacter);
		
		return changeToZeroIfLessThan(qty);
	}
	
	

	public static int countConsecutiveLowerLetters(String pInputPassword){
		int qty = 0;
		
		List<String> pLstLowerCharacter = SplitPasswordUtil.splipLowerLatterWithSpace(pInputPassword);
		
		qty = sumLengthOfItensListMinusOnePerIteraction(pLstLowerCharacter);
		
		return changeToZeroIfLessThan(qty);
	}
	
	public static int countConsecutiveNumbers(String pInputPassword){
		int qty = 0;
		
		List<String> pLstNumber = SplitPasswordUtil.splipNumberWithSpace(pInputPassword);
		
		qty = sumLengthOfItensListMinusOnePerIteraction(pLstNumber);
		
		return changeToZeroIfLessThan(qty);
	}
	
	public static int countSequentialLettersUpperAndLower(String pInputPassword){
		int qty = 0;
		
		qty += getQtySequenialLetters(pInputPassword);
		
		return changeToZeroIfLessThan(qty);
	}
	
	public static int countSequentialNumbers(String pInputPassword){
		int qty = 0;
		
		qty += getQtySequenialNumbers(pInputPassword);
		
		return changeToZeroIfLessThan(qty);
	}
	
	public static int countSequentialSymbols(String pInputPassword){
		int qty = 0;
		
		qty += getQtySequenialSymbols(pInputPassword);
		
		return changeToZeroIfLessThan(qty);
	}
}