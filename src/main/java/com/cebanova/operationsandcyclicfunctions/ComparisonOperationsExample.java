package com.cebanova.operationsandcyclicfunctions;

public class ComparisonOperationsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Egal cu
        boolean isEqual = a == b;
        System.out.println("Egal cu " + isEqual);

        // Diferit de
        boolean isNotEqual = a != b;
        System.out.println(" Diferit de: " + isNotEqual);

        // Mai mare decat
        boolean isGreaterThan = a < b;
        System.out.println(" Mai mare decat: " + isGreaterThan);

        // Mai mic decat
        boolean isLessThan = a > b;
        System.out.println("Mai mic decat: " + isLessThan);

        // Mai mare sau egal decat
        boolean isGreaterThanOrEqualTo = a < b;
        System.out.println(" Mai mare deact sau egal cu: " + isGreaterThanOrEqualTo);

        // Mai mic sau egal
        boolean isLessThanOrEqualTo = a > b;
        System.out.println("Mai mic decat sau egal cu: " + isLessThanOrEqualTo);
    }
}
