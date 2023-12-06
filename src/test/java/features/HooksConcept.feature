@test2
Feature: Hooks Notes
  @onlyFirst
  Scenario: In swinger
    Given The bowler has bowled an in swinger
    When The batsman has got his eyes in
    Then The batsman survives as result of well left

  Scenario: Out Swinger
    Given The bowler has bowled an out swinger
    When The batsman has got his eyes in
    Then The batsman is out
