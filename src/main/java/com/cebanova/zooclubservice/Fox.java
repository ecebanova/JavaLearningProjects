package com.cebanova.zooclubservice;

public class Fox extends Animal{
    public Fox(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " eats chickens.");
    }

    @Override
    public void makeSound(){
        System.out.println(this.getName() + " says woa woaa!");
    }
}