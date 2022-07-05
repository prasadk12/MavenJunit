package com.justlearn.mavenjunitproject;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.pass.PassTests;
import com.regression.RegressionTests;
import com.sanity.SanityTests;

@RunWith(Categories.class)
@Categories.IncludeCategory(PassTests.class)
@Suite.SuiteClasses({CategoryTests.class, CategoryTests2.class, CategoryTests3.class})
public class PassTestsSuite {
}