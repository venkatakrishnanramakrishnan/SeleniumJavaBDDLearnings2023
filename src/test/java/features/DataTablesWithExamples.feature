Feature: Learn using Data table with Examples
  Scenario Outline: Orange HRM Smoke Test Scenario
    Given User navigates to Orange HRM Landing Page
    When User enters "<UserName>" and "<Password>" in the fields
    When User clicks the login button

    Examples:
      |UserName|Password|
      |Admin|admin123|
      |VK   | UK123  |
