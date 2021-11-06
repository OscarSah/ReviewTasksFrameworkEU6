package com.interviewTask.step_definitions;

import com.interviewTask.pages.ProductPage;
import com.interviewTask.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;

public class PurchaseStepDefs {

    ProductPage productPage = new ProductPage();
    @When("User adds the product")
    public void user_adds_the_product() {

        productPage.addButton.click();

        Alert alert = Driver.get().switchTo().alert();



    }

    @Then("Cart should have the product included")
    public void cart_should_have_the_product_included() {

    }

}
