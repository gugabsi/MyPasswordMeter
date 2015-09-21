package br.com.gasilva.passwordmeter.api;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PasswordMeterTest {

	PasswordMeter passwordMeter;
	
	@Before
	public void init(){
		passwordMeter = new PasswordMeter();
	}
	
	@Test
	public void testPasswordMeterTestSenario01(){
		String pInputPassword = "abCDeAdabcdEw456@j$465G~/*DhEShhdD123457&";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusNroOfChars();
		int bonusUppercaseLetters = passwordMeter.getAdditions().getBonusUppercaseLetters();
		int bonusLowercaseLatters = passwordMeter.getAdditions().getBonusLowercaseLatters();
		int bonusNumbers = passwordMeter.getAdditions().getBonusNumbers();
		int bonusSymbols = passwordMeter.getAdditions().getBonusSymbols();
		int bonusMiddleNumberOrSymbol = passwordMeter.getAdditions().getBonusMiddleNumberOrSymbol();
		int bonusRequirements = passwordMeter.getAdditions().getBonusRequirements();
		
		assertEquals(164, bonusNroOfChars);
		assertEquals(64, bonusUppercaseLetters);
		assertEquals(54, bonusLowercaseLatters);
		assertEquals(48, bonusNumbers);
		assertEquals(36, bonusSymbols);
		assertEquals(34, bonusMiddleNumberOrSymbol);
		assertEquals(10, bonusRequirements);
		
		int bonusLettersOnly = passwordMeter.getDeductions().getBonusLettersOnly();
		int bonusNumbersOnly = passwordMeter.getDeductions().getBonusNumbersOnly();
		int bonusRepeatCharacters = passwordMeter.getDeductions().getBonusRepeatCharacters();
		int bonusConsecutiveUpperLetters = passwordMeter.getDeductions().getBonusConsecutiveUpperLetters();
		int bonusConsecutiveLowerLetters = passwordMeter.getDeductions().getBonusConsecutiveLowerLetters();
		int bonusConsecutiveNumbers = passwordMeter.getDeductions().getBonusConsecutiveNumbers();
		int bonusSequentialLetters = passwordMeter.getDeductions().getBonusSequentialLetters();
		int bonusSequentialNumbers = passwordMeter.getDeductions().getBonusSequentialNumbers();
		int bonusSequentialSymbols = passwordMeter.getDeductions().getBonusSequentialSymbols();

		assertEquals(0, bonusLettersOnly);
		assertEquals(0, bonusNumbersOnly);
		assertEquals(1, bonusRepeatCharacters);
		assertEquals(4, bonusConsecutiveUpperLetters);
		assertEquals(14, bonusConsecutiveLowerLetters);
		assertEquals(18, bonusConsecutiveNumbers);
		assertEquals(9, bonusSequentialLetters);
		assertEquals(12, bonusSequentialNumbers);
		assertEquals(0, bonusSequentialSymbols);
		
		String score = passwordMeter.getScore();
		String complexity = passwordMeter.getComplexity();
		
		assertEquals("100%", score);
		assertEquals(PasswordMeter.MUITO_LONGA, complexity);
	}
	
	@Test
	public void testPasswordMeterTestSenario02(){
		String pInputPassword = "1452abcabcdabcde584fghibijklmnopabcd";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusNroOfChars();
		int bonusUppercaseLetters = passwordMeter.getAdditions().getBonusUppercaseLetters();
		int bonusLowercaseLatters = passwordMeter.getAdditions().getBonusLowercaseLatters();
		int bonusNumbers = passwordMeter.getAdditions().getBonusNumbers();
		int bonusSymbols = passwordMeter.getAdditions().getBonusSymbols();
		int bonusMiddleNumberOrSymbol = passwordMeter.getAdditions().getBonusMiddleNumberOrSymbol();
		int bonusRequirements = passwordMeter.getAdditions().getBonusRequirements();
		
		assertEquals(144, bonusNroOfChars);
		assertEquals(0, bonusUppercaseLetters);
		assertEquals(14, bonusLowercaseLatters);
		assertEquals(28, bonusNumbers);
		assertEquals(0, bonusSymbols);
		assertEquals(12, bonusMiddleNumberOrSymbol);
		assertEquals(0, bonusRequirements);
		
		int bonusLettersOnly = passwordMeter.getDeductions().getBonusLettersOnly();
		int bonusNumbersOnly = passwordMeter.getDeductions().getBonusNumbersOnly();
		int bonusRepeatCharacters = passwordMeter.getDeductions().getBonusRepeatCharacters();
		int bonusConsecutiveUpperLetters = passwordMeter.getDeductions().getBonusConsecutiveUpperLetters();
		int bonusConsecutiveLowerLetters = passwordMeter.getDeductions().getBonusConsecutiveLowerLetters();
		int bonusConsecutiveNumbers = passwordMeter.getDeductions().getBonusConsecutiveNumbers();
		int bonusSequentialLetters = passwordMeter.getDeductions().getBonusSequentialLetters();
		int bonusSequentialNumbers = passwordMeter.getDeductions().getBonusSequentialNumbers();
		int bonusSequentialSymbols = passwordMeter.getDeductions().getBonusSequentialSymbols();

		assertEquals(0, bonusLettersOnly);
		assertEquals(0, bonusNumbersOnly);
		assertEquals(1, bonusRepeatCharacters);
		assertEquals(0, bonusConsecutiveUpperLetters);
		assertEquals(54, bonusConsecutiveLowerLetters);
		assertEquals(10, bonusConsecutiveNumbers);
		assertEquals(33, bonusSequentialLetters);
		assertEquals(0, bonusSequentialNumbers);
		assertEquals(0, bonusSequentialSymbols);
		
		String score = passwordMeter.getScore();
		String complexity = passwordMeter.getComplexity();
		
		assertEquals("100%", score);
		assertEquals(PasswordMeter.MUITO_LONGA, complexity);
	}
	
	@Test
	public void testPasswordMeterTestSenario03(){
		String pInputPassword = "Adw48@j465GDhEShhdD157";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusNroOfChars();
		int bonusUppercaseLetters = passwordMeter.getAdditions().getBonusUppercaseLetters();
		int bonusLowercaseLatters = passwordMeter.getAdditions().getBonusLowercaseLatters();
		int bonusNumbers = passwordMeter.getAdditions().getBonusNumbers();
		int bonusSymbols = passwordMeter.getAdditions().getBonusSymbols();
		int bonusMiddleNumberOrSymbol = passwordMeter.getAdditions().getBonusMiddleNumberOrSymbol();
		int bonusRequirements = passwordMeter.getAdditions().getBonusRequirements();
		
		assertEquals(88, bonusNroOfChars);
		assertEquals(32, bonusUppercaseLetters);
		assertEquals(30, bonusLowercaseLatters);
		assertEquals(32, bonusNumbers);
		assertEquals(6, bonusSymbols);
		assertEquals(16, bonusMiddleNumberOrSymbol);
		assertEquals(10, bonusRequirements);
		
		int bonusLettersOnly = passwordMeter.getDeductions().getBonusLettersOnly();
		int bonusNumbersOnly = passwordMeter.getDeductions().getBonusNumbersOnly();
		int bonusRepeatCharacters = passwordMeter.getDeductions().getBonusRepeatCharacters();
		int bonusConsecutiveUpperLetters = passwordMeter.getDeductions().getBonusConsecutiveUpperLetters();
		int bonusConsecutiveLowerLetters = passwordMeter.getDeductions().getBonusConsecutiveLowerLetters();
		int bonusConsecutiveNumbers = passwordMeter.getDeductions().getBonusConsecutiveNumbers();
		int bonusSequentialLetters = passwordMeter.getDeductions().getBonusSequentialLetters();
		int bonusSequentialNumbers = passwordMeter.getDeductions().getBonusSequentialNumbers();
		int bonusSequentialSymbols = passwordMeter.getDeductions().getBonusSequentialSymbols();

		assertEquals(0, bonusLettersOnly);
		assertEquals(0, bonusNumbersOnly);
		assertEquals(1, bonusRepeatCharacters);
		assertEquals(4, bonusConsecutiveUpperLetters);
		assertEquals(6, bonusConsecutiveLowerLetters);
		assertEquals(10, bonusConsecutiveNumbers);
		assertEquals(0, bonusSequentialLetters);
		assertEquals(0, bonusSequentialNumbers);
		assertEquals(0, bonusSequentialSymbols);
		
		String score = passwordMeter.getScore();
		String complexity = passwordMeter.getComplexity();
		
		assertEquals("100%", score);
		assertEquals(PasswordMeter.MUITO_LONGA, complexity);
	}
	
	@Test
	public void testPasswordMeterTestSenario04(){
		String pInputPassword = " ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusNroOfChars();
		int bonusUppercaseLetters = passwordMeter.getAdditions().getBonusUppercaseLetters();
		int bonusLowercaseLatters = passwordMeter.getAdditions().getBonusLowercaseLatters();
		int bonusNumbers = passwordMeter.getAdditions().getBonusNumbers();
		int bonusSymbols = passwordMeter.getAdditions().getBonusSymbols();
		int bonusMiddleNumberOrSymbol = passwordMeter.getAdditions().getBonusMiddleNumberOrSymbol();
		int bonusRequirements = passwordMeter.getAdditions().getBonusRequirements();
		
		assertEquals(4, bonusNroOfChars);
		assertEquals(0, bonusUppercaseLetters);
		assertEquals(0, bonusLowercaseLatters);
		assertEquals(0, bonusNumbers);
		assertEquals(0, bonusSymbols);
		assertEquals(0, bonusMiddleNumberOrSymbol);
		assertEquals(0, bonusRequirements);
		
		int bonusLettersOnly = passwordMeter.getDeductions().getBonusLettersOnly();
		int bonusNumbersOnly = passwordMeter.getDeductions().getBonusNumbersOnly();
		int bonusRepeatCharacters = passwordMeter.getDeductions().getBonusRepeatCharacters();
		int bonusConsecutiveUpperLetters = passwordMeter.getDeductions().getBonusConsecutiveUpperLetters();
		int bonusConsecutiveLowerLetters = passwordMeter.getDeductions().getBonusConsecutiveLowerLetters();
		int bonusConsecutiveNumbers = passwordMeter.getDeductions().getBonusConsecutiveNumbers();
		int bonusSequentialLetters = passwordMeter.getDeductions().getBonusSequentialLetters();
		int bonusSequentialNumbers = passwordMeter.getDeductions().getBonusSequentialNumbers();
		int bonusSequentialSymbols = passwordMeter.getDeductions().getBonusSequentialSymbols();

		assertEquals(0, bonusLettersOnly);
		assertEquals(0, bonusNumbersOnly);
		assertEquals(0, bonusRepeatCharacters);
		assertEquals(0, bonusConsecutiveUpperLetters);
		assertEquals(0, bonusConsecutiveLowerLetters);
		assertEquals(0, bonusConsecutiveNumbers);
		assertEquals(0, bonusSequentialLetters);
		assertEquals(0, bonusSequentialNumbers);
		assertEquals(0, bonusSequentialSymbols);
		
		String score = passwordMeter.getScore();
		String complexity = passwordMeter.getComplexity();
		
		assertEquals("4%", score);
		assertEquals(PasswordMeter.MUITO_CURTA, complexity);
	}
	
	@Test
	public void testPasswordMeterTestSenario05(){
		String pInputPassword = " a ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusNroOfChars();
		int bonusUppercaseLetters = passwordMeter.getAdditions().getBonusUppercaseLetters();
		int bonusLowercaseLatters = passwordMeter.getAdditions().getBonusLowercaseLatters();
		int bonusNumbers = passwordMeter.getAdditions().getBonusNumbers();
		int bonusSymbols = passwordMeter.getAdditions().getBonusSymbols();
		int bonusMiddleNumberOrSymbol = passwordMeter.getAdditions().getBonusMiddleNumberOrSymbol();
		int bonusRequirements = passwordMeter.getAdditions().getBonusRequirements();
		
		assertEquals(12, bonusNroOfChars);
		assertEquals(0, bonusUppercaseLetters);
		assertEquals(4, bonusLowercaseLatters);
		assertEquals(0, bonusNumbers);
		assertEquals(0, bonusSymbols);
		assertEquals(0, bonusMiddleNumberOrSymbol);
		assertEquals(0, bonusRequirements);
		
		int bonusLettersOnly = passwordMeter.getDeductions().getBonusLettersOnly();
		int bonusNumbersOnly = passwordMeter.getDeductions().getBonusNumbersOnly();
		int bonusRepeatCharacters = passwordMeter.getDeductions().getBonusRepeatCharacters();
		int bonusConsecutiveUpperLetters = passwordMeter.getDeductions().getBonusConsecutiveUpperLetters();
		int bonusConsecutiveLowerLetters = passwordMeter.getDeductions().getBonusConsecutiveLowerLetters();
		int bonusConsecutiveNumbers = passwordMeter.getDeductions().getBonusConsecutiveNumbers();
		int bonusSequentialLetters = passwordMeter.getDeductions().getBonusSequentialLetters();
		int bonusSequentialNumbers = passwordMeter.getDeductions().getBonusSequentialNumbers();
		int bonusSequentialSymbols = passwordMeter.getDeductions().getBonusSequentialSymbols();

		assertEquals(3, bonusLettersOnly);
		assertEquals(0, bonusNumbersOnly);
		assertEquals(0, bonusRepeatCharacters);
		assertEquals(0, bonusConsecutiveUpperLetters);
		assertEquals(0, bonusConsecutiveLowerLetters);
		assertEquals(0, bonusConsecutiveNumbers);
		assertEquals(0, bonusSequentialLetters);
		assertEquals(0, bonusSequentialNumbers);
		assertEquals(0, bonusSequentialSymbols);
		
		String score = passwordMeter.getScore();
		String complexity = passwordMeter.getComplexity();
		
		assertEquals("13%", score);
		assertEquals(PasswordMeter.MUITO_CURTA, complexity);
	}
	
	@Test
	public void testPasswordMeterTestSenario06(){
		String pInputPassword = "   aaaaaa  aBBB    ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusNroOfChars();
		int bonusUppercaseLetters = passwordMeter.getAdditions().getBonusUppercaseLetters();
		int bonusLowercaseLatters = passwordMeter.getAdditions().getBonusLowercaseLatters();
		int bonusNumbers = passwordMeter.getAdditions().getBonusNumbers();
		int bonusSymbols = passwordMeter.getAdditions().getBonusSymbols();
		int bonusMiddleNumberOrSymbol = passwordMeter.getAdditions().getBonusMiddleNumberOrSymbol();
		int bonusRequirements = passwordMeter.getAdditions().getBonusRequirements();
		
		assertEquals(76, bonusNroOfChars);
		assertEquals(32, bonusUppercaseLetters);
		assertEquals(24, bonusLowercaseLatters);
		assertEquals(0, bonusNumbers);
		assertEquals(0, bonusSymbols);
		assertEquals(0, bonusMiddleNumberOrSymbol);
		assertEquals(0, bonusRequirements);
		
		int bonusLettersOnly = passwordMeter.getDeductions().getBonusLettersOnly();
		int bonusNumbersOnly = passwordMeter.getDeductions().getBonusNumbersOnly();
		int bonusRepeatCharacters = passwordMeter.getDeductions().getBonusRepeatCharacters();
		int bonusConsecutiveUpperLetters = passwordMeter.getDeductions().getBonusConsecutiveUpperLetters();
		int bonusConsecutiveLowerLetters = passwordMeter.getDeductions().getBonusConsecutiveLowerLetters();
		int bonusConsecutiveNumbers = passwordMeter.getDeductions().getBonusConsecutiveNumbers();
		int bonusSequentialLetters = passwordMeter.getDeductions().getBonusSequentialLetters();
		int bonusSequentialNumbers = passwordMeter.getDeductions().getBonusSequentialNumbers();
		int bonusSequentialSymbols = passwordMeter.getDeductions().getBonusSequentialSymbols();

		assertEquals(19, bonusLettersOnly);
		assertEquals(0, bonusNumbersOnly);
		assertEquals(49, bonusRepeatCharacters);
		assertEquals(4, bonusConsecutiveUpperLetters);
		assertEquals(12, bonusConsecutiveLowerLetters);
		assertEquals(0, bonusConsecutiveNumbers);
		assertEquals(0, bonusSequentialLetters);
		assertEquals(0, bonusSequentialNumbers);
		assertEquals(0, bonusSequentialSymbols);
		
		String score = passwordMeter.getScore();
		String complexity = passwordMeter.getComplexity();
		
		assertEquals("48%", score);
		assertEquals(PasswordMeter.BOA, complexity);
	}
	
	@Test
	public void testPasswordMeterTestSenario07(){
		String pInputPassword = "11115 555577788";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusNroOfChars();
		int bonusUppercaseLetters = passwordMeter.getAdditions().getBonusUppercaseLetters();
		int bonusLowercaseLatters = passwordMeter.getAdditions().getBonusLowercaseLatters();
		int bonusNumbers = passwordMeter.getAdditions().getBonusNumbers();
		int bonusSymbols = passwordMeter.getAdditions().getBonusSymbols();
		int bonusMiddleNumberOrSymbol = passwordMeter.getAdditions().getBonusMiddleNumberOrSymbol();
		int bonusRequirements = passwordMeter.getAdditions().getBonusRequirements();
		
		assertEquals(60, bonusNroOfChars);
		assertEquals(0, bonusUppercaseLetters);
		assertEquals(0, bonusLowercaseLatters);
		assertEquals(56, bonusNumbers);
		assertEquals(0, bonusSymbols);
		assertEquals(24, bonusMiddleNumberOrSymbol);
		assertEquals(0, bonusRequirements);
		
		int bonusLettersOnly = passwordMeter.getDeductions().getBonusLettersOnly();
		int bonusNumbersOnly = passwordMeter.getDeductions().getBonusNumbersOnly();
		int bonusRepeatCharacters = passwordMeter.getDeductions().getBonusRepeatCharacters();
		int bonusConsecutiveUpperLetters = passwordMeter.getDeductions().getBonusConsecutiveUpperLetters();
		int bonusConsecutiveLowerLetters = passwordMeter.getDeductions().getBonusConsecutiveLowerLetters();
		int bonusConsecutiveNumbers = passwordMeter.getDeductions().getBonusConsecutiveNumbers();
		int bonusSequentialLetters = passwordMeter.getDeductions().getBonusSequentialLetters();
		int bonusSequentialNumbers = passwordMeter.getDeductions().getBonusSequentialNumbers();
		int bonusSequentialSymbols = passwordMeter.getDeductions().getBonusSequentialSymbols();

		assertEquals(0, bonusLettersOnly);
		assertEquals(15, bonusNumbersOnly);
		assertEquals(45, bonusRepeatCharacters);
		assertEquals(0, bonusConsecutiveUpperLetters);
		assertEquals(0, bonusConsecutiveLowerLetters);
		assertEquals(26, bonusConsecutiveNumbers);
		assertEquals(0, bonusSequentialLetters);
		assertEquals(0, bonusSequentialNumbers);
		assertEquals(0, bonusSequentialSymbols);
		
		String score = passwordMeter.getScore();
		String complexity = passwordMeter.getComplexity();
		
		assertEquals("54%", score);
		assertEquals(PasswordMeter.BOA, complexity);
	}
	
	
	@Test
	public void testPasswordMeterTestSenario08(){
		String pInputPassword = "  aaaa ir$ aao  aaa 1 kk i $$AA Dd 12 57 abcd ab cd 1234 12 34 )!@# )! @#";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusNroOfChars();
		int bonusUppercaseLetters = passwordMeter.getAdditions().getBonusUppercaseLetters();
		int bonusLowercaseLatters = passwordMeter.getAdditions().getBonusLowercaseLatters();
		int bonusNumbers = passwordMeter.getAdditions().getBonusNumbers();
		int bonusSymbols = passwordMeter.getAdditions().getBonusSymbols();
		int bonusMiddleNumberOrSymbol = passwordMeter.getAdditions().getBonusMiddleNumberOrSymbol();
		int bonusRequirements = passwordMeter.getAdditions().getBonusRequirements();
		
		assertEquals(292, bonusNroOfChars);
		assertEquals(140, bonusUppercaseLetters);
		assertEquals(98, bonusLowercaseLatters);
		assertEquals(52, bonusNumbers);
		assertEquals(66, bonusSymbols);
		assertEquals(46, bonusMiddleNumberOrSymbol);
		assertEquals(10, bonusRequirements);
		
		int bonusLettersOnly = passwordMeter.getDeductions().getBonusLettersOnly();
		int bonusNumbersOnly = passwordMeter.getDeductions().getBonusNumbersOnly();
		int bonusRepeatCharacters = passwordMeter.getDeductions().getBonusRepeatCharacters();
		int bonusConsecutiveUpperLetters = passwordMeter.getDeductions().getBonusConsecutiveUpperLetters();
		int bonusConsecutiveLowerLetters = passwordMeter.getDeductions().getBonusConsecutiveLowerLetters();
		int bonusConsecutiveNumbers = passwordMeter.getDeductions().getBonusConsecutiveNumbers();
		int bonusSequentialLetters = passwordMeter.getDeductions().getBonusSequentialLetters();
		int bonusSequentialNumbers = passwordMeter.getDeductions().getBonusSequentialNumbers();
		int bonusSequentialSymbols = passwordMeter.getDeductions().getBonusSequentialSymbols();

		assertEquals(0, bonusLettersOnly);
		assertEquals(0, bonusNumbersOnly);
		assertEquals(4, bonusRepeatCharacters);
		assertEquals(4, bonusConsecutiveUpperLetters);
		assertEquals(38, bonusConsecutiveLowerLetters);
		assertEquals(20, bonusConsecutiveNumbers);
		assertEquals(6, bonusSequentialLetters);
		assertEquals(6, bonusSequentialNumbers);
		assertEquals(6, bonusSequentialSymbols);
		
		String score = passwordMeter.getScore();
		String complexity = passwordMeter.getComplexity();
		
		assertEquals("100%", score);
		assertEquals(PasswordMeter.MUITO_LONGA, complexity);
	}
	
	@Test
	public void testPasswordMeterTestSenario09(){
		String pInputPassword = "775692411";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusNroOfChars();
		int bonusUppercaseLetters = passwordMeter.getAdditions().getBonusUppercaseLetters();
		int bonusLowercaseLatters = passwordMeter.getAdditions().getBonusLowercaseLatters();
		int bonusNumbers = passwordMeter.getAdditions().getBonusNumbers();
		int bonusSymbols = passwordMeter.getAdditions().getBonusSymbols();
		int bonusMiddleNumberOrSymbol = passwordMeter.getAdditions().getBonusMiddleNumberOrSymbol();
		int bonusRequirements = passwordMeter.getAdditions().getBonusRequirements();
		
		assertEquals(36, bonusNroOfChars);
		assertEquals(0, bonusUppercaseLetters);
		assertEquals(0, bonusLowercaseLatters);
		assertEquals(0, bonusNumbers);
		assertEquals(0, bonusSymbols);
		assertEquals(14, bonusMiddleNumberOrSymbol);
		assertEquals(0, bonusRequirements);
		
		int bonusLettersOnly = passwordMeter.getDeductions().getBonusLettersOnly();
		int bonusNumbersOnly = passwordMeter.getDeductions().getBonusNumbersOnly();
		int bonusRepeatCharacters = passwordMeter.getDeductions().getBonusRepeatCharacters();
		int bonusConsecutiveUpperLetters = passwordMeter.getDeductions().getBonusConsecutiveUpperLetters();
		int bonusConsecutiveLowerLetters = passwordMeter.getDeductions().getBonusConsecutiveLowerLetters();
		int bonusConsecutiveNumbers = passwordMeter.getDeductions().getBonusConsecutiveNumbers();
		int bonusSequentialLetters = passwordMeter.getDeductions().getBonusSequentialLetters();
		int bonusSequentialNumbers = passwordMeter.getDeductions().getBonusSequentialNumbers();
		int bonusSequentialSymbols = passwordMeter.getDeductions().getBonusSequentialSymbols();

		assertEquals(0, bonusLettersOnly);
		assertEquals(9, bonusNumbersOnly);
		assertEquals(3, bonusRepeatCharacters);
		assertEquals(0, bonusConsecutiveUpperLetters);
		assertEquals(0, bonusConsecutiveLowerLetters);
		assertEquals(16, bonusConsecutiveNumbers);
		assertEquals(0, bonusSequentialLetters);
		assertEquals(0, bonusSequentialNumbers);
		assertEquals(0, bonusSequentialSymbols);
		
		String score = passwordMeter.getScore();
		String complexity = passwordMeter.getComplexity();
		
		assertEquals("22%", score);
		assertEquals(PasswordMeter.CURTA, complexity);
	}
}