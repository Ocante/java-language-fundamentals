
package com.ocante.fundamentals.input;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EmployeeInputValidatorTest {

    private final EmployeeInputValidator validator =
            new EmployeeInputValidator();

    @Test
    void shouldParseValidAge() {
        assertEquals(35, validator.parseAge("35"));
    }

    @Test
    void shouldParseAgeWithSpaces() {
        assertEquals(28, validator.parseAge(" 28 "));
    }

    @Test
    void shouldRejectNonNumericAge() {
        assertThrows(
                IllegalArgumentException.class,
                () -> validator.parseAge("abc")
        );
    }

    @Test
    void shouldRejectNegativeAge() {
        assertThrows(
                IllegalArgumentException.class,
                () -> validator.parseAge("-5")
        );
    }

    @Test
    void shouldRejectAgeAboveMaximum() {
        assertThrows(
                IllegalArgumentException.class,
                () -> validator.parseAge("121")
        );
    }

    @Test
    void shouldAcceptMaximumAge() {
        assertEquals(120, validator.parseAge("120"));
    }

    @Test
    void shouldRejectNullAge() {
        assertThrows(
                IllegalArgumentException.class,
                () -> validator.parseAge(null)
        );
    }

    @Test
    void shouldParseValidSalary() {
        assertEquals(7200.50, validator.parseSalary("7200.50"));
    }

    @Test
    void shouldRejectNonNumericSalary() {
        assertThrows(
                IllegalArgumentException.class,
                () -> validator.parseSalary("xyz")
        );
    }

    @Test
    void shouldRejectNegativeSalary() {
        assertThrows(
                IllegalArgumentException.class,
                () -> validator.parseSalary("-100.00")
        );
    }

    @Test
    void shouldRejectInfiniteSalary() {
        assertThrows(
                IllegalArgumentException.class,
                () -> validator.parseSalary("Infinity")
        );
    }

    @Test
    void shouldRejectNaNSalary() {
        assertThrows(
                IllegalArgumentException.class,
                () -> validator.parseSalary("NaN")
        );
    }

    @Test
    void shouldRejectNullSalary() {
        assertThrows(
                IllegalArgumentException.class,
                () -> validator.parseSalary(null)
        );
    }

    @Test
    void shouldAcceptActiveStatusTrue() {
        assertTrue(validator.parseActiveStatus("true"));
    }

    @Test
    void shouldAcceptActiveStatusFalse() {
        assertFalse(validator.parseActiveStatus("false"));
    }

    @Test
    void shouldAcceptUppercaseActiveStatus() {
        assertTrue(validator.parseActiveStatus("TRUE"));
    }

    @Test
    void shouldRejectInvalidActiveStatus() {
        assertThrows(
                IllegalArgumentException.class,
                () -> validator.parseActiveStatus("yes")
        );
    }

    @Test
    void shouldRejectNullActiveStatus() {
        assertThrows(
                IllegalArgumentException.class,
                () -> validator.parseActiveStatus(null)
        );
    }
}
