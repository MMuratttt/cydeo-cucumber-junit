package com.cydeo.step_definitions;

import com.cydeo.pages.WebTablePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTable_StepDefinitions {

    WebTablePage webTablePage = new WebTablePage();

    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        String url = ConfigurationReader.getProperty("web.table.url");
        Driver.getDriver().get(url);
    }

    @When("user enters username {string}")
    public void userEntersUsername(String string) {

        webTablePage.inputUsername.sendKeys(string);

    }

    @And("user enters password {string}")
    public void userEntersPassword(String string) {

        webTablePage.inputPassword.sendKeys(string);

    }

    @When("user clicks to login button")
    public void user_clicks_to_login_button() {

        webTablePage.loginButton.click();

    }

    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {

        //   Assert.assertTrue(Driver.getDriver().getCurrentUrl().endsWith("orders"));
        BrowserUtils.verifyTitleContains("orders");

    }


    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String arg0, String arg1) {

        webTablePage.login(arg0, arg1);

    }

    @When("User enters below credentials")
    public void user_enters_below_credentials(Map<String, String> credentials) {
/*
        webTablePage.inputUsername.sendKeys(credentials.get("username"));
        webTablePage.inputPassword.sendKeys(credentials.get("password"));
        webTablePage.loginButton.click();
*/
        // we can call our utility method
        webTablePage.login(credentials.get("username"),credentials.get("username"));

    }


}
