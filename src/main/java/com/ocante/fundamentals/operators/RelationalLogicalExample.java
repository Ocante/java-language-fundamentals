package com.ocante.fundamentals.operators;

public class RelationalLogicalExample {

    public static void main(String[] args) {

        int employeeAge = 17;
        int minimumAge = 18;

        boolean isAdult = employeeAge >= minimumAge;
        boolean isActive = true;
        boolean hasPermission = true;

        boolean canAcces = isAdult
                && isActive
                && hasPermission;

        boolean requireReview = !hasPermission;

        System.out.println("ACCESS CONTROL");
        System.out.println("----------------");

        System.out.println("Is adult: " + isAdult);
        System.out.println("Is active: " + isActive);
        System.out.println("Has permission: " + hasPermission);
        System.out.println("Can access: " + canAcces);
        System.out.println("Require review: " + requireReview);
    }
}
