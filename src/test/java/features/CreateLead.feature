Feature: Leaftaps Automation
Background:
Given Launch the browser for Create
And Load the URL for Create
And Maximize the browser for Create
And Set timeout for Create
When Enter the username for Create
And Enter the password for Create
When Click on login button for Create
Then Verify login is success for Create
When Click on CRMS/SFA
When Click on Leads 
And Click on Create Lead

Scenario Outline: Creating a Lead

When Enter the company name as <cname>
And Enter the First Name as <firstname>
And Enter the Last Name as <lastname>
And Select source As Cold Call
And Select marketing from Index 3
Then Take a Screenshot
When click on Create button
Then verify First Name matches
Then verify Last Name Matches
Then Verify Company name matches
Then Browser is closed

Examples:
|cname|firstname|lastname|
|abc|Aiswarya|Rahul|
|hcl|XYZ|Kumar|











