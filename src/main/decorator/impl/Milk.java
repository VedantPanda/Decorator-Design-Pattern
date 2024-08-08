package main.decorator.impl;

import main.component.Coffee;
import main.decorator.CoffeeDecorator;

public class Milk extends CoffeeDecorator {
    Coffee coffee;
    public Milk(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public float cost(){
        return (float) (coffee.cost() + 0.2);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " Milk";
    }
}
