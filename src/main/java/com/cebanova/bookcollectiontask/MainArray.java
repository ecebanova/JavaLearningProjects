package com.cebanova.bookcollectiontask;

public class MainArray {
    public static void main(String[] args) {
        int[] tablouDeDateInt = {1, 2, 3, 8, 2, 1, 5, 6, 8, 0, 2, 7, 2, 5, 3};

        System.out.println(IntNumberArrayService.getTheMinValueOfArray(tablouDeDateInt));
        System.out.println(IntNumberArrayService.getTheMinValueIndexOfArray(tablouDeDateInt));
        System.out.println(IntNumberArrayService.getTheAverageOfElements(tablouDeDateInt));
    }
}
