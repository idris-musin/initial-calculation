package ru.itpark;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class InitialCalculationTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/initials.csv", numLinesToSkip = 1)
    void getInitials(String input, String expected) {
        InitialCalculation service = new InitialCalculation();

        String actual = service.getInitials(input);

        assertEquals(expected, actual);
    }
}