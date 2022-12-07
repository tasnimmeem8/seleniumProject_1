$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/doc.feature");
formatter.feature({
  "name": "Test Leaf test case",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "001_Login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@WIP"
    }
  ]
});
formatter.step({
  "name": "Launch browser and load URL",
  "keyword": "Given "
});
formatter.step({
  "name": "Enter UserName as \u003cusername\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Enter PassWord as \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Click login button",
  "keyword": "When "
});
formatter.step({
  "name": "Click CRMSFA link",
  "keyword": "Then "
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "DemoCSR",
        "crmsfa"
      ]
    }
  ]
});
formatter.scenario({
  "name": "001_Login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@WIP"
    }
  ]
});
formatter.step({
  "name": "Launch browser and load URL",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCase.launch_browser_and_load_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter UserName as DemoCSR",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase.enter_UserName_as_D(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter PassWord as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase.enter_PassWord_as_p(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click login button",
  "keyword": "When "
});
formatter.match({
  "location": "TestCase.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click CRMSFA link",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCase.click_CRMSFA_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase.close_browser()"
});
formatter.result({
  "status": "passed"
});
});