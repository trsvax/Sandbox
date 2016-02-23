package com.trsvax.sandbox.mixins;

import org.apache.tapestry5.annotations.BeginRender;
import org.apache.tapestry5.annotations.BindParameter;

public class ParmMixin {
	
	@BindParameter
	String test;
	
	@BeginRender
	void beginRender() {
		test = "Hello Mixin";
	}

}
