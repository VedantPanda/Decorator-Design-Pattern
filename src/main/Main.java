package main;

import main.component.Coffee;
import main.component.impl.DarkRoast;
import main.decorator.*;
import main.decorator.impl.Milk;
import main.decorator.impl.Mocha;
import main.decorator.impl.Soy;
import main.decorator.impl.Whip;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new DarkRoast();
        CoffeeDecorator coffeeDecorator = new Soy(coffee);
        coffeeDecorator = new Mocha(coffeeDecorator);
        coffeeDecorator = new Whip(coffeeDecorator);
        coffeeDecorator = new Milk(coffeeDecorator);
        System.out.println(coffeeDecorator.getDescription() + " : "+ coffeeDecorator.cost());
    }
}
