package com.keyin.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private static Calculator calculatorUnderTest = new Calculator();

       @Test
       public void testAdd() {

           Assertions.assertEquals(2, calculatorUnderTest.add(1, 1));

           Assertions.assertEquals(4, calculatorUnderTest.add(2, 2));

           Assertions.assertEquals(25, calculatorUnderTest.add(5, 20));

           Assertions.assertNotEquals(8, calculatorUnderTest.add(4, 5));



       }


    @Test
    public void testDifference(){

           Assertions.assertEquals(3, calculatorUnderTest.difference(10,7));

           Assertions.assertNotEquals(22, calculatorUnderTest.difference(33,10));
    }

    @Test

    public void testProduct(){

           Assertions.assertEquals(25, calculatorUnderTest.product(5,5));

           Assertions.assertEquals(36, calculatorUnderTest.product(4, 9));

           Assertions.assertNotEquals(16, calculatorUnderTest.product(3,5));
    }

    @Test

    public void testQuotient(){

           Assertions.assertEquals(11, calculatorUnderTest.quotient(99,9));

           Assertions.assertNotEquals(7, calculatorUnderTest.quotient(48,8));
    }
}
