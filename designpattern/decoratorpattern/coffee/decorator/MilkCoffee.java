package designpattern.decoratorpattern.coffee.decorator;

import designpattern.decoratorpattern.coffee.model.Coffee;

public class MilkCoffee extends CoffeeDecorator {
    public MilkCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
//        this.coffee.getCost();
        return super.getCost() + 10.0;
    }
}