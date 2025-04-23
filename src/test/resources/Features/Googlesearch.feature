Feature: test google search

Scenario: Google search test
Given browser is launched
And user enters the text on searchbox
When user hits enter
Then Search results are displayed