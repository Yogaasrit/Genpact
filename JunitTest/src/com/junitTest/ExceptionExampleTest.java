package com.junitTest;

import org.junit.Test;

public class ExceptionExampleTest {
	@Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        // Code that should throw an ArithmeticException (division by zero)
        int result = 10 / 0;
    }

    @Test(expected = NullPointerException.class)
    public void testNullPointerException() {
        // Code that should throw a NullPointerException
        String str = null;
        int length = str.length(); // This will throw a NullPointerException
    }
}
