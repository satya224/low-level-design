package designpattern.decoratorpattern.coffee.decorator;

import designpattern.decoratorpattern.coffee.model.Coffee;

/**
 * The CoffeeDecorator class is made abstract because
 * it serves as a base class for all specific decorators (e.g., MilkDecorator, SugarDecorator)<br>
 * The CoffeeDecorator class is not meant to be instantiated directly. Its purpose is to provide common functionality and structure for concrete decorators.
 * Declaring it as abstract enforces this design, ensuring that developers cannot create instances of CoffeeDecorator directly.
 */
public abstract class CoffeeDecorator implements Coffee {
    protected final Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
}