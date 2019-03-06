package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InitialCalculationTest {

    @Test
    public void initialCalculationTwoWordsName() {
        InitialCalculation service = new InitialCalculation();
        String name = "Ivan Petrov";

        String actual = service.getInitials(name);

        assertEquals("IP", actual);
    }

    @Test
    public void initialCalculationThreeWordsName() {
        InitialCalculation service = new InitialCalculation();
        String name = "Huan Pedro Rodriges";

        String actual = service.getInitials(name);

        assertEquals("HR", actual);
    }

    @Test
    public void initialCalculationOneWordName() {
        InitialCalculation service = new InitialCalculation();
        String name = "Ivan";

        String actual = service.getInitials(name);

        assertEquals("I", actual);
    }

    @Test
    public void initialCalculationTwoWordsNameSmall() {
        InitialCalculation service = new InitialCalculation();
        String name = "ivan petrov";

        String actual = service.getInitials(name);

        assertEquals("IP", actual);

    }
}