package com.junitTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class Runner {

    @Test
    public void testAddition() {
        int result = add(3, 4);
        assert result == 7;
    }

    @Test
    public void testSubtraction() {
        int result = subtract(10, 3);
        assert result == 7;
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int subtract(int a, int b) {
        return a - b;
    }
}
