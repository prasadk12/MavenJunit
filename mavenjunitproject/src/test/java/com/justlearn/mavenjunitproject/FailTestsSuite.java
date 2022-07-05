package com.justlearn.mavenjunitproject;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.fail.FailTests;
import com.regression.RegressionTests;
import com.sanity.SanityTests;

@RunWith(Categories.class)
@Categories.IncludeCategory(FailTests.class)
@Suite.SuiteClasses({CategoryTests.class, CategoryTests2.class, CategoryTests3.class})
public class FailTestsSuite {
}