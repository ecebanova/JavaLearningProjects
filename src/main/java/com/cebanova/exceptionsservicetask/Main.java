package com.cebanova.exceptionsservicetask;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Exceptii neverificate

//        int result = ArithmeticOperationService.divideInt(10, 0);
//        System.out.println(result);
//        System.out.println("The program is running till the end");

        int resultWithHandling = ArithmeticOperationService.divideIntWithExceptionHandling(10, 0);
        System.out.println(resultWithHandling);
        System.out.println("The program is running till the end");

//        int resultNoHandling = ArithmeticOperationService.divideIntNoExceptionHandling(10, 0);
//        System.out.println(resultNoHandling);
//        System.out.println("The program is running till the end");

        String stringValue = "Gheorghe";
        String stringValue2 = null;

        System.out.println(TextManager.getTheTextLengthWithTryCatchFinally(stringValue2));
        System.out.println(TextManager.getTheTextLength(stringValue));

        String stringValueIfElse = "Vasile";
        System.out.println(TextManager.getTheTextLengthIfElse(stringValueIfElse));
        System.out.println(TextManager.getTheTextLengthIfElse(null));

        // Exceptii verificate

        String filePath = "src/main/java/com/cebanova/exceptionsservicetask/test.txt";
        try {
            ReadDataManager.readDataFromFileWithoutTryAndCatch(filePath);
        } catch (IOException exceptionObject) {
            System.out.println("The file does not exist, the execution of the program is not interrupted");
        }
        finally {
            System.out.println("This block is always executed");
        }
        System.out.println("The program is running");

        ReadDataManager.readDataFromFileWithTryAndCatch(filePath);
    }
}