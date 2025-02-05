package com.hema;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathOperationsTest {
    @Test
    public void testMultiply() {
        MathOperations mathOperations = new MathOperations();
        int result = mathOperations.multiply(3, 4);
        assertEquals(12,result,"3*3 should be 12");
    }

}