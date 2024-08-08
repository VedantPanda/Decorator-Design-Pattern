package main.decorator.impl;

import main.component.Coffee;
import main.decorator.CoffeeDecorator;

public class Whip extends CoffeeDecorator {
    Coffee coffee;
    public Whip(Coffee coffee){
        this.coffee = coffee;
    }

    public float cost(){
        return (float) (coffee.cost() + 0.12);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " Whip";
    }
}
