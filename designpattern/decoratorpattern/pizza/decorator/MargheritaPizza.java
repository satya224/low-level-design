package designpattern.decoratorpattern.pizza.decorator;

import designpattern.decoratorpattern.pizza.model.Pizza;

public class MargheritaPizza extends PizzaDecorator {
    public MargheritaPizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Margherita";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.00;
    }
}
