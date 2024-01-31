package com.junitTest;

import org.junit.Test;

public class TimeoutExampleTest {
/**
 * setting a timeout is useful for preventing tests
 *  from running indefinitely and hanging. 
 *  It's essential to choose an appropriate timeout
 *  value based on the expected execution 
 * time of the test method
 * 
 */
	
	
    // Timeout in milliseconds
    @Test(timeout = 1000)
    public void testMethodWithTimeout() {
        // Code that should complete within 1 second
       // System.out.println("Executing testMethodWithTimeout...");
        long startTime = System.currentTimeMillis();

        // Simulate a time-consuming operation
        while (System.currentTimeMillis() - startTime < 2000) {
            // Loop for 2 seconds (this would exceed the timeout)
        }
    }

    // Timeout using Timeout rule (this allows specifying timeout in seconds)
    @Test
    public void testMethodWithTimeoutRule() {
        // Code that should complete within 2 seconds
        System.out.println("Executing testMethodWithTimeoutRule...");
        long startTime = System.currentTimeMillis();

        // Simulate a time-consuming operation
        while (System.currentTimeMillis() - startTime < 3000) {
            // Loop for 3 seconds (this would exceed the timeout)
        }
    }
}
