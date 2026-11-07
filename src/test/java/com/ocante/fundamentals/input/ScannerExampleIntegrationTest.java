
package com.ocante.fundamentals.input;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ScannerExampleIntegrationTest {

    private String runApplication(String input) {

        InputStream originalInput = System.in;
        PrintStream originalOutput = System.out;

        ByteArrayInputStream simulatedInput =
                new ByteArrayInputStream(
                        input.getBytes(StandardCharsets.UTF_8)
                );

        ByteArrayOutputStream capturedOutput =
                new ByteArrayOutputStream();

        try {
            System.setIn(simulatedInput);

            try (PrintStream printStream = new PrintStream(
                    capturedOutput,
                    true,
                    StandardCharsets.UTF_8
            )) {
                System.setOut(printStream);

                ScannerExample.main(new String[0]);
            }

            return capturedOutput.toString(
                    StandardCharsets.UTF_8
            );

        } finally {
            System.setIn(originalInput);
            System.setOut(originalOutput);
        }
    }

    @Test
    void shouldRegisterEmployeeWithValidInput() {

        String input = String.join(
                "\n",
                "Carlos Mendes",
                "35",
                "7200.50",
                "true"
        ) + "\n";

        String output = runApplication(input);

        assertTrue(output.contains("Name: Carlos Mendes"));
        assertTrue(output.contains("Age: 35"));
        assertTrue(output.contains("Salary: 7200.5"));
        assertTrue(output.contains("Active: true"));
    }

    @Test
    void shouldRecoverFromInvalidInputs() {

        String input = String.join(
                "\n",
                "Ana Silva",
                "abc",
                "-5",
                "28",
                "xyz",
                "5500.75",
                "yes",
                "false"
        ) + "\n";

        String output = runApplication(input);

        assertTrue(output.contains("Invalid age:"));
        assertTrue(output.contains("Invalid salary:"));
        assertTrue(output.contains("Invalid status:"));

        assertTrue(output.contains("Name: Ana Silva"));
        assertTrue(output.contains("Age: 28"));
        assertTrue(output.contains("Salary: 5500.75"));
        assertTrue(output.contains("Active: false"));
    }
}
