package com.cebanova.methodstask;

public class Customer {
    private String name;
    private int age;
    private String email;

    public Customer(String name, int age, String email) {
        this.name = name;
        this.email = email;

        if ((age <= 1) || (age > 127)) {
            System.out.println("The age is invalid");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if ((newAge <= 1) || (newAge > 127)) {
            System.out.println("The age is invalid");
            this.age = 0;
        } else {
            this.age = newAge;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}