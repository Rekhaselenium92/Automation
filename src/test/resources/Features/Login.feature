Feature: test google search

@smoke
Scenario Outline: Google search test
Given application is launched
And user enters the <username> and <Password>
When user clicks on logon
Then user is logged in

Examples:

|Username|Password|
|Rekha123|Test@123|
