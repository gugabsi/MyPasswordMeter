package br.com.gasilva.passwordmeter.api;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PasswordMeterDeductionCountTest {

	private PasswordMeter passwordMeter;
	
	@Before
	public void init(){
		passwordMeter = new PasswordMeter();
	}
	
	/************************************************** Letters Only **********************************/
	@Test
	public void testNroLattersOnlyEqualZeroCountSce01(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountLettersOnly();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroLattersOnlyEqualZeroCountSce02(){
		String pInputPassword = "  ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountLettersOnly();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroLattersOnlyEqualThreeCountSce1(){
		String pInputPassword = " A ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountLettersOnly();
		
		assertEquals(3, qtyOcor);
	}
	
	@Test
	public void testNroLattersOnlyEqualSevenCount(){
		String pInputPassword = " a  A  ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountLettersOnly();
		
		assertEquals(7,  qtyOcor);
	}
	
	@Test
	public void testNroLattersOnlyEqualThreeCountSce2(){
		String pInputPassword = "D S";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountLettersOnly();
		
		assertEquals(3, qtyOcor);
	}
	
	@Test
	public void testNroLattersOnlyEqualFiveCount(){
		String pInputPassword = " D S ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountLettersOnly();
		
		assertEquals(5,  qtyOcor);
	}
	
	/************************************************** Numbers Only **********************************/
	@Test
	public void testNroNumbersOnlyEqualZeroCountSce01(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountNumbersOnly();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroNumbersOnlyEqualZeroCountSce02(){
		String pInputPassword = "  ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountNumbersOnly();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroNumbersOnlyEqualOneCount(){
		String pInputPassword = "1";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountNumbersOnly();
		
		assertEquals(1, qtyOcor);
	}
	
	@Test
	public void testNroNumbersOnlyEqualFourCount(){
		String pInputPassword = " 4 7";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountNumbersOnly();
		
		assertEquals(4, qtyOcor);
	}
	
	@Test
	public void testNroNumbersOnlyEqualThreeCount(){
		String pInputPassword = "8 6";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountNumbersOnly();
		
		assertEquals(3, qtyOcor);
	}
	
	@Test
	public void testNroNumbersOnlyEqualSixCount(){
		String pInputPassword = " 7 8 9";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountNumbersOnly();
		
		assertEquals(6, qtyOcor);
	}
	
	
	/**************************************************  Repeat Characters (Case Insensitive) **********************************/
	@Test
	public void testNroRepCharEqualZeroCountSec01(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int countNroRepChar = passwordMeter.getDeductions().getCountNroRepChar();
		int countNroRepInc = passwordMeter.getDeductions().getCountNroRepInc();
		
		assertEquals(0, countNroRepChar);
		assertEquals(0, countNroRepInc);
	}
	
	@Test
	public void testNroRepCharEqualZeroCountSec02(){
		String pInputPassword = "  ";
		passwordMeter.generateMeter(pInputPassword);
		
		int countNroRepChar = passwordMeter.getDeductions().getCountNroRepChar();
		int countNroRepInc = passwordMeter.getDeductions().getCountNroRepInc();
		
		assertEquals(0, countNroRepChar);
		assertEquals(0, countNroRepInc);
	}
	
	@Test
	public void testNroRepCharEqualZeroCountSec03(){
		String pInputPassword = "a  B 1   2";
		passwordMeter.generateMeter(pInputPassword);
		
		int countNroRepChar = passwordMeter.getDeductions().getCountNroRepChar();
		int countNroRepInc = passwordMeter.getDeductions().getCountNroRepInc();
		
		assertEquals(0, countNroRepChar);
		assertEquals(0, countNroRepInc);
	}
	
	@Test
	public void testNroRepCharEqualTwoAndOndeCountSec01(){
		String pInputPassword = "a  B 1   2a";
		passwordMeter.generateMeter(pInputPassword);
		
		int countNroRepChar = passwordMeter.getDeductions().getCountNroRepChar();
		int countNroRepInc = passwordMeter.getDeductions().getCountNroRepInc();
		
		assertEquals(2, countNroRepChar);
		assertEquals(1, countNroRepInc);
	}
	
	@Test
	public void testNroRepCharEqualTwoAndThreeCountSec02(){
		String pInputPassword = "a  B 1   22";
		passwordMeter.generateMeter(pInputPassword);
		
		int countNroRepChar = passwordMeter.getDeductions().getCountNroRepChar();
		int countNroRepInc = passwordMeter.getDeductions().getCountNroRepInc();
		
		assertEquals(2, countNroRepChar);
		assertEquals(3, countNroRepInc);
	}
	
	@Test
	public void testNroRepCharEqualTwoAndOneCountSec02(){
		String pInputPassword = "$a  B 1   24$";
		passwordMeter.generateMeter(pInputPassword);
		
		int countNroRepChar = passwordMeter.getDeductions().getCountNroRepChar();
		int countNroRepInc = passwordMeter.getDeductions().getCountNroRepInc();
		
		assertEquals(2, countNroRepChar);
		assertEquals(1, countNroRepInc);
	}
	
	@Test
	public void testNroRepCharEqualTwoAndOneCountSec03(){
		String pInputPassword = "$a  B 1 B  24t";
		passwordMeter.generateMeter(pInputPassword);
		
		int countNroRepChar = passwordMeter.getDeductions().getCountNroRepChar();
		int countNroRepInc = passwordMeter.getDeductions().getCountNroRepInc();
		
		assertEquals(2, countNroRepChar);
		assertEquals(1, countNroRepInc);
	}
	
	@Test
	public void testNroRepCharEqualFourAndOneCountSce01(){
		String pInputPassword = "$a  B 1 B  24t    $7e";
		passwordMeter.generateMeter(pInputPassword);
		
		int countNroRepChar = passwordMeter.getDeductions().getCountNroRepChar();
		int countNroRepInc = passwordMeter.getDeductions().getCountNroRepInc();
		
		assertEquals(4, countNroRepChar);
		assertEquals(1, countNroRepInc);
	}
		
	@Test
	public void testNroRepCharEqualFiveAndOneCountSce01(){
		String pInputPassword = "$a  B 1 B  24Bt    $7e";
		passwordMeter.generateMeter(pInputPassword);
		
		int countNroRepChar = passwordMeter.getDeductions().getCountNroRepChar();
		int countNroRepInc = passwordMeter.getDeductions().getCountNroRepInc();
		
		assertEquals(5, countNroRepChar);
		assertEquals(1, countNroRepInc);
	}
	
	@Test
	public void testNroRepCharEqualFiveAndOneCountSce02(){
		String pInputPassword = "$a  b 1 bb  24t    $7e";
		passwordMeter.generateMeter(pInputPassword);
		
		int countNroRepChar = passwordMeter.getDeductions().getCountNroRepChar();
		int countNroRepInc = passwordMeter.getDeductions().getCountNroRepInc();
		
		assertEquals(5, countNroRepChar);
		assertEquals(1, countNroRepInc);
	}
	
	
	/**************************************************  Consecutive Uppercase Letters **********************************/
	@Test
	public void testNroConsecutiveUpperEqualZeroCount(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountConsecutiveUpperLetters();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroConsecutiveUpperEqualOneCount(){
		String pInputPassword = " AA";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountConsecutiveUpperLetters();
		
		assertEquals(1, qtyOcor);
	}
	
	@Test
	public void testNroConsecutiveUpperEqualTwoCountSce01(){
		String pInputPassword = " a47AHG";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountConsecutiveUpperLetters();
		
		assertEquals(2, qtyOcor);
	}
	
	@Test
	public void testNroConsecutiveUpperEqualTwoCountSce02(){
		String pInputPassword = " a47AHf5%8DS";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountConsecutiveUpperLetters();
		
		assertEquals(2, qtyOcor);
	}
	
	@Test
	public void testNroConsecutiveUpperEqualThreeCount(){
		String pInputPassword = " a47AHT5%8DS ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountConsecutiveUpperLetters();
		
		assertEquals(3, qtyOcor);
	}
	
	/**************************************************  Consecutive Lowercase Letters **********************************/
	@Test
	public void testNroConsecutiveLowerEqualZeroCount(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountConsecutiveLowerLetters();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroConsecutiveLowerEqualOneCount(){
		String pInputPassword = " hg ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountConsecutiveLowerLetters();
		
		assertEquals(1, qtyOcor);
	}
	
	@Test
	public void testNroConsecutiveLowerEqualTwoCountSce01(){
		String pInputPassword = " a47fsr";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountConsecutiveLowerLetters();
		
		assertEquals(2, qtyOcor);
	}
	
	@Test
	public void testNroConsecutiveLowerEqualTwoCountSce02(){
		String pInputPassword = " a47rf5%8gs5";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountConsecutiveLowerLetters();
		
		assertEquals(2, qtyOcor);
	}
	
	@Test
	public void testNroConsecutiveLowerEqualThreeCount(){
		String pInputPassword = " a47gsr5%8Dig ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountConsecutiveLowerLetters();
		
		assertEquals(3, qtyOcor);
	}
	
	@Test
	public void testNroConsecutiveLowerEqualSevenCount(){
		String pInputPassword = "aaa aa tFTG ai i ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountConsecutiveLowerLetters();
		
		assertEquals(7,  qtyOcor);
	}
	
	       
	/************************************************** Consecutive Numbers **********************************/
	@Test
	public void testNroConsecutiveNumberEqualZeroCount(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountConsecutiveNumbers();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroConsecutiveNumberEqualOneCount(){
		String pInputPassword = " 57 ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountConsecutiveNumbers();
		
		assertEquals(1, qtyOcor);
	}
	
	@Test
	public void testNroConsecutiveNumberEqualTwoCountSce01(){
		String pInputPassword = " a47fsr58ea$$";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountConsecutiveNumbers();
		
		assertEquals(2, qtyOcor);
	}
	
	@Test
	public void testNroConsecutiveNumberEqualTwoSce02(){
		String pInputPassword = " a47rf5%85gs5";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountConsecutiveNumbers();
		
		assertEquals(2, qtyOcor);
	}
	
	@Test
	public void testNroConsecutiveNumberEqualThreeCount(){
		String pInputPassword = " a47gsr5%889Dig ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountConsecutiveNumbers();
		
		assertEquals(3, qtyOcor);
	}
	
	/************************************************** Sequential Letters (3+) **********************************/
	@Test
	public void testNroSequentialLettersEqualZeroCountSce01(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountSequentialLetters();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroSequentialLettersEqualZeroCountSce02(){
		String pInputPassword = " acy ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountSequentialLetters();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroSequentialLettersEqualZeroCountSce03(){
		String pInputPassword = "%8948 485dab";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountSequentialLetters();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroSequentialLettersEqualOneCount(){
		String pInputPassword = " 57 aBct ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountSequentialLetters();
		
		assertEquals(1, qtyOcor);
	}
	
	@Test
	public void testNroSequentialLettersEqualTwoCountSce01(){
		String pInputPassword = " a47fsr58efGha$$";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountSequentialLetters();
		
		assertEquals(2, qtyOcor);
	}
	
	@Test
	public void testNroSequentialLettersEqualTwoCountSce02(){
		String pInputPassword = " a47RsTuf5%85gs5";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountSequentialLetters();
		
		assertEquals(2, qtyOcor);
	}
	
	@Test
	public void testNroSequentialLettersEqualTwoCountSce03(){
		String pInputPassword = " dcba47RoTuf5%85gs5";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountSequentialLetters();
		
		assertEquals(2, qtyOcor);
	}
	
	/************************************************** Numbers Letters (3+) **********************************/
	@Test
	public void testNroSequentialNumbersEqualZeroCountSce01(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountSequentialNumbers();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroSequentialNumbersEqualZeroCountSce02(){
		String pInputPassword = " 587 ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountSequentialNumbers();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroSequentialNumbersEqualZeroCountSce03(){
		String pInputPassword = "%8948 485dab";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountSequentialNumbers();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroSequentialNumbersEqualOneCount(){
		String pInputPassword = " 567 aBct ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountSequentialNumbers();
		
		assertEquals(1, qtyOcor);
	}
	
	@Test
	public void testNroSequentialNumbersEqualTwoCountSce01(){
		String pInputPassword = " a4567fsr58efGha$$";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountSequentialNumbers();
		
		assertEquals(2, qtyOcor);
	}
	
	@Test
	public void testNroSequentialNumbersEqualTwoCountSce02(){
		String pInputPassword = " a47RsTuf5678%85gs5";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountSequentialNumbers();
		
		assertEquals(2, qtyOcor);
	}
	
	/************************************************** Symbols Letters (3+) **********************************/
	@Test
	public void testNroSequentialSymbolsEqualZeroCountSce01(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountSequentialSymbols();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroSequentialSymbolsEqualZeroCountSce02(){
		String pInputPassword = " 587 ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountSequentialSymbols();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroSequentialSymbolsEqualZeroCountSce03(){
		String pInputPassword = "%8948 485dab";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountSequentialSymbols();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroSequentialSymbolsEqualOneCount(){
		String pInputPassword = " 567 %^&aBct ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountSequentialSymbols();
		
		assertEquals(1, qtyOcor);
	}
	
	@Test
	public void testNroSequentialSymbolsEqualTwoCountSce01(){
		String pInputPassword = " a4567fsr58efGha$$%^&";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountSequentialSymbols();
		
		assertEquals(2, qtyOcor);
	}
	
	@Test
	public void testNroSequentialSymbolsEqualTwoCountSce02(){
		String pInputPassword = " a47RsTuf5#@!)678%85gs5";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getCountSequentialSymbols();
		
		assertEquals(2, qtyOcor);
	}
}
