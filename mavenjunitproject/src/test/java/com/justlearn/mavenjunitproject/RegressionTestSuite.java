package com.justlearn.mavenjunitproject;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.regression.RegressionTests;

@RunWith(Categories.class)
@Categories.IncludeCategory(RegressionTests.class)
@Suite.SuiteClasses({CategoryTests.class, CategoryTests2.class, CategoryTests3.class})
public class RegressionTestSuite {
}