package com.justlearn.mavenjunitproject;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	private Calculator calculator;
     @Test
     public void evaluatesExpression() {
        Calculator calculator = new Calculator();
        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
     }
     

     @Before
     public void setUp() throws Exception {
         calculator = new Calculator();
     }

     @Test
     public void testMultiply() {
         assertEquals( "Regular multiplication should work", calculator.multiply(4,5), 20);
     }

     @Test
     public void testMultiplyWithZero() {
         assertEquals("Multiple with zero should be zero",0,  calculator.multiply(0,5));
         assertEquals("Multiple with zero should be zero", 0, calculator.multiply(5,0));
     }
     @After
     public void tearDown() throws Exception
     {
    	 calculator=null;
     }
     @BeforeClass
     public static void beforeClass() throws Exception {
         System.out.println("Before class..");
     }
     
     @AfterClass
     public static void afterClass() throws Exception {
         System.out.println("After class..");
     }
     
}