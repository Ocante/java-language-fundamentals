
package com.ocante.fundamentals.validation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AccessValidatorTest {

    private final AccessValidator validator =
            new AccessValidator();

    @Test
    void shouldRejectEmployeeUnderMinimumAge() {
        assertFalse(validator.isAdult(17));
    }

    @Test
    void shouldAcceptEmployeeAtMinimumAge() {
        assertTrue(validator.isAdult(18));
    }

    @Test
    void shouldAcceptEmployeeAboveMinimumAge() {
        assertTrue(validator.isAdult(19));
    }

    @Test
    void shouldDenyAccessWhenEmployeeIsUnderage() {
        assertFalse(validator.canAccess(17, true, true));
    }

    @Test
    void shouldAllowAccessAtMinimumAge() {
        assertTrue(validator.canAccess(18, true, true));
    }

    @Test
    void shouldDenyAccessWhenEmployeeIsInactive() {
        assertFalse(validator.canAccess(25, false, true));
    }

    @Test
    void shouldDenyAccessWithoutPermission() {
        assertFalse(validator.canAccess(25, true, false));
    }

    @Test
    void shouldAllowAccessWhenAllConditionsAreMet() {
        assertTrue(validator.canAccess(25, true, true));
    }

    @Test
    void shouldRequireReviewWithoutPermission() {
        assertTrue(validator.requiresReview(false));
    }

    @Test
    void shouldNotRequireReviewWithPermission() {
        assertFalse(validator.requiresReview(true));
    }


    @Test
    void shouldThrowExceptionForNegativeAge() {
        assertThrows(
                IllegalArgumentException.class,
                () -> validator.isAdult(-1)
        );
    }


    @Test
    void shouldAcceptZeroAgeAsValid() {
        assertFalse(validator.isAdult(0));
    }

    @Test
    void shouldAcceptMaximumAge() {
        assertTrue(validator.isAdult(120));
    }

    @Test
    void shouldThrowExceptionAboveMaximumAge() {
        assertThrows(
                IllegalArgumentException.class,
                () -> validator.isAdult(121)
        );
    }

    @Test
    void shouldThrowExceptionForInvalidAgeDuringAccess() {
        assertThrows(
                IllegalArgumentException.class,
                () -> validator.canAccess(-1, true, true)
        );
    }


}
