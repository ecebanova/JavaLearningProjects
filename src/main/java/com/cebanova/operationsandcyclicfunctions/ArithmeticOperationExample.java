package com.cebanova.operationsandcyclicfunctions;

public class ArithmeticOperationExample {
    public static void main(String[] args) {
        int a = 43;
        int c = 3;

        // Sum
        int sum = a + c;
        System.out.println("Adunarea " + sum);
        System.out.println("Adunarea " + (a + c));

        // Subtraction
        int sub = a - c;
        System.out.println("Scaderea " + sub);
        System.out.println("Scaderea " + (a - c));

        // Multiplication
        int result = a * c;
        System.out.println("Inmultirea: " + result);
        System.out.println("Inmultirea: " + (a * c));

        // Division
        int outcome = a / c;
        System.out.println("Impartirea: " + outcome);
        System.out.println("Impartirea: " + (a / c));

        // The rest of division
        int rest = a % c;
        System.out.println("Imparirea cu rest: " + rest);
        System.out.println("Imparirea cu rest: " + (a % c));
    }
}
