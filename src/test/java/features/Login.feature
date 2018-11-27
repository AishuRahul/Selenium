Feature: Leaftaps Automation
Scenario: Login into Leaftaps

Given Launch the browser
And Load the URL
And Maximize the browser
And Set timeout
When Enter the username
And Enter the password
When Click on login button
Then Verify login is success