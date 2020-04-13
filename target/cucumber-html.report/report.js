$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 2,
  "name": "Test Crossword login scenario",
  "description": "",
  "id": "test-crossword-login-scenario",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Test login with valid credentials",
  "description": "",
  "id": "test-crossword-login-scenario;test-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Open chrome and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter valid \"\u003cusernameNumber\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should be able to login",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "application should be closed",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "test-crossword-login-scenario;test-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "usernameNumber"
      ],
      "line": 10,
      "id": "test-crossword-login-scenario;test-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "1"
      ],
      "line": 11,
      "id": "test-crossword-login-scenario;test-login-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Test login with valid credentials",
  "description": "",
  "id": "test-crossword-login-scenario;test-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Open chrome and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter valid \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should be able to login",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "application should be closed",
  "keyword": "Then "
});
formatter.match({
  "location": "CrossWordTest.open_chrome_and_start_application()"
});
formatter.result({
  "duration": 8662096400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 15
    }
  ],
  "location": "CrossWordTest.i_enter_valid(String)"
});
formatter.result({
  "duration": 779463300,
  "status": "passed"
});
formatter.match({
  "location": "CrossWordTest.user_should_be_able_to_login()"
});
formatter.result({
  "duration": 2814368800,
  "status": "passed"
});
formatter.match({
  "location": "CrossWordTest.application_should_be_closed()"
});
formatter.result({
  "duration": 2038651900,
  "status": "passed"
});
});