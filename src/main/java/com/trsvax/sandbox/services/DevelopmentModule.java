package com.trsvax.sandbox.services;

import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.ioc.MappedConfiguration;
import org.apache.tapestry5.ioc.ServiceBinder;

/**
 * This module is automatically included as part of the Tapestry IoC Registry if <em>tapestry.execution-mode</em>
 * includes <code>development</code>.
 */
public class DevelopmentModule {

	public static void bind(ServiceBinder binder) {
	}
	
    public static void contributeApplicationDefaults(MappedConfiguration<String, Object> configuration) {

        configuration.add(SymbolConstants.PRODUCTION_MODE, false);

        //configuration.override(SymbolConstants.APPLICATION_VERSION, "1.0-SNAPSHOT-DEV");
       
    }
}
