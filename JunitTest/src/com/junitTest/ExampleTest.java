package com.junitTest;



import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExampleTest {
	private int x;
    private int y;

    // Code to be executed once before the test class
    //step-1
    @BeforeClass
    public static void setUpClass() {
        System.out.println("BeforeClass: Setup code before the test class");
        // Initialize resources or perform setup for the entire test class
    }

    // Code to be executed once after the test class
    //step-8
    @AfterClass
    public static void tearDownClass() {
        System.out.println("AfterClass: Teardown code after the test class");
        // Clean up resources or perform teardown for the entire test class
    }

    // Code to be executed before each test method
    //step2
    //step-5
    @Before
    public void setUp() {
        System.out.println("Before: Setup code before each test method");
        // Initialize resources or perform setup specific to each test method
        x = 5;
        y = 7;
    }

    // Code to be executed after each test method
    //step-4
    //step-7
    @After
    public void tearDown() {
        System.out.println("After: Teardown code after each test method");
        // Clean up resources or perform teardown specific to each test method
    }

    //step-3
    @Test
    public void testAddition() {
        System.out.println("Test Addition");
        int result = x + y;
        // Test code for addition
        assertEquals(12, result); // Expecting the sum of 5 and 7 to be 12
    }

    //step-6
    @Test
    public void testAnotherOperation() {
        System.out.println("Test Another Operation");
        // Test code for another operation
        // Add more test methods as needed
    }
}
