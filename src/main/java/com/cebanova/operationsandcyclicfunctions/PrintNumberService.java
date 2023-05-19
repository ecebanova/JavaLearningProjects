package com.cebanova.operationsandcyclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        int a = 500;
        int limit = 500;

        //Instructiunea ciclica while
        while (a > 0) {
            System.out.print(a + ", ");
            a--; // a = a - 1; // a -= 1;
        }

        //Valoare lui a dupa ce iese din ciclu este 0
        System.out.println(); // Ca sa inceapa a scrie din rand nou

        //Instructiunea ciclica do while
        do {
            System.out.print(a + ", ");
            a++; //a = a + 1;
        } while (a < limit);

        System.out.println();

        //Instructiunea ciclica for
        for (int i = 1; i <= limit; i++) {
            System.out.print(i + ", ");
        }

        System.out.println();

        // Printam numerele pare si impare cu ajutorul instructiunii ciclice for
        for (int i = 1; i <= limit; i++) {
            if ((i % 2) == 0) {
                System.out.print(i + ", ");
            } else {
                System.out.print("[], ");
            }
        }
    }
}