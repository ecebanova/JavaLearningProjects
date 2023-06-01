package com.cebanova.zooclubservice;

public class Dog extends Animal{
    // Definim un constructor pentru a crea obiecte de tipul Dog cu parametrul formal de tip String Name
    public Dog(String name) {
        // Cuvantul cheie super este flosit pt apelul constructorului clasei parinte, care are nevoie de aceasta proprietate
        super(name);
    }

    // eat este o metoda declarata in clasa abstracta Animal, respectiv trebuie implementata, ea fiind abstracta acolo
    @Override
    public void eat() {
        System.out.println(this.getName() + " eats bones ");
        // metoda getName este concreta si implementata in clasa Parinte Animal
    }

    // makeSound este o metoda declarata in AnimalInterface, respectiv trebuie implementata, ea fiind abstracta acolo
    @Override
    public void makeSound() {
        System.out.println(getName() + " makes Woof Woof"); // this.getName si getName = same
    }
}