package com.cebanova.bookcollectiontask;

public class IntNumberArrayService {
    public static int getTheMinValueOfArray(int[] intArray) {
        int minValue = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < minValue) {
                minValue = intArray[i];
            }
        }
        return minValue;
    }

    public static int getTheMinValueIndexOfArray(int[] intArray) {
        int minValue = intArray[0];
        int index = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < minValue) {
                minValue = intArray[i];
                index = i;
            }
        }
        return index;
    }

    public static int getTheAverageOfElements(int[] intArray) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum = sum + intArray[i];
        }
        return sum / intArray.length;
    }
}