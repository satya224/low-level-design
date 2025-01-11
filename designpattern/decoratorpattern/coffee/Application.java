package designpattern.decoratorpattern.coffee;

import designpattern.decoratorpattern.coffee.decorator.MilkCoffee;
import designpattern.decoratorpattern.coffee.decorator.SugarCoffee;
import designpattern.decoratorpattern.coffee.model.BasicCoffee;
import designpattern.decoratorpattern.coffee.model.Coffee;

public class Application {
    public static void main(String[] args) {
        Coffee basicCoffee = new BasicCoffee();
        System.out.println(basicCoffee.getDescription() + " -> ₹" + basicCoffee.getCost());

        Coffee milkCoffee = new MilkCoffee(basicCoffee);
        System.out.println(milkCoffee.getDescription() + " -> ₹" + milkCoffee.getCost());

        Coffee sugarMilkCoffee = new SugarCoffee(milkCoffee);
        System.out.println(sugarMilkCoffee.getDescription() + " -> ₹" + sugarMilkCoffee.getCost());
    }
}