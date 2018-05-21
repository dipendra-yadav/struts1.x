package com.deependra.common.form;

import org.apache.struts.action.ActionForm;

// ActionForm  class
public class HelloWorldForm extends ActionForm {

	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}