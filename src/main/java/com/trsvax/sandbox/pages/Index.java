package com.trsvax.sandbox.pages;

import org.apache.tapestry5.annotations.BeginRender;
import org.apache.tapestry5.annotations.CleanupRender;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.slf4j.Logger;

public class Index {
	
	@Property
	String hello;
	
	@Inject
	Logger logger;
	
	@BeginRender
	void beginRender() {
		hello = "Hello from page beginRender";
	}
	
	@CleanupRender
	void cleanupRender() {
		logger.info("Page cleanup {}",hello);
	}
}
