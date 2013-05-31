package com.trsvax.sandbox.components;

import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.internal.InternalConstants;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;

/**
 * Layout component for pages of application sandbox.
 */

@Import( stack = { InternalConstants.CORE_STACK_NAME }, stylesheet={ "${tapestry.bootstrap-root}/css/bootstrap-responsive.css"}) 

public class Layout
{
    @Inject 
    private JavaScriptSupport jsSupport; 
  
    void afterRender() { 
        jsSupport.require("bootstrap"); 
    } 
    
}
