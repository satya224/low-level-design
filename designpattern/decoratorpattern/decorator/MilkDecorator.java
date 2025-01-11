package designpattern.decoratorpattern.decorator;

import designpattern.decoratorpattern.model.Coffee;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        this.coffee.getCost();
        return super.getCost() + 10.0;
    }
}