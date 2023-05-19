package com.cebanova.operationsandcyclicfunctions;

public class LogicalOperationsExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean result = a && b;
        System.out.println("Logic and " + result);

        // a de mai sus inca = true
        a = result && b;
        System.out.println("Logic and: " + a); // a deja a devenit = false

        // result false
        result = a || b;
        System.out.println("Logic or: " + result); // result = false, pt ca result = false si b = false

        System.out.println("Negation: " + !result); // result = true
    }
}