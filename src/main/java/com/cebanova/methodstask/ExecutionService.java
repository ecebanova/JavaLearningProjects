package com.cebanova.methodstask;

public class ExecutionService {
    public static void main(String[] args) {
        int randomInt = DataGeneratorUtil.getRandomInt(150, 350);
        System.out.println("Variabila randomInt: " + randomInt);

        int randomInt1 = DataGeneratorUtil.getRandomInt(150);
        System.out.println("Variabila randomInt1: " + randomInt1);

        double randomDouble = DataGeneratorUtil.getRandomDouble(1000.0);
        System.out.println("Variabila randomDouble: " + randomDouble);

        double randomDouble1 = DataGeneratorUtil.getRandomDouble(-1000.0);
        System.out.println("Variabila randomDouble: " + randomDouble1);

        System.out.println("Random Boolean " + DataGeneratorUtil.getRandomBoolean());

        System.out.println("Random Email 1: " + DataGeneratorUtil.getRandomEmail());
        System.out.println("Random Email 2: " + DataGeneratorUtil.getRandomEmail());

        System.out.println("Random Valid String de X chars 1: " + DataGeneratorUtil.generateValidRandomString(256));
        System.out.println("Random Valid String de X chars 2: " + DataGeneratorUtil.generateValidRandomString(257));
        System.out.println("Random Invalid String de X chars: " + DataGeneratorUtil.generateInvalidRandomString(5));

        Customer vasileConsumer = new Customer("Vasile Cobol", 35, "vasile.cobol@gmail.com");
        System.out.println("Nume obiect Vasile: " + vasileConsumer.getName());
        System.out.println("Varsta obiect Vasile: " + vasileConsumer.getAge());
        System.out.println("Email obiect Vasiel: " + vasileConsumer.getEmail());

        vasileConsumer.setName("Radu Bolocea");
        vasileConsumer.setAge(45);
        vasileConsumer.setEmail("radu.bolocea@gmail.com");

        System.out.println("Nume obiect actualizat: " + vasileConsumer.getName());
        System.out.println("Varsta obiect actualizat: " + vasileConsumer.getAge());
        ;
        System.out.println("Email obiect actualizat: " + vasileConsumer.getEmail());

        Customer randomDataCustomer = new Customer(
                DataGeneratorUtil.generateValidRandomString(12),
                DataGeneratorUtil.getRandomInt(127),
                DataGeneratorUtil.getRandomEmail()
        );
        System.out.println(randomDataCustomer.toString());
        randomDataCustomer.setName(DataGeneratorUtil.generateValidRandomString(6));
        randomDataCustomer.setAge(DataGeneratorUtil.getRandomInt(18, 64));
        randomDataCustomer.setEmail(DataGeneratorUtil.getRandomEmail());

        System.out.println(randomDataCustomer.toString());
    }
}