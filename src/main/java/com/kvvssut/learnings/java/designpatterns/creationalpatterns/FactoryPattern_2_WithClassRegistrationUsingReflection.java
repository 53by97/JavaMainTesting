package com.kvvssut.learnings.java.designpatterns.creationalpatterns;

public class FactoryPattern_2_WithClassRegistrationUsingReflection {

	/*
	 * The standard implementation is the most simple and intuitive (Let's call
	 * it noob implementation). The problem here is that once we add a new
	 * concrete product call we should modify the Factory class. It is not very
	 * flexible and it violates open close principle. Of course we can subclass
	 * the factory class, but let's not forget that the factory class is usually
	 * used as a singleton. Sub-classing it means replacing all the factory
	 * class references everywhere through the code.
	 * 
	 * Class Registration - using reflection -
	 * 
	 * If we can use reflection, we can register new product classes to the
	 * factory without even changing the factory itself. For creating objects
	 * inside the factory class without knowing the object type we keep a map
	 * between the productID and the class type of the product. In this case
	 * when a new product is added to the application it has to be registered to
	 * the factory. This operation doesn't require any change in the factory
	 * class code.
	 * 
	 */

	public class ProductFactory {

		public Product createProduct(String productId) {
			if (productId.equals("prod1")) {
				return new OneProduct();
			} else if (productId.equals("prod2")) {
				return new AnotherProduct();
			}
			// so on for the other Ids

			return null; // if the id doesn't have any of the expected values
		}

	}

	public interface Product {
		public String getProductId();
	}

	public class OneProduct implements Product {

		@Override
		public String getProductId() {
			return "prod1";
		}

	}

	public class AnotherProduct implements Product {

		@Override
		public String getProductId() {
			return "prod2";
		}

	}

	/*
	 * Applicability & Examples - For example a graphical application works with
	 * shapes. In our implementation the drawing framework is the client and the
	 * shapes are the products. All the shapes are derived from an abstract
	 * shape class (or interface). The Shape class defines the draw and move
	 * operations which must be implemented by the concrete shapes. Let's assume
	 * a command is selected from the menu to create a new Circle. The framework
	 * receives the shape type as a string parameter, it asks the factory to
	 * create a new shape sending the parameter received from menu. The factory
	 * creates a new circle and returns it to the framework, casted to an
	 * abstract shape. Then the framework uses the object as casted to the
	 * abstract class without being aware of the concrete object type.
	 * 
	 * The advantage is obvious: New shapes can be added without changing a
	 * single line of code in the framework(the client code that uses the shapes
	 * from the factory).
	 * 
	 * This implementation is the most simple and intuitive (Let's call it noob
	 * implementation). The problem here is that once we add a new concrete
	 * product call we should modify the Factory class. It is not very flexible
	 * and it violates open close principle. Of course we can subclass the
	 * factory class, but let's not forget that the factory class is usually
	 * used as a singleton. Sub-classing it means replacing all the factory
	 * class references everywhere through the code.
	 */

}
