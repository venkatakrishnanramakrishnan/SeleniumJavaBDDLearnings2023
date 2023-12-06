package Stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksConcept {

    @Given("The bowler has bowled an in swinger")
    public void the_bowler_has_bowled_an_in_swinger() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("The bowler has bowled an in swinger");
    }
    @When("The batsman has got his eyes in")
    public void the_batsman_has_got_his_eyes_in() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("The batsman has got his eyes in");
    }
    @Then("The batsman survives as result of well left")
    public void the_batsman_survives_as_result_of_well_left() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("The batsman survives as result of well left");
    }

    @Given("The bowler has bowled an out swinger")
    public void the_bowler_has_bowled_an_out_swinger() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("The bowler has bowled an out swinger");
    }
    @Then("The batsman is out")
    public void the_batsman_is_out() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("The batsman is out");
    }

}
