package com.kvvssut.learnings.java.designpatterns.creationalpatterns;

public class _t2_FactoryPattern_22_OneProduct implements _t2_FactoryPattern_21_Product {

	// Registration done inside the product classes
	static {
		_t2_FactoryPattern_2_WithClassRegistrationUsingReflection.getInstance().registerProduct("Prod1",
				_t2_FactoryPattern_22_OneProduct.class);
	}

}