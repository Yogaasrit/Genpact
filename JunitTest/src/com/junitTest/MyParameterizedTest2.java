package com.junitTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MyParameterizedTest2 {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, true},
                {2, false},
                {3, true}
        });
    }

    private int input;
    private boolean expected;

    public MyParameterizedTest2(int input, boolean expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void myParameterizedTest() {
        assertEquals(expected, myMethodUnderTest(input));
    }

    // This is just a placeholder method; replace it with your actual method under test
    private boolean myMethodUnderTest(int input) {
        // Replace this logic with your actual implementation
        //return input % 2 == 0;
    	return input % 2 != 0;
    }
}
