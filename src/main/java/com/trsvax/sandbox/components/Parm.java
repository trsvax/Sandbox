package com.trsvax.sandbox.components;

import org.apache.tapestry5.annotations.CleanupRender;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SetupRender;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.slf4j.Logger;


public class Parm {
	
	@Parameter("literal:HelloDefault")
	@Property
	String test;
	
	@Inject
	private Logger logger;
	
	@SetupRender
	void SetupRender() {
		for ( int i = 0; i< 10; i++) {
			logger.info("Component Setup {}",test);
		}
	}
	
	@CleanupRender
	void CleanUpRender() {
		logger.info("Component cleanup {}",test);

	}
	

}
