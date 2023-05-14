package com.cebanova.classesandobjects.autoservicetask;

public class Tool {
    String toolName;
    boolean needsElectricity;
    boolean isElevator;
    boolean isUsed;
    long uniqueCode;
    double weight;

    Tool(String toolName) {
        this.toolName = toolName;
        System.out.println("Un nou obiect de tip tool a fost creat, numele lui este " + this.toolName);
    }

    Tool() {
        System.out.println("O noua unealta a fost creata in cadrul programului.");
    }
}
