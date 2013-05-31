package com.trsvax.sandbox.pages;

import java.util.ArrayList;
import java.util.List;

import org.apache.tapestry5.SelectModel;
import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.ValueEncoder;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SetupRender;
import org.apache.tapestry5.ioc.Messages;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.ioc.annotations.Symbol;
import org.apache.tapestry5.ioc.services.TypeCoercer;
import org.apache.tapestry5.util.EnumSelectModel;
import org.apache.tapestry5.util.EnumValueEncoder;

import com.trsvax.sandbox.entities.User;

/**
 * Start page of application sandbox.
 */
public class Index
{
	
	@Inject
	@Property
	@Symbol(SymbolConstants.JAVASCRIPT_INFRASTRUCTURE_PROVIDER)
	private String provider;
	
	@Property
	private List<User> users;
	
	@Property
	private User user;
	
	@SetupRender
	void setupRender() {
		users = new ArrayList<User>();
		User user = new User();
		user.setFirstName("Barry");
		user.setLastName("Books");
		for ( int i = 0; i < 20; i++) {
			users.add(user);
		}
		selected = new ArrayList<Index.SpecialHandling>();
	}
	
	public enum SpecialHandling
	{
	    EXPRESS_SERVICE, GIFT_WRAP, GIFT_BASKET, CUSTOM_ENGRAVING, SHIPPING_INSURANCE,
	    EXTENDED_WARRANTY
	}
	
	
	@Property
    @Persist
    private List<SpecialHandling> handling;
	
	@Property
	private List<SpecialHandling> selected;

    @Inject
    private Messages messages;
	
	@Inject
    private TypeCoercer typeCoercer;
    
    @Property
    private final ValueEncoder<SpecialHandling> encoder = new EnumValueEncoder(typeCoercer, SpecialHandling.class);

    @Property
    private final SelectModel model = new EnumSelectModel(SpecialHandling.class, messages);
	
}
