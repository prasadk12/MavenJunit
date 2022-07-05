package com.justlearn.mavenjunitproject;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.performance.PerformanceTests;

@RunWith(Categories.class)
@Categories.IncludeCategory(PerformanceTests.class)
//Include multiple categories
//@Categories.IncludeCategory({PerformanceTests.class, RegressionTests.class})
@Suite.SuiteClasses({CategoryTests.class, CategoryTests2.class, CategoryTests3.class})
public class PerformanceTestSuite {
}