package com.cebanova.classesandobjects.autoservicetask;

public class Car {
    String plateNumber;
    String fuelType;
    String model;
    String gearboxType;
    String make;
    String color;
    int productionYear;
    int kmWhenEnteredTheService;
    double carPrice;

    Car(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
        System.out.println("In urma executiei acestui constructor cu 3 parametri, se creeaza o masina cu modelul "
                + this.model + " marca " + this.make + " culoarea " + this.color);
    }

    Car(String plateNumber) {
        this.plateNumber = plateNumber;
        System.out.println("A fost creata o masina despre care cunoastem doar Numarul de Inmatriculare - " + this.plateNumber);
    }
}