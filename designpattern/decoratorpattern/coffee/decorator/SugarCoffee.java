package designpattern.decoratorpattern.coffee.decorator;

import designpattern.decoratorpattern.coffee.model.Coffee;

public class SugarCoffee extends CoffeeDecorator {
    public SugarCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return super.getCost() + 5.0;
    }
}