package com.keyin.rectangle;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class rectangleTest {

    private static rectangle rectangleUnderTest = new rectangle();



    @Test
       public void testArea() {

        Assertions.assertEquals(200, rectangleUnderTest.area(20, 10));

        Assertions.assertNotEquals(300, rectangleUnderTest.area(20, 10));

    }

    @Test
        public void testPerimeter() {

        Assertions.assertEquals(60, rectangleUnderTest.perimeter(20, 10));

        Assertions.assertNotEquals(80, rectangleUnderTest.perimeter(20, 10));

    }

    @Test
        public void testLength(){

        Assertions.assertTrue(rectangleUnderTest.length(20));

    }

    @Test
        public void testWidth(){

        Assertions.assertFalse(rectangleUnderTest.width(10));
    }

}
