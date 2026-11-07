
package com.ocante.fundamentals.validation;

public class AccessValidator {

    private static final int MINIMUM_AGE = 18;
    private static final int MAXIMUM_AGE = 120;

    public boolean isAdult(int age) {

        validateAge(age);

        return age >= MINIMUM_AGE;
    }

    public boolean canAccess(
            int age,
            boolean isActive,
            boolean hasPermission
    ) {
        return isAdult(age) && isActive && hasPermission;
    }

    public boolean requiresReview(boolean hasPermission) {
        return !hasPermission;
    }

    private void validateAge(int age) {

        if (age < 0 || age > MAXIMUM_AGE) {
            throw new IllegalArgumentException(
                    "Age must be between 0 and 120"
            );
        }
    }
}
