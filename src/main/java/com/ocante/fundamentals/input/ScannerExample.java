
package com.ocante.fundamentals.input;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        EmployeeInputValidator validator =
                new EmployeeInputValidator();

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("EMPLOYEE REGISTRATION");
            System.out.println("---------------------");

            System.out.print("Enter employee name: ");
            String employeeName = scanner.nextLine();

            int employeeAge = readAge(scanner, validator);

            double monthlySalary = readSalary(scanner, validator);

            boolean isActive = readActiveStatus(scanner, validator);

            System.out.println();
            System.out.println("REGISTRATION SUMMARY");
            System.out.println("--------------------");

            System.out.println("Name: " + employeeName);
            System.out.println("Age: " + employeeAge);
            System.out.println("Salary: " + monthlySalary);
            System.out.println("Active: " + isActive);
        }
    }

    private static int readAge(
            Scanner scanner,
            EmployeeInputValidator validator
    ) {
        while (true) {

            System.out.print("Enter employee age: ");
            String input = scanner.nextLine();

            try {
                return validator.parseAge(input);
            } catch (IllegalArgumentException exception) {
                System.out.println(
                        "Invalid age: " + exception.getMessage()
                );
            }
        }
    }

    private static double readSalary(
            Scanner scanner,
            EmployeeInputValidator validator
    ) {
        while (true) {

            System.out.print("Enter employee monthly salary: ");
            String input = scanner.nextLine();

            try {
                return validator.parseSalary(input);
            } catch (IllegalArgumentException exception) {
                System.out.println(
                        "Invalid salary: " + exception.getMessage()
                );
            }
        }
    }

    private static boolean readActiveStatus(
            Scanner scanner,
            EmployeeInputValidator validator
    ) {
        while (true) {

            System.out.print(
                    "Is employee active (true/false)? "
            );

            String input = scanner.nextLine();

            try {
                return validator.parseActiveStatus(input);
            } catch (IllegalArgumentException exception) {
                System.out.println(
                        "Invalid status: " + exception.getMessage()
                );
            }
        }
    }
}
