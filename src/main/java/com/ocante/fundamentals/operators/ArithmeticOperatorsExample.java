package com.ocante.fundamentals.operators;

public class ArithmeticOperatorsExample {

    public static void main(String[] args) {

        int firstNumber = 10;
        int secondNumber = 3;

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;

        double decimalDivision =
                (double) firstNumber / secondNumber;

        System.out.println("ARITHMETIC OPERATOR");
        System.out.println("---------------------");

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Remainder: " + remainder);
        System.out.println("Decimal Division: " + decimalDivision);
    }
}
