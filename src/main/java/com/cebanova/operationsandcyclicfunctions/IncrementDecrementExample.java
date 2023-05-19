package com.cebanova.operationsandcyclicfunctions;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        int a = 5;

        // Incrementare
        a++;
        System.out.println("Valoarea dupa incrementare: " + a);

        //Incrementare prefixata
        ++a; // a = 7
        int b = ++a; // b = 8, a = 8;
        int a1 = a; // a1 = 8;
        int c = a++; // c= 8; a = 9;
        System.out.println("Valoare dupa incrementarea prefixata: " + a);
        System.out.println("Afiseaza b = " + b + "; a1= " + a1 + "; c = " + c + "; a2 = " + a);

        // Decrementare
        a--;
        System.out.println("Valoarae dupa decrementare: " + a);

        // Decrementare prefixata
        --a;
        System.out.println("Valoarae dupa decrementarea prefixata: " + a);
    }
}