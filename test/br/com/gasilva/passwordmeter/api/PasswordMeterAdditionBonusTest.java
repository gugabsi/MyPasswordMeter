package br.com.gasilva.passwordmeter.api;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PasswordMeterAdditionBonusTest {

	private PasswordMeter passwordMeter;
	
	@Before
	public void init(){
		passwordMeter = new PasswordMeter();
	}
	
	/************************************************** Nro Chars **********************************/
	@Test
	public void testNroCharsEqualZeroBonus(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusNroOfChars();
		
		assertEquals(0, bonusNroOfChars);
	}
	
	@Test
	public void testNroCharsEqualFourBonus(){
		String pInputPassword = " ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusNroOfChars();
		
		assertEquals(4, bonusNroOfChars);
	}
	
	@Test
	public void testNroCharsEqualEightBonus(){
		String pInputPassword = " $";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusNroOfChars();
		
		assertEquals(8, bonusNroOfChars);
	}
	
	/************************************************************  Nro Upper ******************************************/
	@Test
	public void testNroUpperCharsEqualZeroBonusSce1(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusUppercaseLetters();
		
		assertEquals(0, bonusNroOfChars);
	}
	
	@Test
	public void testNroUpperCharsEqualZeroBonusSce2(){
		String pInputPassword = " ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusUppercaseLetters();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroUpperCharsEqualZeroBonusSce3(){
		String pInputPassword = " a";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusUppercaseLetters();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroUpperCharsEqualZeroBunusSce4(){
		String pInputPassword = "# ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusUppercaseLetters();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroUpperCharsEqualZeroBonusSce5(){
		String pInputPassword = " 1 ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusUppercaseLetters();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroUpperCharsEqualTenBonus(){
		String pInputPassword = "# A G  ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusUppercaseLetters();
		
		assertEquals(10, bonusNroOfChars);
	} 
	
	@Test
	public void testNroUpperCharsEqualSixteenBonus(){
		String pInputPassword = "  aFGR 1 S  ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusUppercaseLetters();
		
		assertEquals(16, bonusNroOfChars);
	}
	
	
	/************************************************ Nro Lower *********************************************/
	@Test
	public void testNroLowerCharsEqualZeroBonusSce1(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusLowercaseLatters();
		
		assertEquals(0, bonusNroOfChars);
	}
	
	@Test
	public void testNroLowerCharsEqualZeroBonusSce2(){
		String pInputPassword = " ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusLowercaseLatters();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroLowerCharsEqualZeroBonusSce3(){
		String pInputPassword = " A#5";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusLowercaseLatters();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroLowerCharsEqualZeroBonusSce4(){
		String pInputPassword = "# ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusLowercaseLatters();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroLowerCharsEqualZeroBonusSce5(){
		String pInputPassword = " 1 ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusLowercaseLatters();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroLowerCharsEqualEightennBonus(){
		String pInputPassword = "  h# a575  ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusLowercaseLatters();
		
		assertEquals(18, bonusNroOfChars);
	} 
	
	@Test
	public void testNroLowerCharsEqualEightBonus(){
		String pInputPassword = "aFre 1 d";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusLowercaseLatters();
		
		assertEquals(8, bonusNroOfChars);
	}
	@Test
	public void testNroNumberEqualFourteenBonus(){
		String pInputPassword = "a5F58re 1 d";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusLowercaseLatters();
		
		assertEquals(14, bonusNroOfChars);
	}
	
	
	/************************************************* Nro Numbers *********************************************/
	@Test
	public void testNroNumberEqualZeroBunusSce1(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusNumbers();
		
		assertEquals(0, bonusNroOfChars);
	}
	
	@Test
	public void testNroNumberEqualZeroBonusSce2(){
		String pInputPassword = " ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusNumbers();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroNumberEqualZeroBonusSce3(){
		String pInputPassword = " A#a";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusNumbers();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroNumberEqualZeroBonusSce4(){
		String pInputPassword = " # ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusNumbers();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroNumberEqualZeroBonusSce5(){
		String pInputPassword = " rR ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusNumbers();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroNumberEqualEightBonus(){
		String pInputPassword = "$hd# a55";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusNumbers();
		
		assertEquals(8, bonusNroOfChars);
	} 
	
	
	/************************************************ Nro Symbols *********************************************/
	@Test
	public void testNroSymbolEqualZeroBonusSce1(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusSymbols();
		
		assertEquals(0, bonusNroOfChars);
	}
	
	@Test
	public void testNroSymbolEqualZeroBonusSce2(){
		String pInputPassword = " ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusSymbols();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroSymbolEqualZeroBonusSce3(){
		String pInputPassword = " Aa5 ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusSymbols();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroSymbolEqualZeroBonusSce4(){
		String pInputPassword = "s ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusSymbols();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroSymbolEqualZeroBonusSce5(){
		String pInputPassword = " 1 ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusSymbols();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroSymbolEqualTwelveBonus(){
		String pInputPassword = "h# a5&75";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusSymbols();
		
		assertEquals(12, bonusNroOfChars);
	} 
	
	@Test
	public void testNroSymbolEqualTwentyFourBonus(){
		String pInputPassword = "a#%Fre 1 @!d";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusSymbols();
		
		assertEquals(24, bonusNroOfChars);
	}
	
	/************************************************ Nro Middle Numbers or Symbols *********************************************/
	@Test
	public void testNroMidEqualZeroBonusSce1(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusMiddleNumberOrSymbol();
		
		assertEquals(0, bonusNroOfChars);
	}
	
	@Test
	public void testNroMidEqualZeroBonusSce2(){
		String pInputPassword = " ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusMiddleNumberOrSymbol();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroMidEqualZeroBonusSce3(){
		String pInputPassword = " $Aa5 ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusMiddleNumberOrSymbol();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroMidEqualZeroBonusSce4(){
		String pInputPassword = "sY ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusMiddleNumberOrSymbol();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroMidEqualZeroBonusSce5(){
		String pInputPassword = "1sdgag$ ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusMiddleNumberOrSymbol();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroMidEqualEightBonus(){
		String pInputPassword = "h# a5&75";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusMiddleNumberOrSymbol();
		
		assertEquals(8, bonusNroOfChars);
	} 
	
	@Test
	public void testNroMidEqualTenBonus(){
		String pInputPassword = "a#%Fre 1 @!d";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusMiddleNumberOrSymbol();
		
		assertEquals(10, bonusNroOfChars);
	} 	
	
	
	/************************************************ Nro Requirements *********************************************/
	@Test
	public void testNroRequirementsEqualZeroBonusSce1(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusRequirements();
		
		assertEquals(0, bonusNroOfChars);
	}
	
	@Test
	public void testNroRequirementsEqualZeroBonusSce2(){
		String pInputPassword = " ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusRequirements();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroRequirementsEqualZeroBonusSce3(){
		String pInputPassword = "        ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusRequirements();
		
		assertEquals(0, bonusNroOfChars);
	}
	
	@Test
	public void testNroRequirementsEqualZeroBonusSce4(){
		String pInputPassword = "a ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusRequirements();
		
		assertEquals(0, bonusNroOfChars);
	}
	
	@Test
	public void testNroRequirementsEqualZeroBonusSce5(){
		String pInputPassword = " A ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusRequirements();
		
		assertEquals(0, bonusNroOfChars);
	}
	
	@Test
	public void testNroRequirementsEqualZeroBonusSce6(){
		String pInputPassword = " %";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusRequirements();
		
		assertEquals(0, bonusNroOfChars);
	}
	
	@Test
	public void testNroRequirementsEqualZeroBonusSce7(){
		String pInputPassword = "1";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusRequirements();
		
		assertEquals(0, bonusNroOfChars);
	}
	
	@Test
	public void testNroRequirementsEqualZeroBonusSce8(){
		String pInputPassword = "a A";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusRequirements();
		
		assertEquals(0, bonusNroOfChars);
	}
	
	@Test
	public void testNroRequirementsEqualZeroBonusSce9(){
		String pInputPassword = " 5 A";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusRequirements();
		
		assertEquals(0, bonusNroOfChars);
	}
	
	@Test
	public void testNroRequirementsEqualZeroBonusSce10(){
		String pInputPassword = "a A#";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusRequirements();
		
		assertEquals(0, bonusNroOfChars);
	}
		
	@Test
	public void testNroRequirementsEqualZeroBonusSce11(){
		String pInputPassword = "h# S5&7";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusRequirements();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroRequirementsEqualTenBonus(){
		String pInputPassword = "a#%Fre 1 @!d";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getBonusRequirements();
		
		assertEquals(10, bonusNroOfChars);
	}
}
