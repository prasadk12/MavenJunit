package com.justlearn.mavenjunitproject;



import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.fail.FailTests;
import com.pass.PassTests;
import com.performance.PerformanceTests;

public class CategoryTests {
	
	@Category(PerformanceTests.class)
    @Test
    public void test_a_1() {
        System.out.println("test_a_1");
    }

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
