package com.interviewTask.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class testingTheFrameworkStepDefs {

    @Given("User navigates to google homepage")
    public void user_navigates_to_google_homepage() {
        System.out.println("Navigating to Google Page");
    }


    @Given("Search for wooden spoon")
    public void search_for_wooden_spoon() {
        System.out.println("Searching for wooden spoon");
    }
    @Then("The results should contain wooden spoon")
    public void the_results_should_contain_wooden_spoon() {
        System.out.println("Verifying search Results");
    }


}
