package designpattern.decoratorpattern;

import designpattern.decoratorpattern.decorator.MilkDecorator;
import designpattern.decoratorpattern.decorator.SugarDecorator;
import designpattern.decoratorpattern.model.BasicCoffee;
import designpattern.decoratorpattern.model.Coffee;

public class Application {
    public static void main(String[] args) {
        Coffee basicCoffee = new BasicCoffee();
        System.out.println(basicCoffee.getDescription() + " -> ₹" + basicCoffee.getCost());

        Coffee milkCoffee = new MilkDecorator(basicCoffee);
        System.out.println(milkCoffee.getDescription() + " -> ₹" + milkCoffee.getCost());

        Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
        System.out.println(sugarMilkCoffee.getDescription() + " -> ₹" + sugarMilkCoffee.getCost());
    }
}