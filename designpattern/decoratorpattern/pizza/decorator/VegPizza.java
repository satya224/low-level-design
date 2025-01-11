package designpattern.decoratorpattern.pizza.decorator;

import designpattern.decoratorpattern.pizza.model.Pizza;

public class VegPizza extends PizzaDecorator{
    public VegPizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Veg";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 2.00;
    }
}
