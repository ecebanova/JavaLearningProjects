package com.cebanova.classesandobjects.autoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {
        // Declararea si initializarea obiectelor folosind toate tipurile de constructori

        // Constructor cu parametri:
        Garage acoolaService = new Garage(20);
        acoolaService.address = "Alba Iulia 30";
        acoolaService.numberId = "2";
        acoolaService.workSchedule = "Luni-Vineri, 10:00-18:00";
        acoolaService.hasComputerDiagnostics = true;

        System.out.println("AcoolaService are urmatoarele proprietati: Adresa: " + acoolaService.address + "; Numarul: "
                + acoolaService.numberId + "; Programul de lucru: " + acoolaService.workSchedule
                + "; Diagnosticare Computerizata: " + acoolaService.hasComputerDiagnostics + "; Capacitatea: "
                + acoolaService.carCapacity);

        Garage helpAuto = new Garage("Ion Creanga 20");
        helpAuto.numberId = "1";
        helpAuto.workSchedule = "Non stop";
        helpAuto.hasComputerDiagnostics = true;
        helpAuto.carCapacity = 10;

        System.out.println("helpAuto are urmatoarele proprietati: Adresa: " + helpAuto.address + "; Numarul: "
                + helpAuto.numberId + "; Programul de lucru: " + helpAuto.workSchedule
                + "; Diagnosticare Computerizata: " + helpAuto.hasComputerDiagnostics + "; Capacitatea: "
                + helpAuto.carCapacity);

        Car ferrari = new Car("ferrari", "488 GTB", "black");
        ferrari.kmWhenEnteredTheService = 50000;
        ferrari.productionYear = 2022;
        ferrari.fuelType = "gasoline";
        ferrari.gearboxType = "automatic";
        ferrari.carPrice = 459690;
        ferrari.plateNumber = "FFF 000";

        System.out.println("A fost creata o masina noua cu urmatoarele proprietati: Marca: " + ferrari.make + "; Modelul: "
                + ferrari.model + "; Culoarea: " + ferrari.color + "; KM la bord: " + ferrari.kmWhenEnteredTheService
                + "; Anul producerii: " + ferrari.productionYear + "; Tipul combustibilului: " + ferrari.fuelType
                + "; Tipul cutiei de viteze: " + ferrari.gearboxType + "; Pretul masinii: " + ferrari.carPrice
                + "; Numarul de inmatriculare " + ferrari.plateNumber);

        Car suzuki = new Car("SSS 000");
        suzuki.make = "suzuki";
        suzuki.model = "Jimny";
        suzuki.color = "yellow";
        suzuki.kmWhenEnteredTheService = 90000;
        suzuki.productionYear = 2021;
        suzuki.fuelType = "gasoline";
        suzuki.gearboxType = "automatic";
        suzuki.carPrice = 30490;

        System.out.println("A fost creata o masina noua cu urmatoarele proprietati: Marca: " + suzuki.make + "; Modelul: "
                + suzuki.model + "; Culoarea: " + suzuki.color + "; KM la bord: " + suzuki.kmWhenEnteredTheService
                + "; Anul producerii: " + suzuki.productionYear + "; Tipul combustibilului: " + suzuki.fuelType
                + "; Tipul cutiei de viteze: " + suzuki.gearboxType + "; Pretul masinii: " + suzuki.carPrice
                + "; Numarul de inmatriculare " + suzuki.plateNumber);

        Tool compressor = new Tool("compressor");
        compressor.weight = 1.5;
        compressor.uniqueCode = 121212121;
        compressor.needsElectricity = true;

        System.out.println("A fost creata o unealta cu urmatoarele particularitati: Nume: " + compressor.toolName
                + "; Codul de inventariere: " + compressor.uniqueCode + "; Electric:" + compressor.needsElectricity);

        // Constructor fara parametri:
        Tool elevator = new Tool();

        // Constructor cu parametri predefiniti:
        Worker vasile = new Worker();
    }
}
