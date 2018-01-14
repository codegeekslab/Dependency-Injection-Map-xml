package com.codegeekslab.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.codegeekslab.app.CallingApp;
 public class Test {

	public static void main(String[] args) {
		ApplicationContext context =new GenericXmlApplicationContext("beans.xml");
		CallingApp callingApp = (CallingApp) context.getBean("CallingApp");
		callingApp.dialNumber();
	 
 	}
}
