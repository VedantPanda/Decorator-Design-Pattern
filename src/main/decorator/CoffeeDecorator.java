package main.decorator;

import main.component.Coffee;

public abstract class CoffeeDecorator extends Coffee {
    public abstract String getDescription();
}
