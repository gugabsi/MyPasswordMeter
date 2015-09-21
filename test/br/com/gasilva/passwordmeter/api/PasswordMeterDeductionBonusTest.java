package br.com.gasilva.passwordmeter.api;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PasswordMeterDeductionBonusTest {

	private PasswordMeter passwordMeter;
	
	@Before
	public void init(){
		passwordMeter = new PasswordMeter();
	}
	
	/************************************************** Letters Only **********************************/
	@Test
	public void testNroLattersOnlyEqualZeroBonusSce01(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusLettersOnly();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroLattersOnlyEqualZeroBonusSce02(){
		String pInputPassword = "  ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusLettersOnly();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroLattersOnlyEqualOneBonus(){
		String pInputPassword = "A";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusLettersOnly();
		
		assertEquals(1, qtyOcor);
	}
	
	@Test
	public void testNroLattersOnlyEqualThreeBonus(){
		String pInputPassword = " aA";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusLettersOnly();
		
		assertEquals(3, qtyOcor);
	}
	
	@Test
	public void testNroLattersOnlyEqualTwoBonus(){
		String pInputPassword = "DS";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusLettersOnly();
		
		assertEquals(2, qtyOcor);
	}
	
	@Test
	public void testNroLattersOnlyEqualFourBonus(){
		String pInputPassword = " DS ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusLettersOnly();
		
		assertEquals(4, qtyOcor);
	}
	
	/************************************************** Numbers Only **********************************/
	@Test
	public void testNroNumbersOnlyEqualZeroBonusSce01(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusNumbersOnly();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroNumbersOnlyEqualZeroBonusSce02(){
		String pInputPassword = "  ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusNumbersOnly();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroNumbersOnlyEqualOneBonus(){
		String pInputPassword = "1";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusNumbersOnly();
		
		assertEquals(1, qtyOcor);
	}
	
	@Test
	public void testNroNumbersOnlyEqualThreeBonus(){
		String pInputPassword = " 47";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusNumbersOnly();
		
		assertEquals(3, qtyOcor);
	}
	
	@Test
	public void testNroNumbersOnlyEqualTwoBonus(){
		String pInputPassword = "86";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusNumbersOnly();
		
		assertEquals(2, qtyOcor);
	}
	
	@Test
	public void testNroNumbersOnlyEqualFourBonus(){
		String pInputPassword = " 78 ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusNumbersOnly();
		
		assertEquals(4, qtyOcor);
	}
	
	
	/**************************************************  Repeat Characters (Case Insensitive) **********************************/
	@Test
	public void testNroRepCharEqualZeroBonusSec01(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusRepeatCharacters();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroRepCharEqualZeroBonusSec02(){
		String pInputPassword = "  ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusRepeatCharacters();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroRepCharEqualZeroBonusSec03(){
		String pInputPassword = "a  B 1   2";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusRepeatCharacters();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroRepCharEqualOneBonusSec01(){
		String pInputPassword = "a  B 1   2a";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusRepeatCharacters();
		
		assertEquals(1, qtyOcor);
	}
	
	@Test
	public void testNroRepCharEqualThreeBonusSec02(){
		String pInputPassword = "a  B 1   22";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusRepeatCharacters();
		
		assertEquals(3, qtyOcor);
	}
	
	@Test
	public void testNroRepCharEqualOneBonusSec03(){
		String pInputPassword = "$a  B 1   24$";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusRepeatCharacters();
		
		assertEquals(1, qtyOcor);
	}
	
	@Test
	public void testNroRepCharEqualOneBonusSec04(){
		String pInputPassword = "$a  B 1 B  24t";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusRepeatCharacters();
		
		assertEquals(1, qtyOcor);
	}
	
	@Test
	public void testNroRepCharEqualOneBonusSce01(){
		String pInputPassword = "$a  B 1 B  24t    $7e";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusRepeatCharacters();
		
		assertEquals(1, qtyOcor);
	}
		
	@Test
	public void testNroRepCharEqualOneBonusSce02(){
		String pInputPassword = "$a  B 1 B  24Bt    $7e";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusRepeatCharacters();
		
		assertEquals(1, qtyOcor);
	}
	
	@Test
	public void testNroRepCharEqualOneBonusSce03(){
		String pInputPassword = "$a  b 1 bb  24t    $7e";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusRepeatCharacters();
		
		assertEquals(1, qtyOcor);
	}
	
	@Test
	public void testNroRepCharEqualOneBonusSce04(){
		String pInputPassword = "$a  tb 1 bb  24t t   GG$7e";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusRepeatCharacters();
		
		assertEquals(1, qtyOcor);
	}
	
	
	/**************************************************  Consecutive Uppercase Letters **********************************/
	@Test
	public void testNroConsecutiveUpperEqualZeroBonus(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusConsecutiveUpperLetters();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroConsecutiveUpperEqualTwoBonus(){
		String pInputPassword = " AA";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusConsecutiveUpperLetters();
		
		assertEquals(2, qtyOcor);
	}
	
	@Test
	public void testNroConsecutiveUpperEqualFourBonusSce01(){
		String pInputPassword = " a47AHG";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusConsecutiveUpperLetters();
		
		assertEquals(4, qtyOcor);
	}
	
	@Test
	public void testNroConsecutiveUpperEqualFourBonusSce02(){
		String pInputPassword = " a47AHf5%8DS";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusConsecutiveUpperLetters();
		
		assertEquals(4, qtyOcor);
	}
	
	@Test
	public void testNroConsecutiveUpperEqualSixBonus(){
		String pInputPassword = " a47AHT5%8DS ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusConsecutiveUpperLetters();
		
		assertEquals(6, qtyOcor);
	}
	
	/**************************************************  Consecutive Lowercase Letters **********************************/
	@Test
	public void testNroConsecutiveLowerEqualZeroBonus(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusConsecutiveLowerLetters();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroConsecutiveLowerEqualTwoBonus(){
		String pInputPassword = " hg ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusConsecutiveLowerLetters();
		
		assertEquals(2, qtyOcor);
	}
	
	@Test
	public void testNroConsecutiveLowerEqualFourBonusSce01(){
		String pInputPassword = " a47fsr";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusConsecutiveLowerLetters();
		
		assertEquals(4, qtyOcor);
	}
	
	@Test
	public void testNroConsecutiveLowerEqualFourBonusSce02(){
		String pInputPassword = " a47rf5%8gs5";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusConsecutiveLowerLetters();
		
		assertEquals(4, qtyOcor);
	}
	
	@Test
	public void testNroConsecutiveLowerEqualSixBonus(){
		String pInputPassword = " a47gsr5%8Dig ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusConsecutiveLowerLetters();
		
		assertEquals(6, qtyOcor);
	}
	
	/************************************************** Consecutive Numbers **********************************/
	@Test
	public void testNroConsecutiveNumberEqualZeroBonus(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusConsecutiveNumbers();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroConsecutiveNumberEqualTwoBonus(){
		String pInputPassword = " 57 ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusConsecutiveNumbers();
		
		assertEquals(2, qtyOcor);
	}
	
	@Test
	public void testNroConsecutiveNumberEqualFourBonusSce01(){
		String pInputPassword = " a47fsr58ea$$";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusConsecutiveNumbers();
		
		assertEquals(4, qtyOcor);
	}
	
	@Test
	public void testNroConsecutiveNumberEqualFourBonusSce02(){
		String pInputPassword = " a47rf5%85gs5";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusConsecutiveNumbers();
		
		assertEquals(4, qtyOcor);
	}
	
	@Test
	public void testNroConsecutiveNumberEqualSixBonus(){
		String pInputPassword = " a47gsr5%889Dig ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusConsecutiveNumbers();
		
		assertEquals(6, qtyOcor);
	}
	
	/************************************************** Sequential Letters (3+) **********************************/
	@Test
	public void testNroSequentialLettersEqualZeroBonusSce01(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusSequentialLetters();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroSequentialLettersEqualZeroBonusSce02(){
		String pInputPassword = " acy ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusSequentialLetters();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroSequentialLettersEqualZeroBonusSce03(){
		String pInputPassword = "%8948 485dab";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusSequentialLetters();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroSequentialLettersEqualThreeBonus(){
		String pInputPassword = " 57 aBct ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusSequentialLetters();
		
		assertEquals(3, qtyOcor);
	}
	
	@Test
	public void testNroSequentialLettersEqualSixBonusSce01(){
		String pInputPassword = " a47fsr58efGha$$";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusSequentialLetters();
		
		assertEquals(6, qtyOcor);
	}
	
	@Test
	public void testNroSequentialLettersEqualSixBonusSce02(){
		String pInputPassword = " a47RsTuf5%85gs5";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusSequentialLetters();
		
		assertEquals(6, qtyOcor);
	}
	
	@Test
	public void testNroSequentialLettersEqualSixBonusSce03(){
		String pInputPassword = " dcba47RoTuf5%85gs5";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusSequentialLetters();
		
		assertEquals(6, qtyOcor);
	}
	
	/************************************************** Numbers Letters (3+) **********************************/
	@Test
	public void testNroSequentialNumbersEqualZeroBonusSce01(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusSequentialNumbers();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroSequentialNumbersEqualZeroBonusSce02(){
		String pInputPassword = " 587 ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusSequentialNumbers();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroSequentialNumbersEqualZeroBonusSce03(){
		String pInputPassword = "%8948 485dab";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusSequentialNumbers();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroSequentialNumbersEqualThreeBonus(){
		String pInputPassword = " 567 aBct ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusSequentialNumbers();
		
		assertEquals(3, qtyOcor);
	}
	
	@Test
	public void testNroSequentialNumbersEqualSixBonusSce01(){
		String pInputPassword = " a4567fsr58efGha$$";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusSequentialNumbers();
		
		assertEquals(6, qtyOcor);
	}
	
	@Test
	public void testNroSequentialNumbersEqualSixBonusSce02(){
		String pInputPassword = " a47RsTuf5678%85gs5";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusSequentialNumbers();
		
		assertEquals(6, qtyOcor);
	}
	
	/************************************************** Symbols Letters (3+) **********************************/
	@Test
	public void testNroSequentialSymbolsEqualZeroBonusSce01(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusSequentialSymbols();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroSequentialSymbolsEqualZeroBonusSce02(){
		String pInputPassword = " 587 ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusSequentialSymbols();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroSequentialSymbolsEqualZeroBonusSce03(){
		String pInputPassword = "%8948 485dab";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusSequentialSymbols();
		
		assertEquals(0, qtyOcor);
	}
	
	@Test
	public void testNroSequentialSymbolsEqualThreeBonus(){
		String pInputPassword = " 567 %^&aBct ";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusSequentialSymbols();
		
		assertEquals(3, qtyOcor);
	}
	
	@Test
	public void testNroSequentialSymbolsEqualSixBonusSce01(){
		String pInputPassword = " a4567fsr58efGha$$%^&";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusSequentialSymbols();
		
		assertEquals(6, qtyOcor);
	}
	
	@Test
	public void testNroSequentialSymbolsEqualSixBonusSce02(){
		String pInputPassword = " a47RsTuf5#@!)678%85gs5";
		passwordMeter.generateMeter(pInputPassword);
		
		int qtyOcor = passwordMeter.getDeductions().getBonusSequentialSymbols();
		
		assertEquals(6, qtyOcor);
	}
}
