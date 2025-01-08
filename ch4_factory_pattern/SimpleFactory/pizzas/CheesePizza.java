package ch4_factory_pattern.pizzas;

import ch4_factory_pattern.SimpleFactory.Pizza;

//all variations of pizzas are concrete classes of pizza
public class CheesePizza extends Pizza {
	public CheesePizza() {
		name = "Cheese Pizza";
		dough = "Regular Crust";
		sauce = "Marinara Pizza Sauce";
		toppings.add("Fresh Mozzarella");
		toppings.add("Parmesan");
	}
}
