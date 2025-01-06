import ch4_factory_pattern.pizzas.CheesePizza;
import ch4_factory_pattern.pizzas.ClamPizza;
import ch4_factory_pattern.pizzas.PepperoniPizza;
import ch4_factory_pattern.pizzas.VeggiePizza;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
