package com.justlearn.mavenjunitproject;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.fail.FailTests;
import com.regression.RegressionTests;
import com.sanity.SanityTests;

@RunWith(Categories.class)
@Categories.IncludeCategory(FailTests.class)
@Suite.SuiteClasses({Category1Test.class, Category2Test.class, Category3Test.class})
public class FailTestsSuite {
}