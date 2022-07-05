package com.justlearn.mavenjunitproject;


import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.fail.FailTests;
import com.pass.PassTests;
import com.regression.RegressionTests;

@Category(RegressionTests.class)
public class CategoryTests2 {
	

    @Test
    public void test_a_1() {
        System.out.println("test_a_1");
    }
    @Category(RegressionTests.class)
    @Test
    public void test_a_2() {
    	System.out.println("test_a_2");
    }
    
    @Category(PassTests.class)
    @Test
    public void test_pass_1() {
        System.out.println("test_pass_1");
    }
    @Category(FailTests.class)
    @Test
    public void test_fail_1() {
        System.out.println("test_fail_1");
    }

}
