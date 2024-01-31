package com.junitTest;

import org.junit.Ignore;
import org.junit.Test;


public class IgnoreTest {
	@Test
    public void testAddition() {
        int result = add(3, 4);
        assert result == 7;
    }

    @Ignore
    @Test
    public void testSubtraction() {
        int result = subtract(10, 5);
        assert result == 7;
    }

    @Test
    public void testMultiplication() {
        int result = multiply(2, 15);
        assert result == 30;
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int subtract(int a, int b) {
        return a - b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }
}
