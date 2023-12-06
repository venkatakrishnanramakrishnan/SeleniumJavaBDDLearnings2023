@tea
Feature: Learn using Data table
Scenario: Orange HRM Smoke Test Scenario
  Given User navigates to Orange HRM Landing Page
  When User enters login details
  |User|Password|
  |Admin|admin123|
  |VK   | UK123  |

  When User clicks the login button
  #When User Reads TestData

