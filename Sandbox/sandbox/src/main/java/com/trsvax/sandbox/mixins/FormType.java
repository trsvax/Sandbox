package com.trsvax.sandbox.mixins;

import org.apache.tapestry5.annotations.BindParameter;
import org.apache.tapestry5.annotations.SetupRender;

public class FormType {
	@BindParameter("class")
    private String className;
	
	@SetupRender
	void setupRender() {
		className = "form-inline";
	}

}
