Feature: Login to App

@smoke
Scenario: Check login with credentials
Given user enters username and password
When user clicks on Login button
Then user is navigated to the home page

