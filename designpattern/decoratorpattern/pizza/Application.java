package designpattern.decoratorpattern.pizza;

import designpattern.decoratorpattern.pizza.decorator.CheesePizza;
import designpattern.decoratorpattern.pizza.decorator.MargheritaPizza;
import designpattern.decoratorpattern.pizza.decorator.VegPizza;
import designpattern.decoratorpattern.pizza.model.BasePizza;
import designpattern.decoratorpattern.pizza.model.Pizza;

public class Application {
    public static void main(String[] args) {
        Pizza pizza = new VegPizza(new CheesePizza(new MargheritaPizza(new BasePizza())));
        System.out.println(pizza.getDescription() + " -> ₹" + pizza.getCost());

        Pizza pizza2 = new CheesePizza(new MargheritaPizza(new BasePizza()));
        System.out.println(pizza2.getDescription() + " -> ₹" + pizza2.getCost());

        Pizza pizza3 = new MargheritaPizza(new BasePizza());
        System.out.println(pizza3.getDescription() + " -> ₹" + pizza3.getCost());

        Pizza pizza4 = new CheesePizza(new CheesePizza(new VegPizza(new BasePizza())));
        System.out.println(pizza4.getDescription() + " -> ₹" + pizza4.getCost());
    }
}
