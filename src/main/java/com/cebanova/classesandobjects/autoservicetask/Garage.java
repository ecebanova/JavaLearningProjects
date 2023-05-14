package com.cebanova.classesandobjects.autoservicetask;

public class Garage {
    String address;
    String numberId;
    String workSchedule;
    boolean hasComputerDiagnostics;
    int carCapacity;

    Garage(String adresaDataLaCreare) {
        this.address = adresaDataLaCreare;
        System.out.println("A fost creat un garaj. Adresa garajului este " + this.address);
    }

    Garage(int carCapacity) {
        this.carCapacity = carCapacity;
        System.out.println("Garajul are capacitatea de " + this.carCapacity);
    }
}
