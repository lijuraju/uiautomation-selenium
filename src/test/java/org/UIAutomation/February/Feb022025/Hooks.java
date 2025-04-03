package org.UIAutomation.February.Feb022025;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.testng.annotations.Test;

public class Hooks {

@Test
    public void testWindowHandles(){



    }
        @Before
        public void setUp() {
            System.out.println("Setting up the test environment (e.g., WebDriver)");
            // Initialize WebDriver, etc.
        }

        @After
        public void tearDown () {
            System.out.println("Tearing down the test environment (e.g., close WebDriver)");
            // Close WebDriver, etc.
        }



        @BeforeStep
        public void beforeEveryStep () {
            System.out.println("About to execute a step");
        }

        @AfterStep
        public void afterEveryStep () {
            System.out.println("Executed a step");
        }
    }



