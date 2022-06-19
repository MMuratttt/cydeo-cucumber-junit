package com.cydeo.step_definitions;

import com.cydeo.pages.CalculatorPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalculatorStepDefs {

    @Given("User is on calculator page")
    public void user_is_on_calculator_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("calculator.url"));
    }

    @When("user cliks {string} on calculator")
    public void user_cliks_on_calculator(String string) {

        new CalculatorPage().button(string).click();


    }

    @Then("result {string} should be displayed")
    public void resultShouldBeDisplayed(String arg0) {

        String actualResult = new CalculatorPage().output.getText();
        String expectedResult = " " + arg0;

                Assert.assertEquals("Wrong calculation",expectedResult,actualResult);

    }
}
