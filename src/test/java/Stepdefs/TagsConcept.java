package Stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagsConcept {

    @Given("The team has won the toss")
    public void the_team_has_won_the_toss() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside the team has won the toss.");
    }
    @When("Captain has decided to bat first")
    public void captain_has_decided_to_bat_first() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside Captain has decided to bat first.");
    }
    @Then("The two openers have to be in the middle in {int} minutes")
    public void the_two_openers_have_to_be_in_the_middle_in_minutes(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside two openers have to be in the middle in {int} minutes.");
    }
}
