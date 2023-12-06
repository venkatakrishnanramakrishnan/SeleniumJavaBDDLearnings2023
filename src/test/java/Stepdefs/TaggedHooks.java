package Stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaggedHooks {

    @Given("this is the first step")
    public void this_is_the_first_step() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("first step in first scenario.");
    }
    @When("this is the second step")
    public void this_is_the_second_step() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("second step in first scenario.");
    }
    @Then("this is the third step")
    public void this_is_the_third_step() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("third step in first scenario.");
    }

    @Given("this is the first step in second scenario")
    public void this_is_the_first_step_in_second_Scenario() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("first step in second scenario.");
    }
    @When("this is the second step in second scenario")
    public void this_is_the_second_step_in_second_Scenario() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("second step in second scenario.");
    }
    @Then("this is the third step in second scenario")
    public void this_is_the_third_step_in_second_Scenario() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("third step in second scenario.");
    }

    @Given("this is the first step in third scenario")
    public void this_is_the_first_step_in_third_Scenario() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("first step in third scenario.");
    }
    @When("this is the second step in third scenario")
    public void this_is_the_second_step_in_third_Scenario() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("2nd step in third scenario.");
    }
    @Then("this is the third step in third scenario")
    public void this_is_the_third_step_in_third_Scenario() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("3rd step in third scenario.");

    }


}
