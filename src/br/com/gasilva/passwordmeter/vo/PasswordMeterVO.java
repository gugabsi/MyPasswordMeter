package br.com.gasilva.passwordmeter.vo;

import java.io.Serializable;

public class PasswordMeterVO implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1477221249502699425L;
	
	
	private String inputPassword;
    private String score;
    private String complexity;

    public PasswordMeterVO() {
    	inputPassword = "";
    	score = "0%";
    	complexity = "";
    }

	public String getInputPassword() {
		return inputPassword;
	}

	public void setInputPassword(String inputPassword) {
		this.inputPassword = inputPassword;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getComplexity() {
		return complexity;
	}

	public void setComplexity(String complexity) {
		this.complexity = complexity;
	}
}
