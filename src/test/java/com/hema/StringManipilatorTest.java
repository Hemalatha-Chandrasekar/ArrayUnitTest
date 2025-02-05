package com.hema;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipilatorTest {

    @Test
    void reverse() {
        StringManipilator manipulator = new StringManipilator();
        String result=manipulator.reverse("hello");
        assertEquals("olleh",result,"The reverse string should be ooeh");

    }
}