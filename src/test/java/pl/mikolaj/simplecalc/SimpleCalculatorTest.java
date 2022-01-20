package pl.mikolaj.simplecalc;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SimpleCalculatorTest {

    @Test
    public void testAdd() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(5,calculator.add(2,3));

        assertThrows(Exception.class, () -> {
            throw new Exception("xxx");
        });
    }
}