package com.cebanova.accessmodifieres.peopleevidence;

public class Person {
    //Proprietati
    // This property is class related - Class Variable, it is private, it can only be accessed within the Person Class.
    private static int totalNumberOfObjects;
    // The final key word describes a non-access modifier, which means that this property will not be changed during
    // the execution, it has to be initialized once the object is created.
    private final long CNP;
    // These are instance variables, because they describe the objects of a class. Public - they can be accessed everywhere in te project.
    public String name;
    public String surname;
    public String gender;
    public String nationality;
    public String education;
    public String occupation;
    public boolean isRetired;
    // The protected property can be accessed only from classes which belong to the peopleevidence package and subclasses.
    protected String address;
    protected String emailAddress;
    protected String phone;
    // The default property can be accessed only from classes which belong to the peopleevidence package.
    boolean isMarried;
    boolean hasKids;
    // This is an instance variable, it is declared as private - it can only be accessed from Person Class.
    private int age;
    private double height;
    private double weights;

    // Constructori
    public Person(String name, String surname, long CNP) {
        this.name = name;
        this.surname = surname;
        this.CNP = CNP;
        totalNumberOfObjects++;
        System.out.println();
    }

    public Person(String name, String surname, String gender, String nationality, String education, String occupation,
                  String address, String emailAddress, String phone, boolean isMarried, boolean hasKids,
                  boolean isRetired, int age, long CNP, double height, double weights) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.nationality = nationality;
        this.education = education;
        this.occupation = occupation;
        this.address = address;
        this.emailAddress = emailAddress;
        this.phone = phone;
        this.isMarried = isMarried;
        this.hasKids = hasKids;
        this.isRetired = isRetired;
        this.age = age;
        this.CNP = CNP;
        this.height = height;
        this.weights = weights;
        totalNumberOfObjects++;
        System.out.println();
    }

    // Metode
    public static void printNumberOfPeople() {
        System.out.println("Numarul total de persoane: " + totalNumberOfObjects);
    }

//
//    public void isPersonRetired() {
//        String fullName = this.surname + this.name;
//
//        if (this.isRetired) {
//            System.out.println(fullName + " este la pensie.");
//        } else {
//            System.out.println(fullName + " nu este la pensie.");
//        }
//    }

    @Override
    public String toString() {
        return "Person{" +
                "CNP=" + CNP +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", nationality='" + nationality + '\'' +
                ", education='" + education + '\'' +
                ", occupation='" + occupation + '\'' +
                ", address='" + address + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phone='" + phone + '\'' +
                ", isMarried=" + isMarried +
                ", hasKids=" + hasKids +
                ", isRetired=" + isRetired +
                ", age=" + age +
                ", height=" + height +
                ", weights=" + weights +
                '}';
    }
}
