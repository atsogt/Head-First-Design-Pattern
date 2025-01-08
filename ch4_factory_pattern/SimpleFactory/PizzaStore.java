package ch4_factory_pattern;

public class PizzaStore {
	// reference to factory
	SimplePizzaFactory factory;

	// client of pizza factory, passing factory in through constructor
	// also there is a opportunity to create different factories in the future...
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}

	public Pizza orderPizza(String type) {
		Pizza pizza;
		// we now have access to createPizza method from factory
		// we also replace the 'new' concrete instantiation with a clean method call
		pizza = factory.createPizza(type);
		//
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
