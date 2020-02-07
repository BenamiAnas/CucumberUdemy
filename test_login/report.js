$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test2.feature");
formatter.feature({
  "line": 1,
  "name": "Test LOGIN 2",
  "description": "",
  "id": "test-login-2",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3375818155,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Login with Scenario outline 22",
  "description": "",
  "id": "test-login-2;login-with-scenario-outline-22",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Groupe2"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Im in the home page",
  "rows": [
    {
      "cells": [
        "http://webdriveruniversity.com/"
      ],
      "line": 6
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click the login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter my username",
  "rows": [
    {
      "cells": [
        "\"webdriver2\""
      ],
      "line": 9
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter my password",
  "rows": [
    {
      "cells": [
        "\"webdriver2\""
      ],
      "line": 11
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter the submite button",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Groupe.im_in_the_home_page(DataTable)"
});
formatter.result({
  "duration": 1594434259,
  "status": "passed"
});
formatter.match({
  "location": "Login_Groupe.i_click_the_login_button()"
});
formatter.result({
  "duration": 168585335,
  "status": "passed"
});
formatter.match({
  "location": "Login_Groupe.i_enter_their_webdriver_username(DataTable)"
});
formatter.result({
  "duration": 1240290873,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[WebDriver | Login Portal]\u003e but was:\u003c[hello]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat DriverFactory.StepDef.Login_Groupe.i_enter_their_webdriver_username(Login_Groupe.java:50)\r\n\tat ✽.And I enter my username(Test2.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Login_Groupe.i_enter_their_webdriver_password(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login_Groupe.i_enter_the_submite_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1168791036,
  "status": "passed"
});
});