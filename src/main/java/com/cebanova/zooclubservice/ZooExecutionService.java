package com.cebanova.zooclubservice;

public class ZooExecutionService {
    public static void main(String[] args) {
        // Mai jos se aplica polimorfismul pt a declara un obiect de tip Animal cu un constructor din clasa copil Dog
        Animal dog = new Dog ("Charlie");
        Cat cat = new Cat("Mia");
        Dog VirusDog = new Dog("Virus");

        System.out.println("Numele obiectului charlieDog este: " + dog.getName());
        dog.setName("Charlie Updated");
        System.out.println("Numele obiectului actualizat este: " + dog.getName());

        // Metoda makeSound ce apartine obiectului Dog nu poate fi apelata pt ca dog este de tip Animal, iar makeSound
        // este declarata in InterfaceAnimal. Pt a fixa acest lucru, ar trebui ca interfata sa fie implementata de catre
        // clasa abstracta Animal. (dog.makeSound();).

        dog.eat();
        dog.makeSound();

        AnimalInterface rexDog = new Dog("Rex");
        rexDog.makeSound();

        Dog zikDog = new Dog("Zik");
        zikDog.eat();
        zikDog.makeSound();

        Animal foxyRoxy = new Fox("Ritza");
        foxyRoxy.makeSound();
        foxyRoxy.eat();
    }
}
