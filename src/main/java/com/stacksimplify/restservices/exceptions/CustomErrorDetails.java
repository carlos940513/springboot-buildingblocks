package com.stacksimplify.restservices.exceptions;

import java.util.Date;

//Create simple custom error details bean
public class CustomErrorDetails {
	
	private Date timestamp;
	private String message;
	private String errormessages;
	
	//Fields constructor
	public CustomErrorDetails(Date timestamp, String message, String errormessages) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.errormessages = errormessages;
	}

	//GETTERS
	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getErrormessages() {
		return errormessages;
	}
	
	
}
