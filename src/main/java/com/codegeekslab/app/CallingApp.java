package com.codegeekslab.app;

import java.util.Map;

import com.codegeekslab.device.CellPhone;

public class CallingApp {

	private CellPhone phone;
	private Map<String, Integer> contactDetails;
	private String app;

	// for constructor injection
	public CallingApp(CellPhone phone, Map<String, Integer> contactDetails, String app) {
		super();
		this.phone = phone;
		this.contactDetails = contactDetails;
		this.app = app;
	}

	// for setter injection
	public void setPhone(CellPhone phone) {
		this.phone = phone;
	}

	public CellPhone getPhone() {
		return phone;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public Map<String, Integer> getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(Map<String, Integer> contactDetails) {
		this.contactDetails = contactDetails;
	}

	public void dialNumber() {
		phone.makeCall(contactDetails, app);
	}

}
