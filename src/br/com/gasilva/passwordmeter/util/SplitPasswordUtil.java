package br.com.gasilva.passwordmeter.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitPasswordUtil {

	public static final String PATTERN_UPPER_LATTER = "[A-Z]+";
	public static final String PATTERN_UPPER_LATTER_WITH_SPACE = "[A-Z\\s]+";	
	public static final String PATTERN_LOWER_LATTER = "[a-z]+";
	public static final String PATTERN_LOWER_LATTER_WITH_SPACE = "[a-z\\s]+";
	public static final String PATTERN_LOWER_AND_UPPER_LATTER = "[a-zA-Z]+";
	public static final String PATTERN_NUMBER = "[0-9]+";
	public static final String PATTERN_NUMBER_WITH_SPACE = "[0-9\\s]+";
	public static final String PATTERN_SYMBOL = "[^a-z^A-Z^\\d^\\s]";
	
	public static List<String> splipUpperLatter(final String pInputPassword){
		return process(pInputPassword, PATTERN_UPPER_LATTER);
	}
	
	public static List<String> splipUpperLatterWithSpace(final String pInputPassword){
		return process(pInputPassword, PATTERN_UPPER_LATTER_WITH_SPACE);
	}
	
	public static List<String> splipLowerLatter(final String pInputPassword){
		return process(pInputPassword, PATTERN_LOWER_LATTER);
	}
	
	public static List<String> splipLowerLatterWithSpace(final String pInputPassword){
		return process(pInputPassword, PATTERN_LOWER_LATTER_WITH_SPACE);
	}
	
	public static List<String> splipLowerAndUpperLatter(final String pInputPassword){
		 List<String> lst = process(pInputPassword, PATTERN_LOWER_AND_UPPER_LATTER);
		 
		 if(lst.size() > 0){
			 lst.addAll(process(pInputPassword, "\\s+"));
		 }
		 
		 return lst;
	}
	
	public static List<String> splipNumber(final String pInputPassword){
		return process(pInputPassword, PATTERN_NUMBER);
	}
	
	public static List<String> splipNumberWithSpace(final String pInputPassword){
		return process(pInputPassword, PATTERN_NUMBER_WITH_SPACE);
	}
	
	public static List<String> splipSymbol(final String pInputPassword){
		return process(pInputPassword, PATTERN_SYMBOL);
	}
	
	private static List<String> process(final String pInputPassword, final String pPattern){
		List<String> lstSplitValues = new ArrayList<String>();
		
		if(pInputPassword != null && !"".equals(pInputPassword)){
			
			Pattern p = Pattern.compile(pPattern);
			Matcher m = p.matcher(pInputPassword);
					
			while(m.find())	{	
				lstSplitValues.add(m.group());
			}
		}
		
		return lstSplitValues;
	}
}
