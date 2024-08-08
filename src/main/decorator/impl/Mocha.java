package main.decorator.impl;

import main.component.Coffee;
import main.decorator.CoffeeDecorator;

public class Mocha extends CoffeeDecorator {
    Coffee coffee;
    public Mocha(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public float cost(){
        return (float) (coffee.cost() + 0.15);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " Mocha";

    }
}
