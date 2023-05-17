package com.cebanova.accessmodifieres;

import com.cebanova.accessmodifieres.peopleevidence.Person;

public class ChisinauEvidenceCatalog {

    public static void main(String[] args) {
        Person vasileP = new Person("P", "Vasile", "masculin", "moldoveneasca",
                "studii superioare", "CTO", "Bvd. Stefan cel Mare si Sfant 200",
                "vasile.p@gmail.com", "+37368777777", true, true, false,
                40, 1002003004060L, 1.86, 90.5);
        System.out.println("Detaliile despre prima persoana sunt: ");
        System.out.println(vasileP.toString());
        if (vasileP.isRetired) {
            System.out.println("Vasile sete la pensie.");
        } else {
            System.out.println("Vasile nu este la pensie.");
        }
        Person.printNumberOfPeople();
//        vasileP.isPersonRetired();

        Person adrianC = new Person("C", "Adrian", 100200300400500L);
        adrianC.gender = "masculin";
        adrianC.nationality = "moldoveneasca";
        adrianC.education = "studii superioare";
        adrianC.occupation = "Scrum master";
        adrianC.isRetired = true;
        System.out.println("Detaliile despre a doua persoana sunt: ");
        System.out.println(adrianC.toString());
        if (adrianC.isRetired) {
            System.out.println("Adrian este la pensie.");
        } else {
            System.out.println("Adrian nu este la pensie.");
        }
        Person.printNumberOfPeople();

        Person teddySwims = new Person("Swims", "Teddy", 1002003006050L);
        teddySwims.gender = "masculin";
        teddySwims.education = "studii medii";
        teddySwims.occupation = "artist";
        teddySwims.nationality = "americana";
        teddySwims.isRetired = false;
        System.out.println("Detaliile despre a treia persoana sunt: ");
        System.out.println(teddySwims.toString());
        if (teddySwims.isRetired) {
            System.out.println("Teddy este la pensie.");
        } else {
            System.out.println("Teddy nu este la pensie.");
        }
        Person.printNumberOfPeople();

        Person ecaterinaP = new Person("P", "Ecaterina", 1002003006080L);
        ecaterinaP.gender = "feminin";
        ecaterinaP.nationality = "moldoveneasca";
        ecaterinaP.education = "studii superioare";
        ecaterinaP.occupation = "contabil";
        ecaterinaP.isRetired = true;
        System.out.println("Detaliile despre a patra persoana sunt: ");
        System.out.println(ecaterinaP.toString());
        if (ecaterinaP.isRetired) {
            System.out.println("Ecaterina este la pensie.");
        } else {
            System.out.println("Ecaterina nu este la pensie.");
        }
        Person.printNumberOfPeople();

        Person rodicaL = new Person("L", "Rodica", 1002003006060L);
        rodicaL.gender = "feminin";
        rodicaL.nationality = "moldoveneasca";
        rodicaL.occupation = "marketolog";
        rodicaL.education = "studii medii";
        rodicaL.isRetired = true;
        System.out.println("Detaliile despre a cincea persoana sunt: ");
        System.out.println(rodicaL.toString());
        if (rodicaL.isRetired) {
            System.out.println("Rodica este la pensie.");
        } else {
            System.out.println("Rodica nu este la pensie.");
        }
        Person.printNumberOfPeople();
    }
}
