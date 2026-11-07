
package com.ocante.fundamentals.casting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CastingConverterTest {

    private final CastingConverter converter =
            new CastingConverter();

    @Test
    void shouldConvertIntToDouble() {
        double result = converter.convertIntToDouble(25);

        assertEquals(25.0, result);
    }

    @Test
    void shouldTruncatePositiveDecimal() {
        int result = converter.convertDoubleToInt(36.8);

        assertEquals(36, result);
    }

    @Test
    void shouldTruncateNegativeDecimal() {
        int result = converter.convertDoubleToInt(-36.8);

        assertEquals(-36, result);
    }

    @Test
    void shouldConvertIntToByteWithOverflow() {
        byte result = converter.convertIntToByte(130);

        assertEquals((byte) -126, result);
    }

    @Test
    void shouldConvertDecimalSalaryToInteger() {
        int result = converter.convertDoubleToInt(4599.99);

        assertEquals(4599, result);
    }
}
