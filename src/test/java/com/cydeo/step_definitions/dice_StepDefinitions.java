package com.cydeo.step_definitions;

import com.cydeo.pages.DicePage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import javax.swing.*;

public class dice_StepDefinitions {

    DicePage dicePage = new DicePage();

    @Given("User is on dice home page")
    public void user_is_on_dice_home_page() {
        System.out.println("User is going to Dice Home Page");

        Driver.getDriver().get(ConfigurationReader.getProperty("dice.url"));

    }

    @When("User enters keyword and zipcode")
    public void user_enters_keyword_and_zipcode() {
        System.out.println("User is entering Java and 22102 zipcode and click search button");

        dicePage.keywordBox.sendKeys("Java");
        dicePage.zipcodeBox.sendKeys("22102" + Keys.ENTER);

    }

    @Then("User should see search results")
    public void user_should_see_search_results() {
        System.out.println("user is getting the result and verify");

        System.out.println("dicePage.totalJobs = " + dicePage.totalJobs.getText());

    }



}
