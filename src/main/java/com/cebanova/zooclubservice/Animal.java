package com.cebanova.zooclubservice;

//Clasa Animal este dedicata procesului de mostenire, constructorul Animal nu trebuie folosit pentru initializarea obiecteor.
public abstract class Animal implements AnimalInterface {
    // Variabila de instanta nume va fi accesibila doar in clasa Animal deoarece e privata.
    private String name;

    // Constructorul cu un parametru va permite setarea unui nume pentru absolut toate animalele create in cadrul programului.
    protected Animal(String name) {
        this.name = name;
    }

    // Metoda getName este de tip public si returneaza valoarea numelui pe care il poseda animalul.
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Metoda abstracta eat() nu are implementare, aceasta va fi facuta in clasele copil
    public abstract void eat();
}