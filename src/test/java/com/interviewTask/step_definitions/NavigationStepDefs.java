package com.interviewTask.step_definitions;

import com.interviewTask.pages.HomePage;
import com.interviewTask.pages.ProductPage;
import com.interviewTask.utilities.ConfigurationReader;
import com.interviewTask.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationStepDefs {

    HomePage homePage = new HomePage();
    ProductPage productPage = new ProductPage();

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
    public void user_should_be_able_to_see_product(String expectedProductName) {

        String actualProductName = productPage.product.getText();

        Assert.assertEquals(expectedProductName,actualProductName,"Product Name DO NOT Match");


    }
}
