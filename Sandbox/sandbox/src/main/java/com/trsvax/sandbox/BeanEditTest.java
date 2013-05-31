package com.trsvax.sandbox;

import java.util.Date;

import org.apache.tapestry5.beaneditor.DataType;
import org.apache.tapestry5.beaneditor.Validate;

public class BeanEditTest {
	
	private boolean checkbox;
	private Date dateField;
	@Validate("required")
	private String textField;
	@DataType("longtext")
	private String textArea;
	
	public boolean isCheckbox() {
		return checkbox;
	}
	public void setCheckbox(boolean checkbox) {
		this.checkbox = checkbox;
	}
	public Date getDateField() {
		return dateField;
	}
	public void setDateField(Date dateField) {
		this.dateField = dateField;
	}
	public String getTextField() {
		return textField;
	}
	public void setTextField(String textField) {
		this.textField = textField;
	}
	public String getTextArea() {
		return textArea;
	}
	public void setTextArea(String textArea) {
		this.textArea = textArea;
	}
	

}
