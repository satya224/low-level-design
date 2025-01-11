package designpattern.decoratorpattern.pizza.decorator;

import designpattern.decoratorpattern.pizza.model.Pizza;

public class CheesePizza extends PizzaDecorator{
    public CheesePizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.50;
    }
}
