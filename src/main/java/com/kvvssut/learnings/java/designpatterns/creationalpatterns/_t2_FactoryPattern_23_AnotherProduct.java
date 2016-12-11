package com.kvvssut.learnings.java.designpatterns.creationalpatterns;

public class _t2_FactoryPattern_23_AnotherProduct implements _t2_FactoryPattern_21_Product {

	// Registration done inside the product classes
	static {
		_t2_FactoryPattern_2_WithClassRegistrationUsingReflection.getInstance().registerProduct("Prod2",
				_t2_FactoryPattern_23_AnotherProduct.class);
	}

}