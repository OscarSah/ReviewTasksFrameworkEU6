package com.interviewTask.step_definitions;

import com.interviewTask.pages.HomePage;
import com.interviewTask.utilities.ConfigurationReader;
import com.interviewTask.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationStepDefs {

    HomePage homePage = new HomePage();

    @Given("User is on the Home Page")
    public void user_is_on_the_Home_Page() {

      //  String url = ConfigurationReader.get("url");

        Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("User navigates to {string} in {string} category")
    public void user_navigates_to_in_category(String product, String category) {
        homePage.getCategory(category).click();
        homePage.getProduct(product).click();

    }

    @Then("User should be able to see {string} product")
    public void user_should_be_able_to_see_product(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
