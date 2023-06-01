package com.cebanova.exceptionsservicetask;

// Exceptii neverificate
public class TextManager {
    public static int getTheTextLength(String inputString) {
        return inputString.length();
    }

    public static int getTheTextLengthWithTryCatchFinally(String inputString) {
        try {
            return inputString.length();
        } catch (NullPointerException capturedExceptionInTryBlock) {
            System.out.println("An exception has been captured with the following message: " +
                    capturedExceptionInTryBlock.getMessage());
            return 0;
        } finally {
            System.out.println("This block is executed regardless if an exception was captured or not");
        }
    }

    public static int getTheTextLengthIfElse(String inputString) {
        if (inputString == null) {
            System.out.println("Input string is a null value");
            return 0;
        } else {
            return inputString.length();
        }
    }
}