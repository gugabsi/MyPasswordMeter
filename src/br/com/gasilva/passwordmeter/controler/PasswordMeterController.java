package br.com.gasilva.passwordmeter.controler;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.gasilva.passwordmeter.api.PasswordMeter;
import br.com.gasilva.passwordmeter.vo.PasswordMeterVO;

@RequestScoped
@ManagedBean
public class PasswordMeterController implements Serializable{
			
	/**
	 * 
	 */
	private static final long serialVersionUID = -7352566737044230464L;	
	
	private PasswordMeterVO passwordMeterVO;

    public PasswordMeterController() {
    	PasswordMeter passwordMeter = new PasswordMeter();
    	
    	passwordMeterVO = new PasswordMeterVO();
    	passwordMeterVO.setScore(passwordMeter.getScore());
    	passwordMeterVO.setComplexity(passwordMeter.getComplexity());
    }    

    public PasswordMeterVO getPasswordMeterVO() {
        return passwordMeterVO;
    }

    public void setPasswordMeterVO(PasswordMeterVO passwordMeterVO) {
        this.passwordMeterVO = passwordMeterVO;
    }
    
    public void calcula(){
    	
    	String inputPassword = passwordMeterVO.getInputPassword();
    	
    	if (inputPassword == null){
    		inputPassword = "";
    	}
    	
    	PasswordMeter passwordMeter = new PasswordMeter();
    	passwordMeter.generateMeter(inputPassword);
    	
    	passwordMeterVO.setScore(passwordMeter.getScore());
    	passwordMeterVO.setComplexity(passwordMeter.getComplexity());
    }
}
