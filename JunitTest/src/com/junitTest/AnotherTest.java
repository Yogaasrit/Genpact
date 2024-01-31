package com.junitTest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AnotherTest {
	@Test
    public void testTrue() {
        assertTrue(true);
    }

    @Test
    public void testFalse() {
        assertTrue(false);
    }
}
