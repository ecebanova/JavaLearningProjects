package com.cebanova.exceptionsservicetask;

// Exceptii neverificate
public class ArithmeticOperationService {
    public static int divideInt(int a, int b) {
        return a / b;
    }

    public static int divideIntNoExceptionHandling(int a, int b) {
        return a / b;
    }

    public static int divideIntWithExceptionHandling(int a, int b) {
        try {
            int result = a / b;
            return result;
        } catch (Exception capturedException) {
            System.out.println("An exception has occurred: " + capturedException.getMessage());
            return 0;
        }
    }
}