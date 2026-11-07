package com.ocante.fundamentals.casting;

public class TypeCastingExample {

    public static void main(String[] args) {

        // Implicit conversion in to double

        long originalNumber = 9007199254740993L;
        double convertedNumber = originalNumber;

        int employee = 25;
        double convertAge = employee;

        //Explicit conversion: double to int
        double salary = 4599.99;
        int convertSalary = (int) salary;

        //Explicit conversion in to byte
        int largeNumber = 130;
        byte convertNumber = (byte) largeNumber;

        //Explicit conversion with negative value
        double negativeTemperature = -36.8;
        int convertTemperature = (int) negativeTemperature;

        System.out.println("JAVA TYPE CASTING");
        System.out.println("-----------------");

        System.out.println(convertedNumber);

        System.out.println("Original age: " + employee);
        System.out.println("Converted age: " + convertAge);

        System.out.println("Original salary: " + salary);
        System.out.println("Converted salary: " + convertSalary);

        System.out.println("Original number: " + largeNumber);
        System.out.println("Converted byte: " + convertNumber);

        System.out.println("Original Temperature: " + negativeTemperature);
        System.out.println("Converted Temperature: " + convertTemperature);

        double productPrice = 149.75;
        int integerPrice = (int) productPrice;

        int quantity = 7;
        double decimalQuantity = quantity;

        System.out.println("Product price: " + productPrice);
        System.out.println("Integer price: " + integerPrice);
        System.out.println("Decimal quantity: " + decimalQuantity);
    }
}
