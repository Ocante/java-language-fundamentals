
package com.ocante.fundamentals.input;

public class EmployeeInputValidator {

    public int parseAge(String input) {

        if (input == null) {
            throw new IllegalArgumentException(
                    "Age must not be null."
            );
        }

        final int age;

        try {
            age = Integer.parseInt(input.trim());
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException(
                    "Age must be a whole number.",
                    exception
            );
        }

        if (age < 0 || age > 120) {
            throw new IllegalArgumentException(
                    "Age must be between 0 and 120."
            );
        }

        return age;
    }

    public double parseSalary(String input) {

        if (input == null) {
            throw new IllegalArgumentException(
                    "Salary must not be null."
            );
        }

        final double salary;

        try {
            salary = Double.parseDouble(input.trim());
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException(
                    "Salary must be a valid number.",
                    exception
            );
        }

        if (!Double.isFinite(salary) || salary < 0) {
            throw new IllegalArgumentException(
                    "Salary must be a non-negative finite number."
            );
        }

        return salary;
    }

    public boolean parseActiveStatus(String input) {

        if (input == null) {
            throw new IllegalArgumentException(
                    "Active status must not be null."
            );
        }

        String normalizedInput = input.trim();

        if (normalizedInput.equalsIgnoreCase("true")) {
            return true;
        }

        if (normalizedInput.equalsIgnoreCase("false")) {
            return false;
        }

        throw new IllegalArgumentException(
                "Active status must be true or false."
        );
    }
}
