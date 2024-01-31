package com.junitTest;



import static org.junit.Assert.assertEquals;

import org.junit.Test; 

public class MathOperationsTest {  
	@Test
    public void testAdd() {
        MathOperations math = new MathOperations();
        int result = math.add(3, 5);
        assertEquals(8, result);
    }
}
