package com.codegeekslab.type;

import java.util.Map;
import java.util.Map.Entry;

import com.codegeekslab.device.CellPhone;

public class SmartPhone implements CellPhone {

	public void makeCall(Map<String,Integer> contactDetails, String app) {
 		for(Entry<String, Integer> details:contactDetails.entrySet())
			System.out.println("calling "+details.getKey()+"("+details.getValue()+")"+" via "+app);
	}

}
