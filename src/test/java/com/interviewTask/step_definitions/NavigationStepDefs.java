package com.interviewTask.step_definitions;

import com.interviewTask.pages.HomePage;
import com.interviewTask.pages.ProductPage;
import com.interviewTask.utilities.BrowserUtils;
import com.interviewTask.utilities.ConfigurationReader;
import com.interviewTask.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

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

        Assert.assertEquals("Product Name DO NOT Match", expectedProductName,actualProductName);


    }

    @When("User clicks on {string} category")
    public void userClicksOnCategory(String category) {

        homePage.getCategory(category).click();

    }

    @Then("User should be able to see all the products of that category")
    public void user_should_be_able_to_see_all_the_products_of_that_category(List<String> dataTable) {

        System.out.println("BrowserUtils.getElementsText(homePage.products) = " + BrowserUtils.getElementsText(homePage.products));


    }
}
