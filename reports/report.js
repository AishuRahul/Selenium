$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/CreateLead.feature");
formatter.feature({
  "name": "Leaftaps Automation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Creating a Lead",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Enter the company name as \u003ccname\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Enter the First Name as \u003cfirstname\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the Last Name as \u003clastname\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Select source As Cold Call",
  "keyword": "And "
});
formatter.step({
  "name": "Select marketing from Index 3",
  "keyword": "And "
});
formatter.step({
  "name": "Take a Screenshot",
  "keyword": "Then "
});
formatter.step({
  "name": "click on Create button",
  "keyword": "When "
});
formatter.step({
  "name": "verify First Name matches",
  "keyword": "Then "
});
formatter.step({
  "name": "verify Last Name Matches",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Company name matches",
  "keyword": "Then "
});
formatter.step({
  "name": "Browser is closed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "cname",
        "firstname",
        "lastname"
      ]
    },
    {
      "cells": [
        "abc",
        "Aiswarya",
        "Rahul"
      ]
    },
    {
      "cells": [
        "hcl",
        "XYZ",
        "Kumar"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Launch the browser for Create",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateLead.launchBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Load the URL for Create",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.loadURL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Maximize the browser for Create",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.maximize()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set timeout for Create",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.timeout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the username for Create",
  "keyword": "When "
});
formatter.match({
  "location": "CreateLead.typeUsername()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the password for Create",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.typePasswordforCreate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login button for Create",
  "keyword": "When "
});
formatter.match({
  "location": "CreateLead.clickLoginforCreateLead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify login is success for Create",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateLead.verifyLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on CRMS/SFA",
  "keyword": "When "
});
formatter.match({
  "location": "CreateLead.clickonCRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Leads",
  "keyword": "When "
});
formatter.match({
  "location": "CreateLead.clickLeads()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Create Lead",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.clickCreateLead()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Creating a Lead",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Enter the company name as abc",
  "keyword": "When "
});
formatter.match({
  "location": "CreateLead.typeCompanyName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the First Name as Aiswarya",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.typeFirstNameAsXYZ(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Last Name as Rahul",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.typeLastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select source As Cold Call",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.selectSource()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select marketing from Index 3",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.selectMarketing()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Take a Screenshot",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateLead.takeSnapshot()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Create button",
  "keyword": "When "
});
formatter.match({
  "location": "CreateLead.clickCreate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify First Name matches",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateLead.verifyFirstName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify Last Name Matches",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateLead.verifyLastName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Company name matches",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateLead.verifyComapanyName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Browser is closed",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateLead.closeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Launch the browser for Create",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateLead.launchBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Load the URL for Create",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.loadURL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Maximize the browser for Create",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.maximize()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set timeout for Create",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.timeout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the username for Create",
  "keyword": "When "
});
formatter.match({
  "location": "CreateLead.typeUsername()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the password for Create",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.typePasswordforCreate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login button for Create",
  "keyword": "When "
});
formatter.match({
  "location": "CreateLead.clickLoginforCreateLead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify login is success for Create",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateLead.verifyLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on CRMS/SFA",
  "keyword": "When "
});
formatter.match({
  "location": "CreateLead.clickonCRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Leads",
  "keyword": "When "
});
formatter.match({
  "location": "CreateLead.clickLeads()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Create Lead",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.clickCreateLead()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Creating a Lead",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Enter the company name as hcl",
  "keyword": "When "
});
formatter.match({
  "location": "CreateLead.typeCompanyName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the First Name as XYZ",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.typeFirstNameAsXYZ(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Last Name as Kumar",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.typeLastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select source As Cold Call",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.selectSource()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select marketing from Index 3",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.selectMarketing()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Take a Screenshot",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateLead.takeSnapshot()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Create button",
  "keyword": "When "
});
formatter.match({
  "location": "CreateLead.clickCreate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify First Name matches",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateLead.verifyFirstName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify Last Name Matches",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateLead.verifyLastName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Company name matches",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateLead.verifyComapanyName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Browser is closed",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateLead.closeBrowser()"
});
formatter.result({
  "status": "passed"
});
});