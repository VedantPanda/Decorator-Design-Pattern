package main.decorator.impl;

import main.component.Coffee;
import main.decorator.CoffeeDecorator;

public class Soy extends CoffeeDecorator {
    Coffee coffee;
    public Soy(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public float cost(){
        return (float) (coffee.cost() + 0.05);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " Soy";

    }
}
