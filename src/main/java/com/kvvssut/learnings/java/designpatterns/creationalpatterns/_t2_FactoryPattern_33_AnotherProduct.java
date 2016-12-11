package com.kvvssut.learnings.java.designpatterns.creationalpatterns;

public class _t2_FactoryPattern_33_AnotherProduct implements _t2_FactoryPattern_31_Product {

	// Registration done inside the product classes
	static {
		_t2_FactoryPattern_3_WithClassRegistrationWithoutReflection.getInstance().registerProduct("Prod2",
				new _t2_FactoryPattern_33_AnotherProduct());
	}

	@Override
	public _t2_FactoryPattern_31_Product createProduct() {
		return new _t2_FactoryPattern_33_AnotherProduct();
	}

}