package com.trsvax.sandbox.services;

import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.ioc.MappedConfiguration;
import org.apache.tapestry5.ioc.annotations.Contribute;
import org.apache.tapestry5.ioc.annotations.SubModule;
import org.apache.tapestry5.ioc.services.ApplicationDefaults;
import org.apache.tapestry5.ioc.services.SymbolProvider;
import org.apache.tapestry5.services.compatibility.Compatibility;
import org.apache.tapestry5.services.compatibility.Trait;

import com.trsvax.bootstrap.services.BootstrapModule;

/**
 * This module is automatically included as part of the Tapestry IoC Registry, it's a good place to
 * configure and extend Tapestry, or to place your own service definitions.
 */
@SubModule({BootstrapModule.class})
public class AppModule
{
   @Contribute(SymbolProvider.class)
    @ApplicationDefaults
    public static void contributeApplicationDefaults(MappedConfiguration<String, Object> configuration) {   
       configuration.add(SymbolConstants.JAVASCRIPT_INFRASTRUCTURE_PROVIDER, "jquery");

        configuration.add(SymbolConstants.SUPPORTED_LOCALES, "en");
        configuration.add(SymbolConstants.PRODUCTION_MODE, "false");
        configuration.add(SymbolConstants.APPLICATION_VERSION, "0.0.2-SNAPSHOT");        
       configuration.add(SymbolConstants.HMAC_PASSPHRASE,"test");       
     }
     
    @Contribute(Compatibility.class)
    public static void disableScriptaculous(MappedConfiguration<Trait, Boolean> configuration) {
    	configuration.add(Trait.SCRIPTACULOUS, false);
        configuration.add(Trait.INITIALIZERS, false);
    }
}
