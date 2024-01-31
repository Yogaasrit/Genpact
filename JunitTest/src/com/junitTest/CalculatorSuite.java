package com.junitTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({CalculatorTest.class, MathOperationsTest.class})
public class CalculatorSuite {
    // This class remains empty
}