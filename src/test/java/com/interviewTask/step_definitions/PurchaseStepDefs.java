package com.interviewTask.step_definitions;

import com.interviewTask.pages.HomePage;
import com.interviewTask.pages.ProductPage;
import com.interviewTask.utilities.BrowserUtils;
import com.interviewTask.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class PurchaseStepDefs {

    ProductPage productPage = new ProductPage();
    HomePage homePage = new HomePage();
    String product = NavigationStepDefs.globalNameForProduct;

    @When("User adds the product")
    public void user_adds_the_product() {

        productPage.addButton.click();

        BrowserUtils.waitFor(1);
        Alert alert = Driver.get().switchTo().alert();

        alert.accept();

    }

    @Then("Cart should have the product included")
    public void cart_should_have_the_product_included() {

        homePage.getLink("Cart").click();
        String locator = "//table//tr//td[.='" + product + "']";
        Assert.assertTrue(Driver.get().findElement(By.xpath(locator)).isDisplayed());

    }

}
