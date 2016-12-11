package com.kvvssut.learnings.java.designpatterns.creationalpatterns;

public class _t2_FactoryPattern_32_OneProduct implements _t2_FactoryPattern_31_Product {

	// Registration done inside the product classes
	static {
		_t2_FactoryPattern_3_WithClassRegistrationWithoutReflection.getInstance().registerProduct("Prod1",
				new _t2_FactoryPattern_32_OneProduct());
	}

	@Override
	public _t2_FactoryPattern_31_Product createProduct() {
		return new _t2_FactoryPattern_32_OneProduct();
	}

}