
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleAreaTest {

    @Test
    void testRadiusFive() {
        assertEquals(78.5398,
            CircleArea.calculateArea(5), 0.001);
    }

    @Test
    void testRadiusOne() {
        assertEquals(Math.PI,
            CircleArea.calculateArea(1), 0.001);
    }

    @Test
    void testRadiusZero() {
        assertEquals(0.0,
            CircleArea.calculateArea(0), 0.001);
    }

    @Test
    void testNegativeRadius() {
        assertThrows(IllegalArgumentException.class,
            () -> CircleArea.calculateArea(-5));
    }
}

