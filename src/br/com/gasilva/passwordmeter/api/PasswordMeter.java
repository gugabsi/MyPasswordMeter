package br.com.gasilva.passwordmeter.api;

import java.util.List;

import br.com.gasilva.passwordmeter.util.CalculationBonusUtil;
import br.com.gasilva.passwordmeter.util.SplitPasswordUtil;

public class PasswordMeter {
	
	static final String MUITO_CURTA = "Muito curta";
	static final String CURTA = "Curta";
	static final String BOA = "Boa";
	static final String LONGA = "Forte";
	static final String MUITO_LONGA = "Muito forte";
	
	
	private String score;
	private String complexity;
	
	private String pInputPassword;
	private List<String> lstUpperLetter;
	private List<String> lstLowerLetter;
	private List<String> lstLowerAndUpperLetter;
	private List<String> lstNumber;
	private List<String> lstSymbol;
	
	private Additions additions;
	private Deductions deductions;
	
	public PasswordMeter(){
		resetScoreAndComplexity();
	}
	
	private void resetScoreAndComplexity(){
		this.score = "0%";
		this.complexity = "Muito curta";
	}
	
	private void inicialize(String pInputPassword){
		if (pInputPassword == null){
			this.pInputPassword = "";
		}
		
		this.pInputPassword = pInputPassword;
		this.lstUpperLetter = SplitPasswordUtil.splipUpperLatter(pInputPassword);        
		this.lstLowerLetter = SplitPasswordUtil.splipLowerLatter(pInputPassword);        
		this.lstLowerAndUpperLetter = SplitPasswordUtil.splipLowerAndUpperLatter(pInputPassword);
		this.lstNumber = SplitPasswordUtil.splipNumber(pInputPassword);             
		this.lstSymbol = SplitPasswordUtil.splipSymbol(pInputPassword);             
	}
	
	public void generateMeter(String pInputPassword){
		inicialize(pInputPassword);
		resetScoreAndComplexity();
		
		this.additions = new Additions(this.pInputPassword, lstUpperLetter, lstLowerLetter, lstLowerAndUpperLetter, lstNumber, lstSymbol);         
		this.deductions = new Deductions(this.pInputPassword, lstUpperLetter, lstLowerLetter, lstLowerAndUpperLetter, lstNumber, lstSymbol);
		 
		int sumAdditionsBunus = additions.sumAllBonus();
		int sumDeductionsBunus = deductions.sumAllBonus();
		int tmpScore = CalculationBonusUtil.validateResult(sumAdditionsBunus - sumDeductionsBunus);
		
		this.score = tmpScore + "%";
		
		if ( tmpScore < 20){
			this.complexity = MUITO_CURTA;
		}else if (tmpScore >= 20 && tmpScore < 40){
			this.complexity = CURTA;
		}else if (tmpScore >= 40 && tmpScore < 60){
			this.complexity = BOA;
		}else if (tmpScore >= 60 && tmpScore < 80){
			this.complexity = LONGA;
		}else if (tmpScore >= 80){
			this.complexity = MUITO_LONGA;
		}
	}
	
	protected Additions getAdditions() {
		return additions;
	}

	protected Deductions getDeductions() {
		return deductions;
	}

	public String getScore() {
		return score;
	}

	public String getComplexity() {
		return complexity;
	}
}
