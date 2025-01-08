package ch4_factory_pattern.FactoryMethod;

//PizzaStore is now abstract
public abstract class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza;
		// createPizza is back rather than the factory object
		pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	// Factory Method is now abstract in Pizza Store
	abstract Pizza createPizza(String type);

}
