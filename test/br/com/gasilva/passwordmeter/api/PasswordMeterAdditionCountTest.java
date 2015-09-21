package br.com.gasilva.passwordmeter.api;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PasswordMeterAdditionCountTest {

	private PasswordMeter passwordMeter;
	
	@Before
	public void init(){
		passwordMeter = new PasswordMeter();
	}
	
	/************************************************** Nro Chars **********************************/
	@Test
	public void testNroCharsEqualZeroCount(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountNroOfChars();
		
		assertEquals(0, bonusNroOfChars);
	}
	
	@Test
	public void testNroCharsEqualOneCount(){
		String pInputPassword = " ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountNroOfChars();
		
		assertEquals(1, bonusNroOfChars);
	}
	
	@Test
	public void testNroCharsEqualTwoCount(){
		String pInputPassword = " $";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountNroOfChars();
		
		assertEquals(2, bonusNroOfChars);
	}
	
	/************************************************************  Nro Upper ******************************************/
	@Test
	public void testNroUpperCharsEqualZeroCountSce1(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountUppercaseLetters();
		
		assertEquals(0, 0, bonusNroOfChars);
	}
	
	@Test
	public void testNroUpperCharsEqualZeroCountSce2(){
		String pInputPassword = " ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountUppercaseLetters();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroUpperCharsEqualZeroCountSce3(){
		String pInputPassword = " a";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountUppercaseLetters();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroUpperCharsEqualZeroCountSce4(){
		String pInputPassword = "# ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountUppercaseLetters();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroUpperCharsEqualZeroCountSce5(){
		String pInputPassword = " 1 ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountUppercaseLetters();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroUpperCharsEqualTwoCount(){
		String pInputPassword = "# A G  ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountUppercaseLetters();
		
		assertEquals(2, bonusNroOfChars);
	} 
	
	@Test
	public void testNroUpperCharsEqualFourCount(){
		String pInputPassword = "  aFGR 1 S  ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountUppercaseLetters();
		
		assertEquals(4, bonusNroOfChars);
	}
	
	
	/************************************************ Nro Lower *********************************************/
	@Test
	public void testNroLowerCharsEqualZeroCountSce1(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountLowercaseLatters();
		
		assertEquals(0, bonusNroOfChars);
	}
	
	@Test
	public void testNroLowerCharsEqualZeroCountSce2(){
		String pInputPassword = " ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountLowercaseLatters();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroLowerCharsEqualZeroCountSce3(){
		String pInputPassword = " A#5";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountLowercaseLatters();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroLowerCharsEqualZeroCountSce4(){
		String pInputPassword = "# ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountLowercaseLatters();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroLowerCharsEqualZeroCountSce5(){
		String pInputPassword = " 1 ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountLowercaseLatters();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroLowerCharsEqualTwoCount(){
		String pInputPassword = "  h# a575  ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountLowercaseLatters();
		
		assertEquals(2, bonusNroOfChars);
	} 
	
	@Test
	public void testNroLowerCharsEqualFourCount(){
		String pInputPassword = "aFre 1 d";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountLowercaseLatters();
		
		assertEquals(4, bonusNroOfChars);
	}
	@Test
	public void testNroNumberEqualFourCount(){
		String pInputPassword = "a5F58re 1 d";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountLowercaseLatters();
		
		assertEquals(4, bonusNroOfChars);
	}
	
	
	/************************************************* Nro Numbers *********************************************/
	@Test
	public void testNroNumberEqualZeroCountSce1(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountNumbers();
		
		assertEquals(0, bonusNroOfChars);
	}
	
	@Test
	public void testNroNumberEqualZeroCountSce2(){
		String pInputPassword = " ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountNumbers();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroNumberEqualZeroCountSce3(){
		String pInputPassword = " A#a";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountNumbers();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroNumberEqualZeroCountSce4(){
		String pInputPassword = " # ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountNumbers();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroNumberEqualZeroCountSce5(){
		String pInputPassword = " rR ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountNumbers();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroNumberEqualTwoCount(){
		String pInputPassword = "$hd# a55";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountNumbers();
		
		assertEquals(2, bonusNroOfChars);
	} 
	
	
	/************************************************ Nro Symbols *********************************************/
	@Test
	public void testNroSymbolEqualZeroCountSce1(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountSymbols();
		
		assertEquals(0, bonusNroOfChars);
	}
	
	@Test
	public void testNroSymbolEqualZeroCountSce2(){
		String pInputPassword = " ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountSymbols();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroSymbolEqualZeroCountSce3(){
		String pInputPassword = " Aa5 ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountSymbols();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroSymbolEqualZeroCountSce4(){
		String pInputPassword = "s ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountSymbols();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroSymbolEqualZeroCountSce5(){
		String pInputPassword = " 1 ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountSymbols();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroSymbolEqualTwoCount(){
		String pInputPassword = "h# a5&75";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountSymbols();
		
		assertEquals(2, bonusNroOfChars);
	} 
	
	@Test
	public void testNroSymbolEqualFourCount(){
		String pInputPassword = "a#%Fre 1 @!d";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountSymbols();
		
		assertEquals(4, bonusNroOfChars);
	}
	
	/************************************************ Nro Middle Numbers or Symbols *********************************************/
	@Test
	public void testNroMidEqualZeroCountSce1(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountMiddleNumberOrSymbol();
		
		assertEquals(0, bonusNroOfChars);
	}
	
	@Test
	public void testNroMidEqualZeroCountSce2(){
		String pInputPassword = " ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountMiddleNumberOrSymbol();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroMidEqualZeroCountSce3(){
		String pInputPassword = " $Aa5 ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountMiddleNumberOrSymbol();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroMidEqualZeroCountSce4(){
		String pInputPassword = "sY ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountMiddleNumberOrSymbol();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroMidEqualZeroCountSce5(){
		String pInputPassword = "1sdgag$ ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountMiddleNumberOrSymbol();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroMidEqualFourCount(){
		String pInputPassword = "h# a5&75";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountMiddleNumberOrSymbol();
		
		assertEquals(4, bonusNroOfChars);
	} 
	
	@Test
	public void testNroMidEqualFiveCount(){
		String pInputPassword = "a#%Fre 1 @!d";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountMiddleNumberOrSymbol();
		
		assertEquals(5, bonusNroOfChars);
	} 	
	
	
	/************************************************ Nro Requirements *********************************************/
	@Test
	public void testNroRequirementsEqualZeroCountSce1(){
		String pInputPassword = "";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountRequirements();
		
		assertEquals(0, bonusNroOfChars);
	}
	
	@Test
	public void testNroRequirementsEqualZeroCountSce2(){
		String pInputPassword = " ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountRequirements();
		
		assertEquals(0, bonusNroOfChars);
	} 
	
	@Test
	public void testNroRequirementsEqualOneCountSce1(){
		String pInputPassword = "        ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountRequirements();
		
		assertEquals(1, bonusNroOfChars);
	}
	
	@Test
	public void testNroRequirementsEqualOneCountSce2(){
		String pInputPassword = "a ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountRequirements();
		
		assertEquals(1, bonusNroOfChars);
	}
	
	@Test
	public void testNroRequirementsEqualOneCountSce3(){
		String pInputPassword = " A ";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountRequirements();
		
		assertEquals(1, bonusNroOfChars);
	}
	
	@Test
	public void testNroRequirementsEqualOneCountSce4(){
		String pInputPassword = " %";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountRequirements();
		
		assertEquals(1, bonusNroOfChars);
	}
	
	@Test
	public void testNroRequirementsEqualOneCountSce5(){
		String pInputPassword = "1";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountRequirements();
		
		assertEquals(1, bonusNroOfChars);
	}
	
	@Test
	public void testNroRequirementsEqualTwoCountSce1(){
		String pInputPassword = "a A";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountRequirements();
		
		assertEquals(2, bonusNroOfChars);
	}
	
	@Test
	public void testNroRequirementsEqualTwoCountSce2(){
		String pInputPassword = " 5 A";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountRequirements();
		
		assertEquals(2, bonusNroOfChars);
	}
	
	@Test
	public void testNroRequirementsEqualThreeCountSce1(){
		String pInputPassword = "a A#";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountRequirements();
		
		assertEquals(3, bonusNroOfChars);
	}
		
	@Test
	public void testNroRequirementsEqualFourCount(){
		String pInputPassword = "h# S5&7";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountRequirements();
		
		assertEquals(4, bonusNroOfChars);
	} 
	
	@Test
	public void testNroRequirementsEqualFiveCount(){
		String pInputPassword = "a#%Fre 1 @!d";
		passwordMeter.generateMeter(pInputPassword);
		
		int bonusNroOfChars = passwordMeter.getAdditions().getCountRequirements();
		
		assertEquals(5, bonusNroOfChars);
	}
}
