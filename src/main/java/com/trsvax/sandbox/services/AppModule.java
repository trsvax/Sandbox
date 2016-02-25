package com.trsvax.sandbox.services;

import org.apache.tapestry5.Binding;
import org.apache.tapestry5.BindingConstants;
import org.apache.tapestry5.ComponentResources;
import org.apache.tapestry5.internal.bindings.AbstractBinding;
import org.apache.tapestry5.ioc.Location;
import org.apache.tapestry5.ioc.MappedConfiguration;
import org.apache.tapestry5.ioc.ServiceBinder;
import org.apache.tapestry5.services.BindingFactory;
import org.slf4j.Logger;



public class AppModule {

	public static void bind(ServiceBinder binder) {
		//binder.bind(ObjectProvider.class,InterfaceObjectProvider.class).withId("InterfaceObjectProvider");
	}

	public static void contributeBindingSource(MappedConfiguration<String, BindingFactory> configuration, final Logger logger) {
		configuration.override(BindingConstants.LITERAL, new BindingFactory() {
			@Override
			public Binding newBinding(String description, ComponentResources container, ComponentResources component,
					final String expression, final Location location) {
				return new AbstractBinding(location) {
					
					
					@Override
					public void set(Object value) {
							logger.info("set {}",value);
					}
					@Override
					public Object get()
					{ 
						logger.info("get {}",expression);
						return expression; 
					}
					
				};
			}
		});
	}


}
